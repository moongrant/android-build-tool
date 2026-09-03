package com.yalla.yalla.ui.activity.main;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.NumberSize;
import com.yalla.yalla.ui.view.ScrollableViews;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o00O000o;
import p535o0o0OOoO.oOO;
import p535o0o0OOoO.oOOO00;
import p535o0o0OOoO.oOOO000o;
import p535o0o0OOoO.oOOO00Oo;
import p535o0o0OOoO.oOOO00o0;
import p535o0o0OOoO.oOOO0O0o;
import p535o0o0OOoO.oOOO0OO0;
import p535o0o0OOoO.oOOO0OOO;
import p649o0ooOOoo.ma;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/TestActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class TestActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22087OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(ma.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f22088Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f22089Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f22090OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f22091OooooOO;

    public final ma OooOoo() {
        return (ma) this.f22087OoooOoo.getValue();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f50010OooO00o);
        OooOoO0("Test");
        OooOo0O(1);
        ScrollableViews scrollableViews = OooOoo().f50012OooO0OO;
        Intrinsics.checkNotNullExpressionValue(scrollableViews, "");
        o00O0O.OooO0Oo(scrollableViews, new oOO(this, scrollableViews));
        scrollableViews.setSize(NumberSize.Size.M);
        scrollableViews.setDelay(50L);
        scrollableViews.setNumMinCount(3);
        scrollableViews.setScrollFinishListener(new oOOO000o(scrollableViews));
        ScrollableViews.OooO00o(scrollableViews, 0);
        ScrollableViews scrollableViews2 = OooOoo().f50011OooO0O0;
        Intrinsics.checkNotNullExpressionValue(scrollableViews2, "");
        o00O0O.OooO0Oo(scrollableViews2, new oOOO00(this, scrollableViews2));
        scrollableViews2.setSize(NumberSize.Size.H);
        scrollableViews2.setDelay(50L);
        scrollableViews2.setNumMinCount(2);
        scrollableViews2.setScrollFinishListener(new oOOO00Oo(scrollableViews2));
        ScrollableViews.OooO00o(scrollableViews2, 0);
        ScrollableViews scrollableViews3 = OooOoo().f50013OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(scrollableViews3, "");
        o00O0O.OooO0Oo(scrollableViews3, new oOOO00o0(this, scrollableViews3));
        scrollableViews3.setSize(NumberSize.Size.X);
        scrollableViews3.setDelay(50L);
        scrollableViews3.setNumMinCount(3);
        scrollableViews3.setScrollFinishListener(new oOOO0O0o(scrollableViews3));
        ScrollableViews.OooO00o(scrollableViews3, 0);
        ScrollableViews scrollableViews4 = OooOoo().f50014OooO0o0;
        Intrinsics.checkNotNullExpressionValue(scrollableViews4, "");
        o00O0O.OooO0Oo(scrollableViews4, new oOOO0OO0(this, scrollableViews4));
        scrollableViews4.setSize(NumberSize.Size.XX);
        scrollableViews4.setDelay(50L);
        scrollableViews4.setNumMinCount(3);
        scrollableViews4.setScrollFinishListener(new oOOO0OOO(scrollableViews4));
        ScrollableViews.OooO00o(scrollableViews4, 0);
    }
}
