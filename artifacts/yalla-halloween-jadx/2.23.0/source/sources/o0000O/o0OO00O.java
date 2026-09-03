package o0000O;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Object f34019OooO00o;

    @RequiresApi(16)
    public static class OooO00o extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0OO00O f34020OooO00o;

        public OooO00o(o0OO00O o0oo00o2) {
            this.f34020OooO00o = o0oo00o2;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            o0Oo0oo o0oo0ooOooO00o = this.f34020OooO00o.OooO00o(i);
            if (o0oo0ooOooO00o == null) {
                return null;
            }
            return o0oo0ooOooO00o.f34022OooO00o;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            this.f34020OooO00o.getClass();
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int i, int i2, Bundle bundle) {
            return this.f34020OooO00o.OooO0OO(i, i2, bundle);
        }
    }

    @RequiresApi(19)
    public static class OooO0O0 extends OooO00o {
        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo findFocus(int i) {
            o0Oo0oo o0oo0ooOooO0O0 = this.f34020OooO00o.OooO0O0(i);
            if (o0oo0ooOooO0O0 == null) {
                return null;
            }
            return o0oo0ooOooO0O0.f34022OooO00o;
        }
    }

    @RequiresApi(26)
    public static class OooO0OO extends OooO0O0 {
        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f34020OooO00o.getClass();
        }
    }

    public o0OO00O() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f34019OooO00o = new OooO0OO(this);
        } else {
            this.f34019OooO00o = new OooO0O0(this);
        }
    }

    @Nullable
    public o0Oo0oo OooO00o(int i) {
        return null;
    }

    @Nullable
    public o0Oo0oo OooO0O0(int i) {
        return null;
    }

    public boolean OooO0OO(int i, int i2, @Nullable Bundle bundle) {
        return false;
    }

    public o0OO00O(@Nullable AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f34019OooO00o = accessibilityNodeProvider;
    }
}
