package com.yalla.yalla.ui.activity.user;

import android.os.Bundle;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.view.HeaderLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.BaseActivityK;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p522o0o0O0o.oo0o0O0;
import p566o0oOo00O.o000000;
import p649o0ooOOoo.w6;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/AristocracyPresentationActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class AristocracyPresentationActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public static final /* synthetic */ int f23281Ooooo00 = 0;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f23282OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(w6.class), this, null);

    public final w6 OooOoo() {
        return (w6) this.f23282OoooOoo.getValue();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f50830OooO00o);
        String strOooO0OO = o000O0O0.OooO0OO(R.string.aristocracy_desc_add_subscriptions_tag);
        OooOoo().f50831OooO0O0.setText(o000O0O0.OooO0OO(R.string.aristocracy_desc_add_subscriptions));
        OooOoo().f50831OooO0O0.setOnClickListener(new o000000(this, 0));
        TextView textView = OooOoo().f50831OooO0O0;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.addSubscriptions");
        oo0o0O0.OooO0o0(textView, new String[]{strOooO0OO}, o000O0O0.OooO00o(R.color.color_00d8c9));
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            headerLayout.setTitle(R.string.Aristocracy_FAQ);
        }
    }
}
