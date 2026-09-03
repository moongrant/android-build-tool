package com.yalla.yalla.ui.activity.moment;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.view.HeaderLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.MomentPowerSelectModel;
import com.yalla.yalla.model.MomentTypePower;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooo.oo0O;
import p254o00ooO0O.o00O000o;
import p649o0ooOOoo.z6;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/MomentPowerSelectActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MomentPowerSelectActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22360OooooOo = new OooO00o();

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @Nullable
    public MomentPowerSelectModel f22363Ooooo0o;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final List<MomentPowerSelectModel> f22361OoooOoo = new ArrayList();

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f22362Ooooo00 = MomentTypePower.Open.getValue();

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final o00O000o f22364OooooO0 = new o00O000o(Reflection.getOrCreateKotlinClass(z6.class), this, null);

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public final Lazy f22365OooooOO = LazyKt.lazy(new OooO0O0());

    public static final class OooO00o {
    }

    public static final class OooO0O0 extends Lambda implements Function0<OooOO0> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooOO0 invoke() {
            return new OooOO0(MomentPowerSelectActivity.this);
        }
    }

    public final p188o00o00o0.OooO0OO<MomentPowerSelectModel> OooOoo() {
        return (p188o00o00o0.OooO0OO) this.f22365OooooOO.getValue();
    }

    public final z6 OooOooO() {
        return (z6) this.f22364OooooO0.getValue();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("Data", this.f22363Ooooo0o);
        setResult(-1, intent);
        finish();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.MomentPowerSelectModel>] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.MomentPowerSelectModel>] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.MomentPowerSelectModel>] */
    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOooO().f51053OooO00o);
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            headerLayout.setTitle(getString(R.string.Share_with));
        }
        Intent intent = getIntent();
        MomentTypePower momentTypePower = MomentTypePower.Open;
        this.f22362Ooooo00 = intent.getIntExtra("Id", momentTypePower.getValue());
        MomentPowerSelectModel momentPowerSelectModel = new MomentPowerSelectModel(momentTypePower.getValue());
        MomentTypePower momentTypePower2 = MomentTypePower.Friend;
        MomentPowerSelectModel momentPowerSelectModel2 = new MomentPowerSelectModel(momentTypePower2.getValue());
        MomentTypePower momentTypePower3 = MomentTypePower.Self;
        MomentPowerSelectModel momentPowerSelectModel3 = new MomentPowerSelectModel(momentTypePower3.getValue());
        int i = this.f22362Ooooo00;
        if (i == momentTypePower.getValue()) {
            momentPowerSelectModel.setSelect(true);
            this.f22363Ooooo0o = momentPowerSelectModel;
        } else if (i == momentTypePower2.getValue()) {
            momentPowerSelectModel2.setSelect(true);
            this.f22363Ooooo0o = momentPowerSelectModel2;
        } else if (i == momentTypePower3.getValue()) {
            momentPowerSelectModel3.setSelect(true);
            this.f22363Ooooo0o = momentPowerSelectModel3;
        }
        this.f22361OoooOoo.add(momentPowerSelectModel);
        this.f22361OoooOoo.add(momentPowerSelectModel2);
        this.f22361OoooOoo.add(momentPowerSelectModel3);
        OooOooO().f51054OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        OooOooO().f51054OooO0O0.setAdapter(OooOoo());
        OooOoo().setOnItemClickListener(new oo0O(this, 2));
        OooOoo().setNewData(this.f22361OoooOoo);
        OooOoo().setLoadComplete(true);
    }
}
