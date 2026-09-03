package com.yalla.yalla.ui.activity.moment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.bean.AbsJavaBeanApiList;
import com.app.base.framework.abs.AbsListener.AbsListenerTag;
import com.app.base.framework.view.editTextSpan.EditTextSpan;
import com.app.base.view.EmojiFaceView;
import com.app.base.view.HeaderLayout;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.support.keyboardpanel.panel.PanelLayout;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentSendCommentModel;
import com.yalla.yalla.model.MomentSendContentAtModel;
import com.yalla.yalla.model.MomentSendContentModel;
import com.yalla.yalla.model.PostCommentDetailModel;
import com.yalla.yalla.model.PostCommentSonModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.moment.PostDetailCommentSonListActivity;
import com.yalla.yalla.ui.activity.moment.postDetailCommentSonList.PostDetailCommentSonListHeaderView;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import o00OO0O0.o0OOO0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooO.o000O00O;
import p143o00OOooO.o000O0Oo;
import p154o00Oo0oO.o00000OO;
import p154o00Oo0oO.o00oO0o;
import p154o00Oo0oO.o0ooOOo;
import p161o00OoOO0.o00OO0OO;
import p169o00Ooo0.o0O0O00;
import p174o00OooO0.o00OOO00;
import p174o00OooO0.o00OOOO0;
import p255o00ooO0O.o00000O;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o00O000o;
import p390o0OOooO.o00000O0;
import p472o0Oooo0.o00O000;
import p472o0Oooo0.o00O0000;
import p480o0OooooO.oO0o0o;
import p500o0o00Oo0.OooOOO;
import p517o0o0O00.o00O00;
import p522o0o0O0O0.o00Ooo;
import p536o0o0OOo0.o0O0oo00;
import p540o0o0Oo0.o00O;
import p540o0o0Oo0.o00OO;
import p540o0o0Oo0.o00OO000;
import p540o0o0Oo0.o00OO00O;
import p540o0o0Oo0.o00OO0O0;
import p544o0o0OoO.o00OOO0O;
import p544o0o0OoO.o0O000O;
import p544o0o0OoO.o0oOO;
import p569o0oOo0O.o000Oo0;
import p586o0oOoo.o000O;
import p597o0oOoooo.t5;
import p618o0oo0Ooo.oO0O000o;
import p623o0oo0o0o.oo00o;
import p651o0ooOOoo.fd;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/PostDetailCommentSonListActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class PostDetailCommentSonListActivity extends BaseActivityK {

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22492o0Oo0oo = new OooO00o();

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @Nullable
    public PostCommentDetailModel f22495OooooOo;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    @Nullable
    public o0oOO f22500o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public boolean f22501o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    @Nullable
    public MomentDetailModel f22502o00Ooo;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public int f22505o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    @Nullable
    public PostCommentSonModel f22506o00ooo;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public boolean f22510o0ooOOo;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final o00O000o f22493OooooO0 = new o00O000o(Reflection.getOrCreateKotlinClass(fd.class), this, null);

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final int f22494OooooOO = 7;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public final Lazy f22497Oooooo0 = LazyKt.lazy(new OooOO0O());

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @NotNull
    public final o00OOO0O f22496Oooooo = new o00OOO0O();

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @NotNull
    public final Lazy f22498OoooooO = LazyKt.lazy(new OooOO0());

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @NotNull
    public final Lazy f22499Ooooooo = LazyKt.lazy(new OooO0OO());

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    @NotNull
    public String f22508o0OoOo0 = "";

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    @NotNull
    public String f22513ooOO = "";

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public int f22503o00o0O = 1;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    @NotNull
    public final Lazy f22512oo000o = LazyKt.lazy(new OooO());

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public final int f22504o00oO0O = 1400;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22509o0ooOO0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MomentVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.PostDetailCommentSonListActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.moment.PostDetailCommentSonListActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.moment.PostDetailCommentSonListActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0 f22522Oooo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22522Oooo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public int f22511o0ooOoO = -1;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public boolean f22507o0OOO0o = true;

    public static final class OooO extends Lambda implements Function0<o00O0000> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00O0000 invoke() {
            PostDetailCommentSonListActivity postDetailCommentSonListActivity = PostDetailCommentSonListActivity.this;
            OooO00o oooO00o = PostDetailCommentSonListActivity.f22492o0Oo0oo;
            PanelLayout panelLayout = postDetailCommentSonListActivity.Oooo000().f49391OooO0O0;
            Intrinsics.checkNotNullExpressionValue(panelLayout, "binding.faceLayout");
            EditTextSpan editTextSpan = PostDetailCommentSonListActivity.this.Oooo000().f49393OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(editTextSpan, "binding.mEditContentInput");
            return new o00O0000(panelLayout, editTextSpan);
        }
    }

    public static final class OooO00o {
        public final void OooO00o(@Nullable Context context, boolean z, @Nullable MomentDetailModel momentDetailModel, @Nullable PostCommentDetailModel postCommentDetailModel, @Nullable PostCommentSonModel postCommentSonModel) {
            if (context != null) {
                Intent intent = new Intent(context, (Class<?>) PostDetailCommentSonListActivity.class);
                intent.putExtra("From", z);
                intent.putExtra("Data", momentDetailModel);
                intent.putExtra("Module", postCommentDetailModel);
                intent.putExtra("Type", postCommentSonModel);
                context.startActivity(intent);
            }
        }
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbsListenerTag.values().length];
            iArr[AbsListenerTag.Default.ordinal()] = 1;
            iArr[AbsListenerTag.Cancel.ordinal()] = 2;
            iArr[AbsListenerTag.Null.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<o000Oo0> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000Oo0 invoke() {
            PostDetailCommentSonListActivity postDetailCommentSonListActivity = PostDetailCommentSonListActivity.this;
            return new o000Oo0(postDetailCommentSonListActivity, postDetailCommentSonListActivity.f22513ooOO, postDetailCommentSonListActivity.f22508o0OoOo0);
        }
    }

    public static final class OooO0o extends o00OO0OO.OooO0O0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ boolean f22517OooO0O0;

        public static final class OooO00o extends o00000O0<AbsJavaBeanApiList<ArrayList<PostCommentSonModel>>> {
        }

        public OooO0o(boolean z) {
            this.f22517OooO0O0 = z;
        }

        @Override // o00OoOO0.o00OO0OO.OooO0O0, o00OoOO0.o00OO0OO.OooO00o
        public final void onError(@NotNull String code2, @NotNull String message) {
            Intrinsics.checkNotNullParameter(code2, "code");
            Intrinsics.checkNotNullParameter(message, "message");
            super.onError(code2, message);
            PostDetailCommentSonListActivity postDetailCommentSonListActivity = PostDetailCommentSonListActivity.this;
            OooO00o oooO00o = PostDetailCommentSonListActivity.f22492o0Oo0oo;
            postDetailCommentSonListActivity.Oooo000().f49399OooOO0O.Oooo0O0(this.f22517OooO0O0);
            PostDetailCommentSonListActivity.this.Oooo000().f49389OooO.OooOO0(true);
            PostDetailCommentSonListActivity.this.Oooo000().f49389OooO.setVisibility(8);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o00OoOO0.o00OO0OO.OooO0O0, o00OoOO0.o00OO0OO.OooO00o
        public final void onFinish(@NotNull String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            super.onFinish(response);
            try {
                AbsJavaBeanApiList absJavaBeanApiList = (AbsJavaBeanApiList) o0Oo0oo.OooO0OO(response, new OooO00o().getType());
                if (com.yalla.support.common.util.OooO0OO.OooO00o(absJavaBeanApiList)) {
                    PostDetailCommentSonListActivity postDetailCommentSonListActivity = PostDetailCommentSonListActivity.this;
                    OooO00o oooO00o = PostDetailCommentSonListActivity.f22492o0Oo0oo;
                    postDetailCommentSonListActivity.Oooo000().f49399OooOO0O.Oooo0o0(this.f22517OooO0O0, true, true);
                    return;
                }
                if (this.f22517OooO0O0) {
                    PostDetailCommentSonListActivity postDetailCommentSonListActivity2 = PostDetailCommentSonListActivity.this;
                    OooO00o oooO00o2 = PostDetailCommentSonListActivity.f22492o0Oo0oo;
                    postDetailCommentSonListActivity2.OooOooo().setNewData((List) absJavaBeanApiList.getData());
                    PostDetailCommentSonListActivity postDetailCommentSonListActivity3 = PostDetailCommentSonListActivity.this;
                    Model data = absJavaBeanApiList.getData();
                    Intrinsics.checkNotNullExpressionValue(data, "result.getData()");
                    PostDetailCommentSonListActivity.OooOoo(postDetailCommentSonListActivity3, (ArrayList) data);
                } else {
                    PostDetailCommentSonListActivity postDetailCommentSonListActivity4 = PostDetailCommentSonListActivity.this;
                    OooO00o oooO00o3 = PostDetailCommentSonListActivity.f22492o0Oo0oo;
                    postDetailCommentSonListActivity4.OooOooo().addData((Collection) absJavaBeanApiList.getData());
                }
                PostDetailCommentSonListActivity.this.Oooo000().f49389OooO.OooOO0(true);
                PostDetailCommentSonListActivity.this.Oooo000().f49389OooO.setVisibility(8);
                PostDetailCommentSonListActivity.this.f22503o00o0O = absJavaBeanApiList.getPage().getPageindex() + 1;
                PostDetailCommentSonListActivity.this.Oooo000().f49399OooOO0O.Oooo0o0(this.f22517OooO0O0, true, ((ArrayList) absJavaBeanApiList.getData()).size() < 20);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<PostDetailCommentSonListHeaderView> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PostDetailCommentSonListHeaderView invoke() {
            PostDetailCommentSonListActivity postDetailCommentSonListActivity = PostDetailCommentSonListActivity.this;
            return new PostDetailCommentSonListHeaderView(postDetailCommentSonListActivity, postDetailCommentSonListActivity.f22513ooOO);
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<MomentSendCommentModel> {
        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentSendCommentModel invoke() {
            return new MomentSendCommentModel(PostDetailCommentSonListActivity.this.f22508o0OoOo0);
        }
    }

    public static final void OooOoo(PostDetailCommentSonListActivity postDetailCommentSonListActivity, ArrayList arrayList) {
        PostCommentSonModel postCommentSonModel = postDetailCommentSonListActivity.f22506o00ooo;
        int i = 0;
        if (postCommentSonModel != null) {
            Intrinsics.checkNotNull(postCommentSonModel);
            if (postCommentSonModel.getId() > 0) {
                int i2 = -1;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Object obj = arrayList.get(i3);
                    Intrinsics.checkNotNullExpressionValue(obj, "list[i]");
                    PostCommentSonModel postCommentSonModel2 = (PostCommentSonModel) obj;
                    long id = postCommentSonModel2.getId();
                    PostCommentSonModel postCommentSonModel3 = postDetailCommentSonListActivity.f22506o00ooo;
                    Intrinsics.checkNotNull(postCommentSonModel3);
                    if (id == postCommentSonModel3.getId()) {
                        postCommentSonModel2.setLocalMessageDiscolor(true);
                        i2 = i3;
                    }
                }
                if (i2 < 0) {
                    o000Oo0 o000oo0OooOooo = postDetailCommentSonListActivity.OooOooo();
                    PostCommentSonModel postCommentSonModel4 = postDetailCommentSonListActivity.f22506o00ooo;
                    Intrinsics.checkNotNull(postCommentSonModel4);
                    o000oo0OooOooo.addData(0, postCommentSonModel4);
                } else {
                    i = i2;
                }
                postDetailCommentSonListActivity.f22511o0ooOoO = postDetailCommentSonListActivity.OooOooo().getHeaderLayoutCount() + i;
                postDetailCommentSonListActivity.Oooo000().f49397OooO0oo.smoothScrollToPosition(postDetailCommentSonListActivity.f22511o0ooOoO);
                postDetailCommentSonListActivity.f22506o00ooo = null;
                postDetailCommentSonListActivity.Oooo000().f49397OooO0oo.postDelayed(new p070o0000ooO.o0OoOo0(postDetailCommentSonListActivity, 3), postDetailCommentSonListActivity.f22504o00oO0O);
                return;
            }
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) postDetailCommentSonListActivity.Oooo000().f49397OooO0oo.getLayoutManager();
        Intrinsics.checkNotNull(linearLayoutManager);
        linearLayoutManager.scrollToPositionWithOffset(0, 0);
    }

    public final void OooOooO() {
        Oooo000().f49396OooO0oO.setClickable(true);
        Oooo0O0().setContent(null);
        Oooo0O0().cleanComment();
        MomentSendCommentModel momentSendCommentModelOooo0O0 = Oooo0O0();
        StringBuilder sb = new StringBuilder();
        PostCommentDetailModel postCommentDetailModel = this.f22495OooooOo;
        Intrinsics.checkNotNull(postCommentDetailModel);
        sb.append(postCommentDetailModel.getId());
        sb.append("");
        momentSendCommentModelOooo0O0.setCommentSon(sb.toString(), "", "", 0L);
        Oooo000().f49393OooO0Oo.setHint(getString(R.string.Write_a_comment));
        Oooo000().f49393OooO0Oo.setText("");
        Oooo000().f49393OooO0Oo.OooO0O0();
        OoooO00(false);
    }

    public final o000Oo0 OooOooo() {
        return (o000Oo0) this.f22499Ooooooo.getValue();
    }

    public final void Oooo(@NotNull String cid) {
        long j;
        Intrinsics.checkNotNullParameter(cid, "cid");
        t5 t5Var = t5.f47585OooO00o;
        Intrinsics.checkNotNullParameter(cid, "<this>");
        try {
            j = Long.parseLong(cid);
        } catch (NumberFormatException unused) {
            j = 0;
        }
        o000O.OooO00o(t5Var, t5.OooO0o(5, j, null, Long.valueOf(com.yalla.support.common.util.OooO.OooO0o(this.f22508o0OoOo0)), null, null));
    }

    public final PostDetailCommentSonListHeaderView Oooo0() {
        return (PostDetailCommentSonListHeaderView) this.f22498OoooooO.getValue();
    }

    public final fd Oooo000() {
        return (fd) this.f22493OooooO0.getValue();
    }

    public final void Oooo00O(boolean z) {
        o00oO0o o00oo0o2 = o00000OO.f32228OooO00o;
        p154o00Oo0oO.o0Oo0oo o0oo0oo2 = o00000OO.f32234OooO0oO;
        String str = this.f22508o0OoOo0;
        String str2 = this.f22513ooOO;
        StringBuilder sb = new StringBuilder();
        PostCommentDetailModel postCommentDetailModel = this.f22495OooooOo;
        Intrinsics.checkNotNull(postCommentDetailModel);
        sb.append(postCommentDetailModel.getId());
        sb.append("");
        String string = sb.toString();
        int i = this.f22505o00oO0o;
        int i2 = this.f22503o00o0O;
        OooO0o oooO0o = new OooO0o(z);
        Map<String, String> mapOooO0O0 = o00OO0OO.OooO0O0();
        mapOooO0O0.put("dyid", str);
        mapOooO0O0.put("sortType", i + "");
        mapOooO0O0.put("dyuserid", str2);
        mapOooO0O0.put("cid", string);
        mapOooO0O0.put("pageindex", i2 + "");
        mapOooO0O0.put("pagesize", "20");
        o0ooOOo o0ooooo2 = o0ooOOo.f32239OooO00o;
        o00OO0OO.OooO0OO(null, o0ooOOo.f32319o0000OOo, o0ooOOo.f32339o000O0O, mapOooO0O0, oooO0o);
    }

    public final o00O0000 Oooo00o() {
        return (o00O0000) this.f22512oo000o.getValue();
    }

    public final MomentSendCommentModel Oooo0O0() {
        return (MomentSendCommentModel) this.f22497Oooooo0.getValue();
    }

    public final MomentSendContentModel Oooo0OO() {
        String strOooO00o = o00OOOO0.OooO00o(this, Oooo000().f49393OooO0Oo);
        Intrinsics.checkNotNullExpressionValue(strOooO00o, "getAtUserToAtNum(this, binding.mEditContentInput)");
        MomentSendContentModel momentSendContentModel = new MomentSendContentModel(strOooO00o);
        ArrayList<? extends p151o00Oo0Oo.OooOo> arrayListOooO0OO = Oooo000().f49393OooO0Oo.getSpanManager().OooO0OO("@");
        Intrinsics.checkNotNull(arrayListOooO0OO, "null cannot be cast to non-null type java.util.ArrayList<com.app.base.framework.view.editTextSpan.EditTextSpanItem>{ kotlin.collections.TypeAliasesKt.ArrayList<com.app.base.framework.view.editTextSpan.EditTextSpanItem> }");
        int size = arrayListOooO0OO.size();
        for (int i = 0; i < size; i++) {
            p151o00Oo0Oo.OooOo oooOo = arrayListOooO0OO.get(i);
            Intrinsics.checkNotNullExpressionValue(oooOo, "mListFriendListModel[i]");
            p151o00Oo0Oo.OooOo oooOo2 = oooOo;
            List<MomentSendContentAtModel> at = momentSendContentModel.getAt();
            String strOooO00o2 = android.support.v4.media.session.OooOOO0.OooO00o(new StringBuilder(), oooOo2.f32195OoooO00, "");
            String str = oooOo2.f32192Oooo;
            Intrinsics.checkNotNullExpressionValue(str, "friendListModel.text");
            at.add(new MomentSendContentAtModel(strOooO00o2, str));
        }
        return momentSendContentModel;
    }

    public final void Oooo0o() {
        this.f22503o00o0O = 1;
        Oooo00O(true);
    }

    public final void Oooo0o0() {
        StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("recoverSendEdit\n mSendPostCommentModel = ");
        sbOooO0O0.append(Oooo0O0());
        o00O00.OooO0O0(sbOooO0O0.toString());
        if (Oooo0O0().getLocalId() >= 0) {
            Oooo000().f49393OooO0Oo.setText("");
            Oooo000().f49393OooO0Oo.OooO0O0();
        }
        if (TextUtils.isEmpty(Oooo0O0().getParentUserId())) {
            Oooo000().f49393OooO0Oo.setHint(getString(R.string.Write_a_comment));
        } else {
            o00Ooo o00ooo2 = o00Ooo.f42780OooO00o;
            String parentUserId = Oooo0O0().getParentUserId();
            Intrinsics.checkNotNull(parentUserId);
            long jOooO0o = com.yalla.support.common.util.OooO.OooO0o(parentUserId);
            String parentUserName = Oooo0O0().getParentUserName();
            Intrinsics.checkNotNull(parentUserName);
            Oooo000().f49393OooO0Oo.setHint(com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.Reply_xxx), o00ooo2.OooO0O0(jOooO0o, parentUserName)));
        }
        o00OOO00.OooO00o(Oooo000().f49393OooO0Oo, Oooo0O0().getContent(), this);
        Oooo000().f49393OooO0Oo.setCursorVisible(true);
        Oooo000().f49393OooO0Oo.setFocusable(true);
        Oooo000().f49393OooO0Oo.setSingleLine(true);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<Model>] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList, java.util.List<Model>] */
    public final void Oooo0oO(@NotNull PostCommentSonModel data) {
        MomentSendCommentModel momentSendCommentModel;
        Intrinsics.checkNotNullParameter(data, "data");
        if (isDestroyed()) {
            return;
        }
        this.f22507o0OOO0o = false;
        OoooO00(true);
        o00OOO0O o00ooo0o2 = this.f22496Oooooo;
        long id = data.getId();
        o00ooo0o2.OooO0Oo();
        o00ooo0o2.OooO0Oo();
        int size = o00ooo0o2.f32187OooO0O0.size();
        do {
            size--;
            if (size < 0) {
                momentSendCommentModel = null;
                break;
            } else {
                o00ooo0o2.OooO0Oo();
                momentSendCommentModel = (MomentSendCommentModel) o00ooo0o2.f32187OooO0O0.get(size);
            }
        } while (id != momentSendCommentModel.getLocalParentCid());
        if (momentSendCommentModel == null) {
            momentSendCommentModel = new MomentSendCommentModel(this.f22508o0OoOo0);
            StringBuilder sb = new StringBuilder();
            PostCommentDetailModel postCommentDetailModel = this.f22495OooooOo;
            Intrinsics.checkNotNull(postCommentDetailModel);
            sb.append(postCommentDetailModel.getId());
            sb.append("");
            String string = sb.toString();
            String str = data.getUserid() + "";
            String nickname = data.getNickname();
            Intrinsics.checkNotNullExpressionValue(nickname, "data.nickname");
            momentSendCommentModel.setCommentSon(string, str, nickname, data.getId());
        }
        Oooo0O0().setSendPostCommentModel(momentSendCommentModel);
        long id2 = 0;
        try {
            id2 = data.getId();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Oooo0O0().setLocalId(id2);
        Oooo0o0();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<Model>] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList, java.util.List<Model>] */
    public final void Oooo0oo(boolean z) {
        long id;
        MomentSendCommentModel momentSendCommentModel;
        this.f22507o0OOO0o = true;
        if (z) {
            OoooO00(true);
        }
        o00OOO0O o00ooo0o2 = this.f22496Oooooo;
        o00ooo0o2.OooO0Oo();
        o00ooo0o2.OooO0Oo();
        int size = o00ooo0o2.f32187OooO0O0.size();
        do {
            size--;
            id = 0;
            if (size < 0) {
                momentSendCommentModel = null;
                break;
            } else {
                o00ooo0o2.OooO0Oo();
                momentSendCommentModel = (MomentSendCommentModel) o00ooo0o2.f32187OooO0O0.get(size);
            }
        } while (momentSendCommentModel.getLocalParentCid() > 0);
        if (momentSendCommentModel == null) {
            momentSendCommentModel = new MomentSendCommentModel(this.f22508o0OoOo0);
            StringBuilder sb = new StringBuilder();
            PostCommentDetailModel postCommentDetailModel = this.f22495OooooOo;
            Intrinsics.checkNotNull(postCommentDetailModel);
            sb.append(postCommentDetailModel.getId());
            sb.append("");
            momentSendCommentModel.setCommentSon(sb.toString(), "", "", 0L);
        }
        Oooo0O0().setSendPostCommentModel(momentSendCommentModel);
        try {
            PostCommentDetailModel postCommentDetailModel2 = this.f22495OooooOo;
            Intrinsics.checkNotNull(postCommentDetailModel2);
            id = postCommentDetailModel2.getId();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Oooo0O0().setLocalId(id);
        Oooo0o0();
    }

    public final void OoooO00(boolean z) {
        if (!z) {
            Oooo00o().OooO0OO();
            return;
        }
        EditTextSpan view = Oooo000().f49393OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(view, "binding.mEditContentInput");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        InputMethodManager inputMethodManagerOooO00o = o00O000.OooO00o(context);
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "view.context");
        inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(context2.getApplicationContext(), new Handler()));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (Oooo00o().OooO0o0()) {
            return;
        }
        super.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        Context context;
        int i;
        super.onCreate(bundle);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        oO0o0o.OooO0Oo(window, 0);
        setContentView(Oooo000().f49390OooO00o);
        HeaderLayout headerLayout = this.f11480OoooOOO;
        if (headerLayout != null) {
            oO0o0o.OooO00o(headerLayout, true, false);
        }
        Oooo000().f49398OooOO0.setOnTouchListener(new View.OnTouchListener() { // from class: o0o0Oo0.oo00o
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                PostDetailCommentSonListActivity this$0 = this.f44117Oooo;
                PostDetailCommentSonListActivity.OooO00o oooO00o = PostDetailCommentSonListActivity.f22492o0Oo0oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.Oooo000().f49398OooOO0.setVisibility(8);
                this$0.OoooO00(false);
                return true;
            }
        });
        EmojiFaceView emojiFaceView = (EmojiFaceView) findViewById(R.id.emojiFaceView);
        EditTextSpan editTextSpan = Oooo000().f49393OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(editTextSpan, "binding.mEditContentInput");
        emojiFaceView.OooO00o(editTextSpan, true);
        Oooo000().f49393OooO0Oo.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o0o0Oo0.o00O00o0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                PostDetailCommentSonListActivity this$0 = this.f43965Oooo;
                PostDetailCommentSonListActivity.OooO00o oooO00o = PostDetailCommentSonListActivity.f22492o0Oo0oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (z) {
                    this$0.Oooo0oo(false);
                }
            }
        });
        Oooo000().f49399OooOO0O.setOnRefreshListener(new o000O00O(this));
        Oooo000().f49399OooOO0O.setOnLoadMoreListener(new o0O0oo00(this, 2));
        o00O0000 o00o0000Oooo00o = Oooo00o();
        ImageView imageView = Oooo000().f49394OooO0o;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.mIvEmoji");
        o00o0000Oooo00o.OooO0O0(imageView);
        Oooo00o().f40642OooO0O0 = new o00OO000(this);
        Oooo00o().f40641OooO00o = new o00OO00O(this);
        Oooo000().f49393OooO0Oo.f11748OoooO0O = Oooo000.OooO00o.f797Oooo;
        Oooo000().f49393OooO0Oo.addTextChangedListener(new o00OO0O0(this));
        ImageView imageView2 = Oooo000().f49395OooO0o0;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.mIvAt");
        com.yalla.support.common.util.o00O0O.OooO0Oo(imageView2, new o00OO(this));
        ImageView imageView3 = Oooo000().f49396OooO0oO;
        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.mIvSend");
        com.yalla.support.common.util.o00O0O.OooO0Oo(imageView3, new o00O(this));
        this.f22501o00Oo0 = getIntent().getBooleanExtra("From", false);
        this.f22502o00Ooo = (MomentDetailModel) getIntent().getSerializableExtra("Data");
        this.f22495OooooOo = (PostCommentDetailModel) getIntent().getSerializableExtra("Module");
        StringBuilder sb = new StringBuilder();
        MomentDetailModel momentDetailModel = this.f22502o00Ooo;
        Intrinsics.checkNotNull(momentDetailModel);
        sb.append(momentDetailModel.getId());
        sb.append("");
        this.f22508o0OoOo0 = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        MomentDetailModel momentDetailModel2 = this.f22502o00Ooo;
        Intrinsics.checkNotNull(momentDetailModel2);
        sb2.append(momentDetailModel2.getUserId());
        sb2.append("");
        this.f22513ooOO = sb2.toString();
        this.f22506o00ooo = (PostCommentSonModel) getIntent().getSerializableExtra("Type");
        StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("initData postCommentSonModel = ");
        sbOooO0O0.append(this.f22506o00ooo);
        o00O00.OooO0Oo(sbOooO0O0.toString());
        HeaderLayout headerLayout2 = this.f11480OoooOOO;
        if (headerLayout2 != null) {
            String string = getString(R.string.xxx_replies);
            StringBuilder sb3 = new StringBuilder();
            PostCommentDetailModel postCommentDetailModel = this.f22495OooooOo;
            Intrinsics.checkNotNull(postCommentDetailModel);
            sb3.append(postCommentDetailModel.getNum());
            sb3.append("");
            headerLayout2.setTitle(com.yalla.support.common.util.OooOo.OooO00o(string, sb3.toString()));
        }
        if (this.f22495OooooOo == null) {
            finish();
        } else {
            Oooo0oo(true);
            Oooo0().f11723Oooo = new o00Oo00.OooO0OO() { // from class: o0o0Oo0.o00O0O0
                @Override // o00Oo00.OooO0OO
                public final void OooO00o(Object obj) {
                    PostDetailCommentSonListActivity this$0 = this.f43969Oooo;
                    AbsListenerTag absListenerTag = (AbsListenerTag) obj;
                    PostDetailCommentSonListActivity.OooO00o oooO00o = PostDetailCommentSonListActivity.f22492o0Oo0oo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    int i2 = absListenerTag == null ? -1 : PostDetailCommentSonListActivity.OooO0O0.$EnumSwitchMapping$0[absListenerTag.ordinal()];
                    if (i2 == 1) {
                        o00O0OO0 onLogin = new o00O0OO0(this$0);
                        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                        if (Intrinsics.areEqual(OooOOO.f41235OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                            onLogin.invoke();
                            return;
                        }
                        Activity activityOooO0O0 = o00000O.f34276OooO00o.OooO0O0();
                        if (activityOooO0O0 != null) {
                            o0OOO0o.OooO00o(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                            return;
                        }
                        return;
                    }
                    if (i2 != 2) {
                        if (i2 != 3) {
                            return;
                        }
                        o00O0OO onLogin2 = new o00O0OO(this$0);
                        Intrinsics.checkNotNullParameter(onLogin2, "onLogin");
                        if (Intrinsics.areEqual(OooOOO.f41235OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                            onLogin2.invoke();
                            return;
                        }
                        Activity activityOooO0O1 = o00000O.f34276OooO00o.OooO0O0();
                        if (activityOooO0O1 != null) {
                            o0OOO0o.OooO00o(activityOooO0O1, d.R, activityOooO0O1, LoginActivity.class);
                            return;
                        }
                        return;
                    }
                    if (this$0.f22501o00Oo0) {
                        this$0.onBackPressed();
                        return;
                    }
                    oo0o0O0 onLogin3 = new oo0o0O0(this$0);
                    Intrinsics.checkNotNullParameter(onLogin3, "onLogin");
                    if (Intrinsics.areEqual(OooOOO.f41235OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                        onLogin3.invoke();
                        return;
                    }
                    Activity activityOooO0O2 = o00000O.f34276OooO00o.OooO0O0();
                    if (activityOooO0O2 != null) {
                        o0OOO0o.OooO00o(activityOooO0O2, d.R, activityOooO0O2, LoginActivity.class);
                    }
                }
            };
            Oooo0().f22759o00Ooo = new o000O0Oo(this);
            PostDetailCommentSonListHeaderView postDetailCommentSonListHeaderViewOooo0 = Oooo0();
            PostCommentDetailModel postCommentDetailModel2 = this.f22495OooooOo;
            postDetailCommentSonListHeaderViewOooo0.OooO0oo(postCommentDetailModel2, -1);
            if (postDetailCommentSonListHeaderViewOooo0.f11727OoooO0O != 0) {
                postDetailCommentSonListHeaderViewOooo0.f22749Ooooo0o.setVisibility(8);
                postDetailCommentSonListHeaderViewOooo0.f22747OoooOoo.OooO00o();
                postDetailCommentSonListHeaderViewOooo0.f22749Ooooo0o.setText("");
                o00O00.OooO0O0("setData PostCommentDetailModel = " + postCommentDetailModel2);
                oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(postDetailCommentSonListHeaderViewOooo0.f11731o000oOoO);
                oooO00o.OooO00o(o00OOO.OooO00o.OooO0o0());
                oooO00o.OooO0OO(1, com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_e2e2e2));
                String headurl = ((PostCommentDetailModel) postDetailCommentSonListHeaderViewOooo0.f11727OoooO0O).getHeadurl();
                int i2 = postDetailCommentSonListHeaderViewOooo0.f22757o00O0O;
                oooO00o.f48447OooO0OO = CloudImageUtilKt.imgSize(headurl, i2, i2);
                oooO00o.f48445OooO00o = 0;
                oooO00o.OooO0o(postDetailCommentSonListHeaderViewOooo0.f22746OoooOoO);
                postDetailCommentSonListHeaderViewOooo0.f22747OoooOoo.OooO0o(((PostCommentDetailModel) postDetailCommentSonListHeaderViewOooo0.f11727OoooO0O).getVip(), ((PostCommentDetailModel) postDetailCommentSonListHeaderViewOooo0.f11727OoooO0O).getVipLevel());
                postDetailCommentSonListHeaderViewOooo0.f22747OoooOoo.setName(o00Ooo.f42780OooO00o.OooO0O0(com.yalla.support.common.util.OooO.OooO0o(((PostCommentDetailModel) postDetailCommentSonListHeaderViewOooo0.f11727OoooO0O).getUserid()), ((PostCommentDetailModel) postDetailCommentSonListHeaderViewOooo0.f11727OoooO0O).getNickname()));
                postDetailCommentSonListHeaderViewOooo0.f22747OoooOoo.setKaVip(postCommentDetailModel2.kaVIPLv);
                postDetailCommentSonListHeaderViewOooo0.f22747OoooOoo.setAuthor(postDetailCommentSonListHeaderViewOooo0.f22758o00Oo0.equals(((PostCommentDetailModel) postDetailCommentSonListHeaderViewOooo0.f11727OoooO0O).getUserid() + ""));
                postDetailCommentSonListHeaderViewOooo0.f22753Oooooo.OooO0OO(((PostCommentDetailModel) postDetailCommentSonListHeaderViewOooo0.f11727OoooO0O).isPraise());
                postDetailCommentSonListHeaderViewOooo0.OooOO0();
                postDetailCommentSonListHeaderViewOooo0.f22748Ooooo00.setText(oo00o.f48643OooO00o.OooO0Oo(((PostCommentDetailModel) postDetailCommentSonListHeaderViewOooo0.f11727OoooO0O).getCreateTime(), System.currentTimeMillis()));
                if (((PostCommentDetailModel) postDetailCommentSonListHeaderViewOooo0.f11727OoooO0O).getContent() != null) {
                    postDetailCommentSonListHeaderViewOooo0.f22749Ooooo0o.setVisibility(0);
                    o00OOOO0.OooO0O0(postDetailCommentSonListHeaderViewOooo0.f11725OoooO0, ((PostCommentDetailModel) postDetailCommentSonListHeaderViewOooo0.f11727OoooO0O).getContent(), postDetailCommentSonListHeaderViewOooo0.f22749Ooooo0o, new o0O000O(postDetailCommentSonListHeaderViewOooo0));
                }
                boolean z = ((PostCommentDetailModel) postDetailCommentSonListHeaderViewOooo0.f11727OoooO0O).isSendProp() && ((PostCommentDetailModel) postDetailCommentSonListHeaderViewOooo0.f11727OoooO0O).getPropNum() > 0;
                postDetailCommentSonListHeaderViewOooo0.f22755OoooooO.setText(o0O0O00.OooO0oO(((PostCommentDetailModel) postDetailCommentSonListHeaderViewOooo0.f11727OoooO0O).getPropNum(), false));
                TextView textView = postDetailCommentSonListHeaderViewOooo0.f22755OoooooO;
                if (z) {
                    context = postDetailCommentSonListHeaderViewOooo0.f11731o000oOoO;
                    i = R.color.color_FFA16C;
                } else {
                    context = postDetailCommentSonListHeaderViewOooo0.f11731o000oOoO;
                    i = R.color.color_666666;
                }
                textView.setTextColor(o000O000.OooO00o.OooO0O0(context, i));
                postDetailCommentSonListHeaderViewOooo0.f22762o0OoOo0.setVisibility(0);
                postDetailCommentSonListHeaderViewOooo0.f22762o0OoOo0.setImageResource(R.drawable.icon_reward_gray);
                if (((PostCommentDetailModel) postDetailCommentSonListHeaderViewOooo0.f11727OoooO0O).isSendProp()) {
                    postDetailCommentSonListHeaderViewOooo0.f22762o0OoOo0.setImageResource(R.drawable.icon_reward_red);
                }
            }
            OooOooo().setHeaderView(Oooo0().f11728OoooOO0);
            o000Oo0 o000oo0OooOooo = OooOooo();
            o00Oo00.OooO0O0 oooO0O0 = new o00Oo00.OooO0O0() { // from class: o0o0Oo0.o00O0O00
                @Override // o00Oo00.OooO0O0
                public final void OooO0O0(Object obj, int i3, Object obj2) {
                    PostDetailCommentSonListActivity this$0 = this.f43970Oooo;
                    PostCommentSonModel data = (PostCommentSonModel) obj;
                    AbsListenerTag absListenerTag = (AbsListenerTag) obj2;
                    PostDetailCommentSonListActivity.OooO00o oooO00o2 = PostDetailCommentSonListActivity.f22492o0Oo0oo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(data, "data");
                    int i4 = absListenerTag == null ? -1 : PostDetailCommentSonListActivity.OooO0O0.$EnumSwitchMapping$0[absListenerTag.ordinal()];
                    if (i4 == 1) {
                        o00O0OOO onLogin = new o00O0OOO(this$0, data);
                        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                        if (Intrinsics.areEqual(OooOOO.f41235OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                            onLogin.invoke();
                            return;
                        }
                        Activity activityOooO0O0 = o00000O.f34276OooO00o.OooO0O0();
                        if (activityOooO0O0 != null) {
                            o0OOO0o.OooO00o(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                            return;
                        }
                        return;
                    }
                    if (i4 != 3) {
                        return;
                    }
                    oo0oOO0 onLogin2 = new oo0oOO0(this$0, data);
                    Intrinsics.checkNotNullParameter(onLogin2, "onLogin");
                    if (Intrinsics.areEqual(OooOOO.f41235OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                        onLogin2.invoke();
                        return;
                    }
                    Activity activityOooO0O1 = o00000O.f34276OooO00o.OooO0O0();
                    if (activityOooO0O1 != null) {
                        o0OOO0o.OooO00o(activityOooO0O1, d.R, activityOooO0O1, LoginActivity.class);
                    }
                }
            };
            Intrinsics.checkNotNull(oooO0O0, "null cannot be cast to non-null type com.app.base.framework.abs.AbsListener.AbsTagDataListener<com.yalla.yalla.model.PostCommentSonModel, com.app.base.framework.abs.AbsListener.AbsListenerTag?>");
            o000oo0OooOooo.f45460OooO0Oo = oooO0O0;
            Oooo000().f49397OooO0oo.setLayoutManager(new FixLinearLayoutManager(this));
            Oooo000().f49397OooO0oo.setAdapter(OooOooo());
            this.f22500o00O0O = new o0oOO(this);
        }
        Oooo0o();
        p500o0o00Oo0.OooOOO.f41235OooO00o.OooOooO().observe(this, new p143o00OOooO.o000Oo0(this, 5));
        ((MomentVM) this.f22509o0ooOO0.getValue()).statisticalTime();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.app.base.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((MomentVM) this.f22509o0ooOO0.getValue()).statisticalTime();
    }
}
