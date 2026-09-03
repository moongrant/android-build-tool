package com.yalla.yalla.ui.activity.user;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0O;
import com.code.android.util.o000O0;
import com.yalla.yalla.model.user.UserHeaderFrameModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.user.OooOO0O;
import com.yalla.yalla.ui.activity.user.UserHeaderFrameActivity;
import com.yalla.yalla.ui.view.HeaderLayout;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p384o0OOoo0O.o00oO0o;
import p384o0OOoo0O.o0OO00O;
import p405o0Oo0OOO.oo0oOO0;
import p475o0Ooooo0.o0O00oO0;
import p506o0o00oOo.oO0OO00;
import p506o0o00oOo.ooo0o;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;
import p590o0oOooo0.oOOO00Oo;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/UserHeaderFrameActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nUserHeaderFrameActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserHeaderFrameActivity.kt\ncom/yalla/yalla/ui/activity/user/UserHeaderFrameActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,308:1\n22#2,2:309\n*S KotlinDebug\n*F\n+ 1 UserHeaderFrameActivity.kt\ncom/yalla/yalla/ui/activity/user/UserHeaderFrameActivity\n*L\n35#1:309,2\n*E\n"})
public final class UserHeaderFrameActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final /* synthetic */ int f26764OooOoOO = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f26767OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public UserHeaderFrameModel f26769OooOo0O;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f26765OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(oo0oOO0.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ArrayList f26768OooOo00 = new ArrayList();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f26770OooOo0o = -1;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f26766OooOo = -1;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final Lazy f26772OooOoO0 = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final Lazy f26771OooOoO = LazyKt.lazy(new OooO00o());

    @SourceDebugExtension({"SMAP\nUserHeaderFrameActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserHeaderFrameActivity.kt\ncom/yalla/yalla/ui/activity/user/UserHeaderFrameActivity$adapter$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,308:1\n1864#2,3:309\n*S KotlinDebug\n*F\n+ 1 UserHeaderFrameActivity.kt\ncom/yalla/yalla/ui/activity/user/UserHeaderFrameActivity$adapter$2\n*L\n103#1:309,3\n*E\n"})
    public static final class OooO00o extends Lambda implements Function0<OooOO0O> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooOO0O invoke() {
            int i = oo0o0Oo.item_user_header_frame;
            final UserHeaderFrameActivity userHeaderFrameActivity = UserHeaderFrameActivity.this;
            final OooOO0O oooOO0O = new OooOO0O(userHeaderFrameActivity, i);
            oooOO0O.f13176OooO0o = new BaseQuickAdapter.OooO0o() { // from class: o0o00oOo.ooOOO00O
                @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
                public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i2) {
                    int i3;
                    UserHeaderFrameActivity this$0 = userHeaderFrameActivity;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    OooOO0O this_apply = oooOO0O;
                    Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                    UserHeaderFrameModel userHeaderFrameModel = (UserHeaderFrameModel) this$0.f26768OooOo00.get(i2);
                    if (this$0.f26767OooOo0 || userHeaderFrameModel.getLocalTypeModel() == 2 || userHeaderFrameModel.getLocalTypeModel() == 3) {
                        return;
                    }
                    this$0.OooOoO0().f45277OooO0Oo.setVisibility(8);
                    this$0.f26769OooOo0O = userHeaderFrameModel;
                    int i4 = 0;
                    for (Object obj : this$0.f26768OooOo00) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        UserHeaderFrameModel userHeaderFrameModel2 = (UserHeaderFrameModel) obj;
                        if (userHeaderFrameModel2.getLocalIsSelect()) {
                            userHeaderFrameModel2.setLocalIsSelect(false);
                            this_apply.notifyItemChanged(i4);
                        }
                        i4 = i5;
                    }
                    if (userHeaderFrameModel.getLocalTypeModel() == 1) {
                        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                        T value = o0O00oO0.OooO0oo().getValue();
                        UserHeaderFrameModel userHeaderFrameModel3 = this$0.f26769OooOo0O;
                        if (!Intrinsics.areEqual(value, userHeaderFrameModel3 != null ? userHeaderFrameModel3.getPic() : null)) {
                            this$0.OooOoO0().f45277OooO0Oo.setVisibility(0);
                        }
                        i3 = i2;
                    } else {
                        i3 = -1;
                    }
                    this$0.f26766OooOo = i3;
                    userHeaderFrameModel.setLocalIsSelect(true);
                    UserHeaderFrameActivity.OooOo(this$0, this$0.f26769OooOo0O);
                    this_apply.notifyItemChanged(i2);
                }
            };
            return oooOO0O;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<oOOO00Oo> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oOOO00Oo invoke() {
            int i = UserHeaderFrameActivity.f26764OooOoOO;
            UserHeaderFrameActivity userHeaderFrameActivity = UserHeaderFrameActivity.this;
            return new oOOO00Oo(userHeaderFrameActivity, userHeaderFrameActivity.OooOoO0().f45278OooO0o);
        }
    }

    public static final void OooOo(UserHeaderFrameActivity userHeaderFrameActivity, UserHeaderFrameModel userHeaderFrameModel) {
        userHeaderFrameActivity.getClass();
        if (userHeaderFrameModel == null) {
            return;
        }
        if (com.code.android.util.OooOo00.OooO00o(userHeaderFrameModel.getUnlocktext())) {
            userHeaderFrameActivity.OooOoO0().f45280OooO0oO.setText(o0000.OooO0OO(o000000.header_frame_unlock_automatically));
        } else {
            userHeaderFrameActivity.OooOoO0().f45280OooO0oO.setText(userHeaderFrameModel.getUnlocktext());
        }
        ((oOOO00Oo) userHeaderFrameActivity.f26772OooOoO0.getValue()).OooO00o(userHeaderFrameModel.getPic());
        if (userHeaderFrameModel.getLocalTypeModel() == 0) {
            userHeaderFrameActivity.OooOoO0().f45276OooO0OO.setImageResource(o0Oo0oo.icon_header_frame_title_not_unlock);
        } else {
            userHeaderFrameActivity.OooOoO0().f45276OooO0OO.setImageResource(o0Oo0oo.icon_header_frame_title_unlock);
        }
    }

    public final oo0oOO0 OooOoO0() {
        return (oo0oOO0) this.f26765OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoO0().f45274OooO00o);
        o0000O0O.OooO0o(this, o0000.OooO00o(o0OOO0o.color_1F1C37), true);
        HeaderLayout headerLayout = this.f22282OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(o0000.OooO0OO(o000000.user_info_header_select_header_frame_title));
            headerLayout.setBackground(null);
        }
        OooOoO0().f45279OooO0o0.setAdapter((OooOO0O) this.f26771OooOoO.getValue());
        RecyclerView recyclerView = OooOoO0().f45279OooO0o0;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 4);
        gridLayoutManager.f10544OooOO0 = new ooo0o(this);
        recyclerView.setLayoutManager(gridLayoutManager);
        OooOoO0().f45277OooO0Oo.setVisibility(8);
        OooOoO0().f45277OooO0Oo.setOnClickListener(new oO0OO00(this));
        o00oO0o o00oo0o2 = o0OO00O.f43462OooO00o;
        OooOOO0 oooOOO0 = new OooOOO0(this);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p384o0OOoo0O.Oooo0.f43359OooOoo, p384o0OOoo0O.Oooo0.f43398o00000O, p426o0OoO0o0.OooOOOO.OooO00o(), oooOOO0);
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this);
        oooO00o.OooO00o(d1.OooO00o());
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        oooO00o.f43126OooO0OO = p403o0Oo0OO.OooO0OO.OooO00o((String) o0O00oO0.OooO().getValue());
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0O0(2, o0000.OooO00o(o0OOO0o.white));
        oooO00o.f43140OooOOo0 = OooOoO0().f45275OooO0O0.getDrawable();
        oooO00o.OooO0Oo(OooOoO0().f45275OooO0O0);
    }
}
