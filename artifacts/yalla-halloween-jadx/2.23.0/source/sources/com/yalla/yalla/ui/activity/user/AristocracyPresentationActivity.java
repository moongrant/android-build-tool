package com.yalla.yalla.ui.activity.user;

import android.os.Bundle;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.code.android.util.o000O0Oo;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.HeaderLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p358o0OOOooO.o0000oo;
import p417o0OoO0.o000O0o;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p641o0ooOOOO.g0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/AristocracyPresentationActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAristocracyPresentationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AristocracyPresentationActivity.kt\ncom/yalla/yalla/ui/activity/user/AristocracyPresentationActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,34:1\n22#2,2:35\n*S KotlinDebug\n*F\n+ 1 AristocracyPresentationActivity.kt\ncom/yalla/yalla/ui/activity/user/AristocracyPresentationActivity\n*L\n19#1:35,2\n*E\n"})
public final class AristocracyPresentationActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final /* synthetic */ int f27068OooOo00 = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f27069OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(g0.class), this, null);

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        o000O0Oo o000o0oo2 = this.f27069OooOOoo;
        setContentView(((g0) o000o0oo2.getValue()).f57948OooO00o);
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.aristocracy_desc_add_subscriptions_tag);
        ((g0) o000o0oo2.getValue()).f57949OooO0O0.setText(o0000.OooO0OO(oO00OOo0.aristocracy_desc_add_subscriptions));
        ((g0) o000o0oo2.getValue()).f57949OooO0O0.setOnClickListener(new o0000oo(this, 1));
        TextView textView = ((g0) o000o0oo2.getValue()).f57949OooO0O0;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.addSubscriptions");
        o000O0o.OooO0Oo(textView, o0000.OooO00o(oO00O0o.color_00d8c9), strOooO0OO);
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(oO00OOo0.Aristocracy_FAQ);
        }
    }
}
