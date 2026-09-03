package com.yalla.yalla.ui.activity.main;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O0Oo;
import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.NumberSize;
import com.yalla.yalla.ui.view.ScrollableViews;
import com.yalla.yalla.ui.view.SwitchView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p486o0o00O00.o0;
import p486o0o00O00.o0O000;
import p486o0o00O00.o0O00000;
import p486o0o00O00.o0O0000O;
import p486o0o00O00.o0O000O;
import p486o0o00O00.o0O000Oo;
import p486o0o00O00.o0O0o;
import p486o0o00O00.o0OoOoOo;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.v3;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/TestActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTestActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestActivity.kt\ncom/yalla/yalla/ui/activity/main/TestActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,195:1\n22#2,2:196\n*S KotlinDebug\n*F\n+ 1 TestActivity.kt\ncom/yalla/yalla/ui/activity/main/TestActivity\n*L\n19#1:196,2\n*E\n"})
public final class TestActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f25563OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(v3.class), this, null);

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f25564OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f25565OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f25566OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f25567OooOo0o;

    public final v3 OooOo() {
        return (v3) this.f25563OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f59038OooO00o);
        OooOo00("Test");
        OooOOo0(1);
        SwitchView switchView = OooOo().f59042OooO0o;
        switchView.setResIdBgSelect(oOo00OO0.bg_ffffffff_r360);
        switchView.setCurrentSelectAnimation(true);
        Intrinsics.checkNotNullExpressionValue(switchView, "this");
        ArrayList arrayList = new ArrayList();
        arrayList.add("青龙");
        arrayList.add("白虎朱雀");
        arrayList.add("玄武");
        arrayList.add("一二三");
        arrayList.add("四五六七");
        SwitchView.OooO0Oo(switchView, arrayList);
        ScrollableViews initView$lambda$2 = OooOo().f59040OooO0OO;
        Intrinsics.checkNotNullExpressionValue(initView$lambda$2, "initView$lambda$2");
        o000OO00.OooO0oo(initView$lambda$2, new o0O0o(this, initView$lambda$2));
        initView$lambda$2.setSize(NumberSize.Size.M);
        initView$lambda$2.setDelay(50L);
        initView$lambda$2.setNumMinCount(3);
        initView$lambda$2.setScrollFinishListener(new o0(initView$lambda$2));
        ScrollableViews.OooO00o(initView$lambda$2, 0);
        ScrollableViews initView$lambda$3 = OooOo().f59039OooO0O0;
        Intrinsics.checkNotNullExpressionValue(initView$lambda$3, "initView$lambda$3");
        o000OO00.OooO0oo(initView$lambda$3, new o0O00000(this, initView$lambda$3));
        initView$lambda$3.setSize(NumberSize.Size.H);
        initView$lambda$3.setDelay(50L);
        initView$lambda$3.setNumMinCount(2);
        initView$lambda$3.setScrollFinishListener(new o0O0000O(initView$lambda$3));
        ScrollableViews.OooO00o(initView$lambda$3, 0);
        ScrollableViews initView$lambda$4 = OooOo().f59041OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(initView$lambda$4, "initView$lambda$4");
        o000OO00.OooO0oo(initView$lambda$4, new o0O000(this, initView$lambda$4));
        initView$lambda$4.setSize(NumberSize.Size.X);
        initView$lambda$4.setDelay(50L);
        initView$lambda$4.setNumMinCount(3);
        initView$lambda$4.setScrollFinishListener(new o0O000O(initView$lambda$4));
        ScrollableViews.OooO00o(initView$lambda$4, 0);
        ScrollableViews initView$lambda$5 = OooOo().f59043OooO0o0;
        Intrinsics.checkNotNullExpressionValue(initView$lambda$5, "initView$lambda$5");
        o000OO00.OooO0oo(initView$lambda$5, new o0OoOoOo(this, initView$lambda$5));
        initView$lambda$5.setSize(NumberSize.Size.XX);
        initView$lambda$5.setDelay(50L);
        initView$lambda$5.setNumMinCount(3);
        initView$lambda$5.setScrollFinishListener(new o0O000Oo(initView$lambda$5));
        ScrollableViews.OooO00o(initView$lambda$5, 0);
    }
}
