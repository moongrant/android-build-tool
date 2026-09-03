package com.yalla.yalla.ui.activity.moment;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.o0;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.util.o000O0;
import com.yalla.yalla.model.moment.MomentPowerSelectModel;
import com.yalla.yalla.model.moment.MomentTypePower;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p193o00o0O0O.o0000oo;
import p379o0OOoOOO.oOO00O;
import p405o0Oo0OOO.o00O0O0O;
import p492o0o00OO0.o00O0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/MomentPowerSelectActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMomentPowerSelectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentPowerSelectActivity.kt\ncom/yalla/yalla/ui/activity/moment/MomentPowerSelectActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,151:1\n22#2,2:152\n*S KotlinDebug\n*F\n+ 1 MomentPowerSelectActivity.kt\ncom/yalla/yalla/ui/activity/moment/MomentPowerSelectActivity\n*L\n42#1:152,2\n*E\n"})
public final class MomentPowerSelectActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ int f25693OooOo = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public MomentPowerSelectModel f25695OooOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final ArrayList f25694OooOOoo = new ArrayList();

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f25696OooOo00 = MomentTypePower.Open.getValue();

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final o000O0 f25697OooOo0O = new o000O0(Reflection.getOrCreateKotlinClass(o00O0O0O.class), this, null);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final Lazy f25698OooOo0o = LazyKt.lazy(new OooO00o());

    public static final class OooO00o extends Lambda implements Function0<o0OoOo0> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0OoOo0 invoke() {
            return new o0OoOo0(MomentPowerSelectActivity.this, p562o0oOo000.oo0o0Oo.item_select_post_power);
        }
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("Data", this.f25695OooOo0);
        setResult(-1, intent);
        finish();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            oOO00O.OooO0OO(window, 0);
            o0 o0Var = new o0(window.getDecorView(), window);
            Intrinsics.checkNotNullExpressionValue(o0Var, "getInsetsController(...)");
            o0Var.OooO00o(true);
        }
        o000O0 o000o0 = this.f25697OooOo0O;
        setContentView(((o00O0O0O) o000o0.getValue()).f44312OooO00o);
        ComposeView topComposeView = ((o00O0O0O) o000o0.getValue()).f44314OooO0OO;
        Intrinsics.checkNotNullExpressionValue(topComposeView, "topComposeView");
        o0000oo.OooO0Oo(topComposeView, ComposableLambdaKt.composableLambdaInstance(-332902437, true, new o00O0(this)));
        Intent intent = getIntent();
        MomentTypePower momentTypePower = MomentTypePower.Open;
        this.f25696OooOo00 = intent.getIntExtra("Id", momentTypePower.getValue());
        MomentPowerSelectModel momentPowerSelectModel = new MomentPowerSelectModel(momentTypePower.getValue());
        MomentTypePower momentTypePower2 = MomentTypePower.Friend;
        MomentPowerSelectModel momentPowerSelectModel2 = new MomentPowerSelectModel(momentTypePower2.getValue());
        MomentTypePower momentTypePower3 = MomentTypePower.Self;
        MomentPowerSelectModel momentPowerSelectModel3 = new MomentPowerSelectModel(momentTypePower3.getValue());
        int i = this.f25696OooOo00;
        if (i == momentTypePower.getValue()) {
            momentPowerSelectModel.setSelect(true);
            this.f25695OooOo0 = momentPowerSelectModel;
        } else if (i == momentTypePower2.getValue()) {
            momentPowerSelectModel2.setSelect(true);
            this.f25695OooOo0 = momentPowerSelectModel2;
        } else if (i == momentTypePower3.getValue()) {
            momentPowerSelectModel3.setSelect(true);
            this.f25695OooOo0 = momentPowerSelectModel3;
        }
        ArrayList arrayList = this.f25694OooOOoo;
        arrayList.add(momentPowerSelectModel);
        arrayList.add(momentPowerSelectModel2);
        arrayList.add(momentPowerSelectModel3);
        ((o00O0O0O) o000o0.getValue()).f44313OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        RecyclerView recyclerView = ((o00O0O0O) o000o0.getValue()).f44313OooO0O0;
        Lazy lazy = this.f25698OooOo0o;
        recyclerView.setAdapter((p571o0oOoO0.o0000oo) lazy.getValue());
        ((p571o0oOoO0.o0000oo) lazy.getValue()).f13176OooO0o = new p404o0Oo0OO0.OooOo00(this);
        ((p571o0oOoO0.o0000oo) lazy.getValue()).OooOoO0(arrayList);
        ((p571o0oOoO0.o0000oo) lazy.getValue()).Oooo0O0(true);
    }
}
