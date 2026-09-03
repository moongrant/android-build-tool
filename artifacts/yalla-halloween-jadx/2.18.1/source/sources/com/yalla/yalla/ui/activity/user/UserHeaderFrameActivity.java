package com.yalla.yalla.ui.activity.user;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.model.UserHeaderFrameModel;
import com.app.base.view.HeaderLayout;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.ui.activity.BaseActivityK;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o000OOo;
import p153o00Oo0oO.o00oO0o;
import p153o00Oo0oO.o0ooOOo;
import p160o00OoOO0.o00OO0O0;
import p168o00Ooo0.o00O0O;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o000OOo0;
import p254o00ooO0O.o00O000o;
import p566o0oOo00O.o00OO;
import p566o0oOo00O.o00OOO0;
import p566o0oOo00O.o00OOO00;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.d7;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/UserHeaderFrameActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class UserHeaderFrameActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public static final /* synthetic */ int f23441OoooooO = 0;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public boolean f23444Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public UserHeaderFrameModel f23445OooooO0;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f23442OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(d7.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final List<UserHeaderFrameModel> f23443Ooooo00 = new ArrayList();

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f23446OooooOO = -1;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f23447OooooOo = -1;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public final Lazy f23449Oooooo0 = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @NotNull
    public final Lazy f23448Oooooo = LazyKt.lazy(new OooO00o());

    public static final class OooO00o extends Lambda implements Function0<OooO0o> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooO0o invoke() {
            OooO0o oooO0o = new OooO0o(UserHeaderFrameActivity.this);
            oooO0o.setOnItemClickListener(new o0O0OOO.OooOOOO(UserHeaderFrameActivity.this, oooO0o));
            return oooO0o;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<o00O0O> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00O0O invoke() {
            UserHeaderFrameActivity userHeaderFrameActivity = UserHeaderFrameActivity.this;
            int i = UserHeaderFrameActivity.f23441OoooooO;
            return new o00O0O(userHeaderFrameActivity, userHeaderFrameActivity.OooOooO().f49145OooO0o);
        }
    }

    public static final void OooOoo(UserHeaderFrameActivity userHeaderFrameActivity, UserHeaderFrameModel userHeaderFrameModel) {
        Objects.requireNonNull(userHeaderFrameActivity);
        if (userHeaderFrameModel == null) {
            return;
        }
        if (com.yalla.support.common.util.OooO0OO.OooO00o(userHeaderFrameModel.getUnlocktext())) {
            userHeaderFrameActivity.OooOooO().f49147OooO0oO.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.header_frame_unlock_automatically));
        } else {
            userHeaderFrameActivity.OooOooO().f49147OooO0oO.setText(userHeaderFrameModel.getUnlocktext());
        }
        ((o00O0O) userHeaderFrameActivity.f23449Oooooo0.getValue()).OooO00o(userHeaderFrameModel.getPic());
        if (userHeaderFrameModel.getLocalTypeModel() == 0) {
            userHeaderFrameActivity.OooOooO().f49143OooO0OO.setImageResource(R.drawable.icon_header_frame_title_not_unlock);
        } else {
            userHeaderFrameActivity.OooOooO().f49143OooO0OO.setImageResource(R.drawable.icon_header_frame_title_unlock);
        }
    }

    public final d7 OooOooO() {
        return (d7) this.f23442OoooOoo.getValue();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOooO().f49141OooO00o);
        o000OOo0.OooO0Oo(this, o000O0O0.OooO00o(R.color.color_1F1C37));
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            headerLayout.setTitle(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.user_info_header_select_header_frame_title));
            headerLayout.setBackground(null);
        }
        OooOooO().f49146OooO0o0.setAdapter((OooO0o) this.f23448Oooooo.getValue());
        RecyclerView recyclerView = OooOooO().f49146OooO0o0;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 4);
        gridLayoutManager.f8833OoooO0O = new o00OO(this);
        recyclerView.setLayoutManager(gridLayoutManager);
        OooOooO().f49144OooO0Oo.setVisibility(8);
        OooOooO().f49144OooO0Oo.setOnClickListener(new o00OOO00(this));
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        o000OOo o000ooo2 = o00000OO.f32209OooO0OO;
        o00OOO0 o00ooo1 = new o00OOO0(this);
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32302o0000Ooo, mapOooO0O0, o00ooo1);
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this);
        oooO00o.OooO00o(o00OOO.OooO00o.OooO00o());
        oooO00o.f48429OooO0OO = CloudImageUtilKt.imgSize(p498o0o00Oo0.OooOOO.f41216OooO00o.OooO0oo().getValue(), com.yalla.support.common.util.OooOo00.OooO00o(90.0f), true);
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO0OO(2, o000O0O0.OooO00o(R.color.white));
        oooO00o.f48443OooOOo0 = OooOooO().f49142OooO0O0.getDrawable();
        oooO00o.OooO0o(OooOooO().f49142OooO0O0);
    }
}
