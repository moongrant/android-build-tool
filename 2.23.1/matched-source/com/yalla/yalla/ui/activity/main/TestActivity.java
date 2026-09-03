package com.yalla.yalla.ui.activity.main;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O;
import com.code.android.util.o000O0;
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
import p407o0Oo0OOO.oO0o0o;
import p492o0o00O0O.o0;
import p492o0o00O0O.o0O000;
import p492o0o00O0O.o0O00000;
import p492o0o00O0O.o0O0000O;
import p492o0o00O0O.o0O000O;
import p492o0o00O0O.o0O0o;
import p492o0o00O0O.o0OoOoOo;
import p492o0o00O0O.o0oOOo;
import p565o0oOo000.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/TestActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTestActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestActivity.kt\ncom/yalla/yalla/ui/activity/main/TestActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,195:1\n22#2,2:196\n*S KotlinDebug\n*F\n+ 1 TestActivity.kt\ncom/yalla/yalla/ui/activity/main/TestActivity\n*L\n19#1:196,2\n*E\n"})
public final class TestActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f25110OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(oO0o0o.class), this, null);

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f25111OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f25112OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f25113OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f25114OooOo0o;

    public final oO0o0o OooOo() {
        return (oO0o0o) this.f25110OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f45017OooO00o);
        OooOo00("Test");
        OooOOo0(1);
        SwitchView switchView = OooOo().f45021OooO0o;
        switchView.setResIdBgSelect(o0OOO0o.bg_ffffffff_r360);
        switchView.setCurrentSelectAnimation(true);
        Intrinsics.checkNotNull(switchView);
        ArrayList arrayList = new ArrayList();
        arrayList.add("青龙");
        arrayList.add("白虎朱雀");
        arrayList.add("玄武");
        arrayList.add("一二三");
        arrayList.add("四五六七");
        SwitchView.OooO0Oo(switchView, arrayList);
        ScrollableViews scrollableViews = OooOo().f45019OooO0OO;
        Intrinsics.checkNotNull(scrollableViews);
        o000O.OooO0oo(scrollableViews, new o0oOOo(this, scrollableViews));
        scrollableViews.setSize(NumberSize.Size.M);
        scrollableViews.setDelay(50L);
        scrollableViews.setNumMinCount(3);
        scrollableViews.setScrollFinishListener(new o0O0o(scrollableViews));
        ScrollableViews.OooO00o(scrollableViews, 0);
        ScrollableViews scrollableViews2 = OooOo().f45018OooO0O0;
        Intrinsics.checkNotNull(scrollableViews2);
        o000O.OooO0oo(scrollableViews2, new o0(this, scrollableViews2));
        scrollableViews2.setSize(NumberSize.Size.H);
        scrollableViews2.setDelay(50L);
        scrollableViews2.setNumMinCount(2);
        scrollableViews2.setScrollFinishListener(new o0O00000(scrollableViews2));
        ScrollableViews.OooO00o(scrollableViews2, 0);
        ScrollableViews scrollableViews3 = OooOo().f45020OooO0Oo;
        Intrinsics.checkNotNull(scrollableViews3);
        o000O.OooO0oo(scrollableViews3, new o0O0000O(this, scrollableViews3));
        scrollableViews3.setSize(NumberSize.Size.X);
        scrollableViews3.setDelay(50L);
        scrollableViews3.setNumMinCount(3);
        scrollableViews3.setScrollFinishListener(new o0O000(scrollableViews3));
        ScrollableViews.OooO00o(scrollableViews3, 0);
        ScrollableViews scrollableViews4 = OooOo().f45022OooO0o0;
        Intrinsics.checkNotNull(scrollableViews4);
        o000O.OooO0oo(scrollableViews4, new o0O000O(this, scrollableViews4));
        scrollableViews4.setSize(NumberSize.Size.XX);
        scrollableViews4.setDelay(50L);
        scrollableViews4.setNumMinCount(3);
        scrollableViews4.setScrollFinishListener(new o0OoOoOo(scrollableViews4));
        ScrollableViews.OooO00o(scrollableViews4, 0);
    }
}
