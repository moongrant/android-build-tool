package com.yalla.yalla.ui.activity;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.base.activity.BaseActivity;
import com.weieyu.yalla.R;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p502o0o00o0.o0000O;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Lcom/app/base/base/activity/BaseActivity;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public abstract class BaseActivityK extends BaseActivity {

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public long f21685OoooOo0 = 700;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @Nullable
    public o0000O f21686OoooOoO;

    public static /* synthetic */ void OooOoo0(BaseActivityK baseActivityK, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = o000O0O0.OooO0OO(R.string.loading);
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        baseActivityK.OooOoOO(str, j);
    }

    public final void OooOoO() {
        o0000O o0000o2 = this.f21686OoooOoO;
        if (o0000o2 != null) {
            o0000o2.dismiss();
        }
    }

    public final void OooOoOO(@Nullable String str, long j) {
        if (this.f21686OoooOoO == null) {
            this.f21686OoooOoO = new o0000O(this);
        }
        o0000O o0000o2 = this.f21686OoooOoO;
        if (o0000o2 != null) {
            o0000o2.OooO0o(str, j);
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        o0000O o0000o2 = this.f21686OoooOoO;
        if (o0000o2 != null) {
            o0000o2.dismiss();
        }
        this.f21686OoooOoO = null;
    }
}
