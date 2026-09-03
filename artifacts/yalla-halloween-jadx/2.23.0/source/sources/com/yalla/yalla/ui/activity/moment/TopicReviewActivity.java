package com.yalla.yalla.ui.activity.moment;

import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.code.android.util.o000O0Oo;
import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.HeaderLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p485o0o00O0.oOOO0OOO;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.j6;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/TopicReviewActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTopicReviewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicReviewActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicReviewActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,42:1\n22#2,2:43\n*S KotlinDebug\n*F\n+ 1 TopicReviewActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicReviewActivity\n*L\n15#1:43,2\n*E\n"})
public final class TopicReviewActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final /* synthetic */ int f26396OooOo00 = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f26397OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(j6.class), this, null);

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        o000O0Oo o000o0oo2 = this.f26397OooOOoo;
        setContentView(((j6) o000o0oo2.getValue()).f58176OooO00o);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        p370o0OOoO.OooOOO0.OooO0OO(window, 0);
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout != null) {
            headerLayout.setNavigationIcon(oOo00OO0.btn_return_black);
            headerLayout.setTitleTextColor(o0000.OooO00o(oO00O0o.color_alpha_87));
            headerLayout.setTitle(oO00OOo0.Create_Topic);
            headerLayout.setBackgroundColor(o0000.OooO00o(oO00O0o.transparent));
        }
        Button button = ((j6) o000o0oo2.getValue()).f58177OooO0O0;
        Intrinsics.checkNotNullExpressionValue(button, "binding.btDone");
        o000OO00.OooO(button, new oOOO0OOO(this));
    }
}
