package p016OooOoO0;

import android.support.v4.media.OooO00o;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o000O0o;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOo00 {
    public static final void OooO00o(int i, View view) {
        int[] iArr = o000O0o.OooO00o.f8490OooO00o;
        if (i == 0) {
            throw null;
        }
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (FragmentManager.Oooo0oO(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (i2 == 2) {
            if (FragmentManager.Oooo0oO(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (i2 == 3) {
            if (FragmentManager.Oooo0oO(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (i2 != 4) {
            return;
        }
        if (FragmentManager.Oooo0oO(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static int OooO0O0(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 8) {
            return 3;
        }
        throw new IllegalArgumentException(OooO00o.OooO00o("Unknown visibility ", i));
    }

    public static int OooO0OO(View view) {
        if (view.getAlpha() == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && view.getVisibility() == 0) {
            return 4;
        }
        return OooO0O0(view.getVisibility());
    }

    public static String OooO0Oo(String str, String str2) {
        return str + str2;
    }

    public static /* synthetic */ String OooO0o0(int i) {
        if (i == 1) {
            return "REMOVED";
        }
        if (i == 2) {
            return "VISIBLE";
        }
        if (i == 3) {
            return "GONE";
        }
        return i == 4 ? "INVISIBLE" : "null";
    }
}
