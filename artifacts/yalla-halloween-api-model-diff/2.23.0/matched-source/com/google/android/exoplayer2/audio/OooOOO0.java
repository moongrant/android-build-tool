package com.google.android.exoplayer2.audio;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooOOO0 implements DefaultAudioSink.OooO0o {

    public static class OooO00o {
    }

    public OooOOO0(OooO00o oooO00o) {
    }

    public static int OooO00o(int i) {
        switch (i) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            case 19:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            case 20:
                return 63750;
        }
    }
}
