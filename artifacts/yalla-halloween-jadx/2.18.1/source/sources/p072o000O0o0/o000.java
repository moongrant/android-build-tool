package p072o000O0o0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class o000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Object f28190OooO00o;

    @RequiresApi(16)
    public static class OooO00o extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000 f28191OooO00o;

        public OooO00o(o000 o000Var) {
            this.f28191OooO00o = o000Var;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            o0000OO0 o0000oo0OooO00o = this.f28191OooO00o.OooO00o(i);
            if (o0000oo0OooO00o == null) {
                return null;
            }
            return o0000oo0OooO00o.f28194OooO00o;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            Objects.requireNonNull(this.f28191OooO00o);
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int i, int i2, Bundle bundle) {
            return this.f28191OooO00o.OooO0OO(i, i2, bundle);
        }
    }

    @RequiresApi(19)
    public static class OooO0O0 extends OooO00o {
        public OooO0O0(o000 o000Var) {
            super(o000Var);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo findFocus(int i) {
            o0000OO0 o0000oo0OooO0O0 = this.f28191OooO00o.OooO0O0(i);
            if (o0000oo0OooO0O0 == null) {
                return null;
            }
            return o0000oo0OooO0O0.f28194OooO00o;
        }
    }

    @RequiresApi(26)
    public static class OooO0OO extends OooO0O0 {
        public OooO0OO(o000 o000Var) {
            super(o000Var);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            Objects.requireNonNull(this.f28191OooO00o);
        }
    }

    public o000() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f28190OooO00o = new OooO0OO(this);
        } else {
            this.f28190OooO00o = new OooO0O0(this);
        }
    }

    @Nullable
    public o0000OO0 OooO00o(int i) {
        return null;
    }

    @Nullable
    public o0000OO0 OooO0O0(int i) {
        return null;
    }

    public boolean OooO0OO(int i, int i2, @Nullable Bundle bundle) {
        return false;
    }

    public o000(@Nullable Object obj) {
        this.f28190OooO00o = obj;
    }
}
