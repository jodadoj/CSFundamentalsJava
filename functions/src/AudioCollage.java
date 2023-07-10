public class AudioCollage {

    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        double[] amplified = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            amplified[i] = alpha * a[i];
        }
        return amplified;
    }

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {
        double[] reversed = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            reversed[i] = a[a.length - i - 1];
        }
        return reversed;
    }

    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        double[] merged = new double[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            merged[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            merged[i + a.length] = b[i];
        }
        return merged;
    }

    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {
        int size = Math.max(a.length, b.length);
        double[] mixed = new double[size];
        if (a.length == b.length) {
            for (int i = 0; i < size; i++) {
                mixed[i] = a[i] + b[i];
            }
            return mixed;
        }
        if (a.length == size) {
            for (int i = 0; i < b.length; i++) {
                mixed[i] = a[i] + b[i];
            }
            for (int i = 0; i < size - b.length; i++) {
                mixed[b.length + i] = a[b.length + i];
            }
        } else {
            for (int i = 0; i < a.length; i++) {
                mixed[i] = a[i] + b[i];
            }
            for (int i = 0; i < size - a.length; i++) {
                mixed[a.length + i] = b[a.length + i];
            }
        }
        return mixed;
    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {
        double[] newSpeed = new double[(int) Math.round((double) a.length / alpha)];
        int count = 0;
        for (int i = 0; i < newSpeed.length; i++) {
            count = Math.min(a.length-1, (int) Math.round(i * alpha));
            newSpeed[i] = a[count];
        }
        return newSpeed;
    }

    // Creates an audio collage and plays it on standard audio.
    // See below for the requirements.
    public static void main(String[] args) {
        double[] beatbox = StdAudio.read("beatbox.wav");
        double[] buzzer = StdAudio.read("buzzer.wav");
        double[] chimes = StdAudio.read("chimes.wav");
        double[] cow = StdAudio.read("cow.wav");
        double[] dialup = StdAudio.read("dialup.wav");
        double[] exposure = StdAudio.read("exposure.wav");
        double[] harp = StdAudio.read("harp.wav");
        double[] piano = StdAudio.read("piano.wav");
        double[] scratch = StdAudio.read("scratch.wav");
        double[] singer = StdAudio.read("singer.wav");

        double [] sample = StdAudio.read("harp.wav");

        buzzer = amplify(buzzer, 0.8);
        dialup = reverse(dialup);
        sample = mix(sample, singer);
        scratch = reverse(scratch);
        cow = merge(buzzer, cow);
        sample = mix(sample, cow);
        sample = mix(sample, dialup);
        harp = amplify(harp, 1.2);
        beatbox = merge(chimes, beatbox);
        beatbox = changeSpeed(beatbox, 0.7);
        sample = mix(sample, beatbox);
        piano = merge(exposure, piano);
        sample = mix(sample, piano);
        sample = mix(sample, scratch);
        sample = amplify(sample, 0.5);

        StdAudio.play(mix(harp, sample));

//        StdAudio.play(changeSpeed(singer, 0.5));

//        The functions must not mutate the argument array(s).
//
//        You may assume that the array arguments are not null and that α>0
//          in changeSpeed().
//
//        The main() method must create an audio collage and play it using StdAudio.play().
//
//        Do not use any command-line arguments.
//
//        The duration must be between 10 and 60 seconds (441,000 to 2,646,000 samples).
//
//        All samples sent to standard audio must be between –1 and +1.
//
//        It must use at least five different WAV files. Several WAV files are provided:
//        beatbox.wav, buzzer.wav, chimes.wav, cow.wav, dialup.wav, exposure.wav, harp.wav,
//        piano.wav, scratch.wav, silence.wav, and singer.wav. You may also supply or create your own.
//
//        Use StdAudio.read() to read a WAV file and extract its samples as an array of
//        floating-point numbers between –1 and +1.
//
//        It must use all of the audio effects specified in the API (amplify, reverse,
//        merge, mix, and change speed). Feel free to add additional audio effects (see the FAQ for some ideas).
//
//        Be creative!


    }
}
