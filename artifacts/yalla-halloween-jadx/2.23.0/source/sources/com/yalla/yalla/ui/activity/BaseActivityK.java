package com.yalla.yalla.ui.activity;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import p519o0o0O0oO.oO00O0oO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Lcom/yalla/yalla/base/activity/BaseFragmentActivity;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public abstract class BaseActivityK extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public oO00O0oO f25137OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final long f25138OooOOo0 = 700;

    public static /* synthetic */ void OooOo0o(BaseActivityK baseActivityK, String str, long j, int i) {
        if ((i & 1) != 0) {
            str = o0000.OooO0OO(oO00OOo0.loading);
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        baseActivityK.OooOo0O(j, str);
    }

    public final void OooOo0() {
        oO00O0oO oo00o0oo = this.f25137OooOOo;
        if (oo00o0oo != null) {
            oo00o0oo.dismiss();
        }
    }

    public final void OooOo0O(long j, @Nullable String str) {
        if (this.f25137OooOOo == null) {
            this.f25137OooOOo = new oO00O0oO(this);
        }
        oO00O0oO oo00o0oo = this.f25137OooOOo;
        if (oo00o0oo != null) {
            oo00o0oo.OooO0o0(j, str);
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        oO00O0oO oo00o0oo = this.f25137OooOOo;
        if (oo00o0oo != null) {
            oo00o0oo.dismiss();
        }
        this.f25137OooOOo = null;
    }
}
