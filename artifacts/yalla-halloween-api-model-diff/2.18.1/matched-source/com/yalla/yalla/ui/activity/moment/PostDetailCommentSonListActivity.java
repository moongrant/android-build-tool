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
import p100o000oOoO.o00O00OO;
import p142o00OOooO.o000O00O;
import p142o00OOooO.o000O0Oo;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p153o00Oo0oO.o0ooOOo;
import p160o00OoOO0.o00OO0O0;
import p168o00Ooo0.o0O0O00;
import p173o00OooO0.o00OO;
import p173o00OooO0.o0o0Oo;
import p254o00ooO0O.o00000O;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p388o0OOooO.o00000O0;
import p470o0Oooo0.o00O000;
import p470o0Oooo0.o00O0000;
import p478o0OooooO.oO0OoOO0;
import p498o0o00Oo0.OooOOO;
import p515o0o0O00.o00O00;
import p534o0o0OOo0.o0OO000;
import p538o0o0Oo0.o00O;
import p538o0o0Oo0.o00OO000;
import p538o0o0Oo0.o00OO00O;
import p542o0o0OoO.o00OOO0;
import p542o0o0OoO.o00Oo00;
import p542o0o0OoO.o0O000;
import p567o0oOo0O.o000Oo0;
import p584o0oOoo.o000O;
import p595o0oOoooo.u5;
import p616o0oo0Ooo.oO0O00;
import p621o0oo0o0o.o00O0;
import p649o0ooOOoo.gd;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/PostDetailCommentSonListActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class PostDetailCommentSonListActivity extends BaseActivityK {

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22473o0ooOOo = new OooO00o();

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @Nullable
    public PostCommentDetailModel f22476Ooooo0o;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @Nullable
    public o00Oo00 f22483Ooooooo;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    @Nullable
    public PostCommentSonModel f22485o00Oo0;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public int f22487o00o0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public boolean f22489o00oO0o;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public boolean f22491o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    @Nullable
    public MomentDetailModel f22494ooOO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22474OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(gd.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final int f22475Ooooo00 = 7;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final Lazy f22477OooooO0 = LazyKt.lazy(new OooOO0O());

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public final o00OOO0 f22478OooooOO = new o00OOO0();

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public final Lazy f22479OooooOo = LazyKt.lazy(new OooOO0());

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public final Lazy f22481Oooooo0 = LazyKt.lazy(new OooO0OO());

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @NotNull
    public String f22480Oooooo = "";

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @NotNull
    public String f22482OoooooO = "";

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public int f22484o00O0O = 1;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    @NotNull
    public final Lazy f22486o00Ooo = LazyKt.lazy(new OooO());

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public final int f22490o00ooo = 1400;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22493oo000o = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MomentVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.PostDetailCommentSonListActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f22503Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22503Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public int f22488o00oO0O = -1;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public boolean f22492o0ooOO0 = true;

    public static final class OooO extends Lambda implements Function0<o00O0000> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00O0000 invoke() {
            PostDetailCommentSonListActivity postDetailCommentSonListActivity = PostDetailCommentSonListActivity.this;
            OooO00o oooO00o = PostDetailCommentSonListActivity.f22473o0ooOOo;
            PanelLayout panelLayout = postDetailCommentSonListActivity.Oooo000().f49454OooO0O0;
            Intrinsics.checkNotNullExpressionValue(panelLayout, "binding.faceLayout");
            EditTextSpan editTextSpan = PostDetailCommentSonListActivity.this.Oooo000().f49456OooO0Oo;
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
            return new o000Oo0(postDetailCommentSonListActivity, postDetailCommentSonListActivity.f22482OoooooO, postDetailCommentSonListActivity.f22480Oooooo);
        }
    }

    public static final class OooO0o extends o00OO0O0.OooO0O0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ boolean f22498OooO0O0;

        public static final class OooO00o extends o00000O0<AbsJavaBeanApiList<ArrayList<PostCommentSonModel>>> {
        }

        public OooO0o(boolean z) {
            this.f22498OooO0O0 = z;
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(@NotNull String code2, @NotNull String message) {
            Intrinsics.checkNotNullParameter(code2, "code");
            Intrinsics.checkNotNullParameter(message, "message");
            super.onError(code2, message);
            PostDetailCommentSonListActivity postDetailCommentSonListActivity = PostDetailCommentSonListActivity.this;
            OooO00o oooO00o = PostDetailCommentSonListActivity.f22473o0ooOOo;
            postDetailCommentSonListActivity.Oooo000().f49462OooOO0O.Oooo0O0(this.f22498OooO0O0);
            PostDetailCommentSonListActivity.this.Oooo000().f49452OooO.OooOO0(true);
            PostDetailCommentSonListActivity.this.Oooo000().f49452OooO.setVisibility(8);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(@NotNull String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            super.onFinish(response);
            try {
                AbsJavaBeanApiList absJavaBeanApiList = (AbsJavaBeanApiList) o0Oo0oo.OooO0OO(response, new OooO00o().getType());
                if (com.yalla.support.common.util.OooO0OO.OooO00o(absJavaBeanApiList)) {
                    PostDetailCommentSonListActivity postDetailCommentSonListActivity = PostDetailCommentSonListActivity.this;
                    OooO00o oooO00o = PostDetailCommentSonListActivity.f22473o0ooOOo;
                    postDetailCommentSonListActivity.Oooo000().f49462OooOO0O.Oooo0o0(this.f22498OooO0O0, true, true);
                    return;
                }
                if (this.f22498OooO0O0) {
                    PostDetailCommentSonListActivity postDetailCommentSonListActivity2 = PostDetailCommentSonListActivity.this;
                    OooO00o oooO00o2 = PostDetailCommentSonListActivity.f22473o0ooOOo;
                    postDetailCommentSonListActivity2.OooOooo().setNewData((List) absJavaBeanApiList.getData());
                    PostDetailCommentSonListActivity postDetailCommentSonListActivity3 = PostDetailCommentSonListActivity.this;
                    Model data = absJavaBeanApiList.getData();
                    Intrinsics.checkNotNullExpressionValue(data, "result.getData()");
                    PostDetailCommentSonListActivity.OooOoo(postDetailCommentSonListActivity3, (ArrayList) data);
                } else {
                    PostDetailCommentSonListActivity postDetailCommentSonListActivity4 = PostDetailCommentSonListActivity.this;
                    OooO00o oooO00o3 = PostDetailCommentSonListActivity.f22473o0ooOOo;
                    postDetailCommentSonListActivity4.OooOooo().addData((Collection) absJavaBeanApiList.getData());
                }
                PostDetailCommentSonListActivity.this.Oooo000().f49452OooO.OooOO0(true);
                PostDetailCommentSonListActivity.this.Oooo000().f49452OooO.setVisibility(8);
                PostDetailCommentSonListActivity.this.f22484o00O0O = absJavaBeanApiList.getPage().getPageindex() + 1;
                PostDetailCommentSonListActivity.this.Oooo000().f49462OooOO0O.Oooo0o0(this.f22498OooO0O0, true, ((ArrayList) absJavaBeanApiList.getData()).size() < 20);
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
            return new PostDetailCommentSonListHeaderView(postDetailCommentSonListActivity, postDetailCommentSonListActivity.f22482OoooooO);
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<MomentSendCommentModel> {
        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentSendCommentModel invoke() {
            return new MomentSendCommentModel(PostDetailCommentSonListActivity.this.f22480Oooooo);
        }
    }

    public static final void OooOoo(PostDetailCommentSonListActivity postDetailCommentSonListActivity, ArrayList arrayList) {
        PostCommentSonModel postCommentSonModel = postDetailCommentSonListActivity.f22485o00Oo0;
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
                    PostCommentSonModel postCommentSonModel3 = postDetailCommentSonListActivity.f22485o00Oo0;
                    Intrinsics.checkNotNull(postCommentSonModel3);
                    if (id == postCommentSonModel3.getId()) {
                        postCommentSonModel2.setLocalMessageDiscolor(true);
                        i2 = i3;
                    }
                }
                if (i2 < 0) {
                    o000Oo0 o000oo0OooOooo = postDetailCommentSonListActivity.OooOooo();
                    PostCommentSonModel postCommentSonModel4 = postDetailCommentSonListActivity.f22485o00Oo0;
                    Intrinsics.checkNotNull(postCommentSonModel4);
                    o000oo0OooOooo.addData(0, postCommentSonModel4);
                } else {
                    i = i2;
                }
                postDetailCommentSonListActivity.f22488o00oO0O = postDetailCommentSonListActivity.OooOooo().getHeaderLayoutCount() + i;
                postDetailCommentSonListActivity.Oooo000().f49460OooO0oo.smoothScrollToPosition(postDetailCommentSonListActivity.f22488o00oO0O);
                postDetailCommentSonListActivity.f22485o00Oo0 = null;
                postDetailCommentSonListActivity.Oooo000().f49460OooO0oo.postDelayed(new p070o0000ooO.o00O0O(postDetailCommentSonListActivity, 3), postDetailCommentSonListActivity.f22490o00ooo);
                return;
            }
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) postDetailCommentSonListActivity.Oooo000().f49460OooO0oo.getLayoutManager();
        Intrinsics.checkNotNull(linearLayoutManager);
        linearLayoutManager.scrollToPositionWithOffset(0, 0);
    }

    public final void OooOooO() {
        Oooo000().f49459OooO0oO.setClickable(true);
        Oooo0O0().setContent(null);
        Oooo0O0().cleanComment();
        MomentSendCommentModel momentSendCommentModelOooo0O0 = Oooo0O0();
        StringBuilder sb = new StringBuilder();
        PostCommentDetailModel postCommentDetailModel = this.f22476Ooooo0o;
        Intrinsics.checkNotNull(postCommentDetailModel);
        sb.append(postCommentDetailModel.getId());
        sb.append("");
        momentSendCommentModelOooo0O0.setCommentSon(sb.toString(), "", "", 0L);
        Oooo000().f49456OooO0Oo.setHint(getString(R.string.Write_a_comment));
        Oooo000().f49456OooO0Oo.setText("");
        Oooo000().f49456OooO0Oo.OooO0O0();
        OoooO00(false);
    }

    public final o000Oo0 OooOooo() {
        return (o000Oo0) this.f22481Oooooo0.getValue();
    }

    public final void Oooo(@NotNull String cid) {
        long j;
        Intrinsics.checkNotNullParameter(cid, "cid");
        u5 u5Var = u5.f47570OooO00o;
        Intrinsics.checkNotNullParameter(cid, "<this>");
        try {
            j = Long.parseLong(cid);
        } catch (NumberFormatException unused) {
            j = 0;
        }
        o000O.OooO00o(u5Var, u5.OooO0o(5, j, null, Long.valueOf(com.yalla.support.common.util.OooO.OooO0o(this.f22480Oooooo)), null, null));
    }

    public final PostDetailCommentSonListHeaderView Oooo0() {
        return (PostDetailCommentSonListHeaderView) this.f22479OooooOo.getValue();
    }

    public final gd Oooo000() {
        return (gd) this.f22474OoooOoo.getValue();
    }

    public final void Oooo00O(boolean z) {
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        p153o00Oo0oO.o0Oo0oo o0oo0oo2 = o00000OO.f32213OooO0oO;
        String str = this.f22480Oooooo;
        String str2 = this.f22482OoooooO;
        StringBuilder sb = new StringBuilder();
        PostCommentDetailModel postCommentDetailModel = this.f22476Ooooo0o;
        Intrinsics.checkNotNull(postCommentDetailModel);
        sb.append(postCommentDetailModel.getId());
        sb.append("");
        String string = sb.toString();
        int i = this.f22487o00o0O;
        int i2 = this.f22484o00O0O;
        OooO0o oooO0o = new OooO0o(z);
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        mapOooO0O0.put("dyid", str);
        mapOooO0O0.put("sortType", i + "");
        mapOooO0O0.put("dyuserid", str2);
        mapOooO0O0.put("cid", string);
        mapOooO0O0.put("pageindex", i2 + "");
        mapOooO0O0.put("pagesize", "20");
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32298o0000OOo, o0ooOOo.f32318o000O0O, mapOooO0O0, oooO0o);
    }

    public final o00O0000 Oooo00o() {
        return (o00O0000) this.f22486o00Ooo.getValue();
    }

    public final MomentSendCommentModel Oooo0O0() {
        return (MomentSendCommentModel) this.f22477OooooO0.getValue();
    }

    public final MomentSendContentModel Oooo0OO() {
        String strOooO00o = o0o0Oo.OooO00o(this, Oooo000().f49456OooO0Oo);
        Intrinsics.checkNotNullExpressionValue(strOooO00o, "getAtUserToAtNum(this, binding.mEditContentInput)");
        MomentSendContentModel momentSendContentModel = new MomentSendContentModel(strOooO00o);
        ArrayList<? extends p150o00Oo0Oo.OooOo> arrayListOooO0OO = Oooo000().f49456OooO0Oo.getSpanManager().OooO0OO("@");
        Intrinsics.checkNotNull(arrayListOooO0OO, "null cannot be cast to non-null type java.util.ArrayList<com.app.base.framework.view.editTextSpan.EditTextSpanItem>{ kotlin.collections.TypeAliasesKt.ArrayList<com.app.base.framework.view.editTextSpan.EditTextSpanItem> }");
        int size = arrayListOooO0OO.size();
        for (int i = 0; i < size; i++) {
            p150o00Oo0Oo.OooOo oooOo = arrayListOooO0OO.get(i);
            Intrinsics.checkNotNullExpressionValue(oooOo, "mListFriendListModel[i]");
            p150o00Oo0Oo.OooOo oooOo2 = oooOo;
            List<MomentSendContentAtModel> at = momentSendContentModel.getAt();
            String strOooO00o2 = android.support.v4.media.session.OooOOO0.OooO00o(new StringBuilder(), oooOo2.f32173Oooo0oO, "");
            String str = oooOo2.f32172Oooo0o;
            Intrinsics.checkNotNullExpressionValue(str, "friendListModel.text");
            at.add(new MomentSendContentAtModel(strOooO00o2, str));
        }
        return momentSendContentModel;
    }

    public final void Oooo0o() {
        this.f22484o00O0O = 1;
        Oooo00O(true);
    }

    public final void Oooo0o0() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("recoverSendEdit\n mSendPostCommentModel = ");
        sbOooO0o0.append(Oooo0O0());
        o00O00.OooO0O0(sbOooO0o0.toString());
        if (Oooo0O0().getLocalId() >= 0) {
            Oooo000().f49456OooO0Oo.setText("");
            Oooo000().f49456OooO0Oo.OooO0O0();
        }
        if (TextUtils.isEmpty(Oooo0O0().getParentUserId())) {
            Oooo000().f49456OooO0Oo.setHint(getString(R.string.Write_a_comment));
        } else {
            p520o0o0O0O0.o00O0O o00o0o2 = p520o0o0O0O0.o00O0O.f42677OooO00o;
            String parentUserId = Oooo0O0().getParentUserId();
            Intrinsics.checkNotNull(parentUserId);
            long jOooO0o = com.yalla.support.common.util.OooO.OooO0o(parentUserId);
            String parentUserName = Oooo0O0().getParentUserName();
            Intrinsics.checkNotNull(parentUserName);
            Oooo000().f49456OooO0Oo.setHint(com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.Reply_xxx), o00o0o2.OooO0O0(jOooO0o, parentUserName)));
        }
        o00OO.OooO00o(Oooo000().f49456OooO0Oo, Oooo0O0().getContent(), this);
        Oooo000().f49456OooO0Oo.setCursorVisible(true);
        Oooo000().f49456OooO0Oo.setFocusable(true);
        Oooo000().f49456OooO0Oo.setSingleLine(true);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<Model>] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList, java.util.List<Model>] */
    public final void Oooo0oO(@NotNull PostCommentSonModel data) {
        MomentSendCommentModel momentSendCommentModel;
        Intrinsics.checkNotNullParameter(data, "data");
        if (isDestroyed()) {
            return;
        }
        this.f22492o0ooOO0 = false;
        OoooO00(true);
        o00OOO0 o00ooo1 = this.f22478OooooOO;
        long id = data.getId();
        o00ooo1.OooO0Oo();
        o00ooo1.OooO0Oo();
        int size = o00ooo1.f32166OooO0O0.size();
        do {
            size--;
            if (size < 0) {
                momentSendCommentModel = null;
                break;
            } else {
                o00ooo1.OooO0Oo();
                momentSendCommentModel = (MomentSendCommentModel) o00ooo1.f32166OooO0O0.get(size);
            }
        } while (id != momentSendCommentModel.getLocalParentCid());
        if (momentSendCommentModel == null) {
            momentSendCommentModel = new MomentSendCommentModel(this.f22480Oooooo);
            StringBuilder sb = new StringBuilder();
            PostCommentDetailModel postCommentDetailModel = this.f22476Ooooo0o;
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
        this.f22492o0ooOO0 = true;
        if (z) {
            OoooO00(true);
        }
        o00OOO0 o00ooo1 = this.f22478OooooOO;
        o00ooo1.OooO0Oo();
        o00ooo1.OooO0Oo();
        int size = o00ooo1.f32166OooO0O0.size();
        do {
            size--;
            id = 0;
            if (size < 0) {
                momentSendCommentModel = null;
                break;
            } else {
                o00ooo1.OooO0Oo();
                momentSendCommentModel = (MomentSendCommentModel) o00ooo1.f32166OooO0O0.get(size);
            }
        } while (momentSendCommentModel.getLocalParentCid() > 0);
        if (momentSendCommentModel == null) {
            momentSendCommentModel = new MomentSendCommentModel(this.f22480Oooooo);
            StringBuilder sb = new StringBuilder();
            PostCommentDetailModel postCommentDetailModel = this.f22476Ooooo0o;
            Intrinsics.checkNotNull(postCommentDetailModel);
            sb.append(postCommentDetailModel.getId());
            sb.append("");
            momentSendCommentModel.setCommentSon(sb.toString(), "", "", 0L);
        }
        Oooo0O0().setSendPostCommentModel(momentSendCommentModel);
        try {
            PostCommentDetailModel postCommentDetailModel2 = this.f22476Ooooo0o;
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
        EditTextSpan view = Oooo000().f49456OooO0Oo;
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
        oO0OoOO0.OooO0Oo(window, 0);
        setContentView(Oooo000().f49453OooO00o);
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            oO0OoOO0.OooO00o(headerLayout, true, false);
        }
        Oooo000().f49461OooOO0.setOnTouchListener(new View.OnTouchListener() { // from class: o0o0Oo0.oo00o
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                PostDetailCommentSonListActivity this$0 = this.f44102Oooo0o;
                PostDetailCommentSonListActivity.OooO00o oooO00o = PostDetailCommentSonListActivity.f22473o0ooOOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.Oooo000().f49461OooOO0.setVisibility(8);
                this$0.OoooO00(false);
                return true;
            }
        });
        EmojiFaceView emojiFaceView = (EmojiFaceView) findViewById(R.id.emojiFaceView);
        EditTextSpan editTextSpan = Oooo000().f49456OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(editTextSpan, "binding.mEditContentInput");
        emojiFaceView.OooO00o(editTextSpan, true);
        Oooo000().f49456OooO0Oo.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o0o0Oo0.o00O00o0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                PostDetailCommentSonListActivity this$0 = this.f43950Oooo0o;
                PostDetailCommentSonListActivity.OooO00o oooO00o = PostDetailCommentSonListActivity.f22473o0ooOOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (z) {
                    this$0.Oooo0oo(false);
                }
            }
        });
        Oooo000().f49462OooOO0O.setOnRefreshListener(new o000O00O(this));
        Oooo000().f49462OooOO0O.setOnLoadMoreListener(new o0OO000(this, 2));
        o00O0000 o00o0000Oooo00o = Oooo00o();
        ImageView imageView = Oooo000().f49457OooO0o;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.mIvEmoji");
        o00o0000Oooo00o.OooO0O0(imageView);
        Oooo00o().f40623OooO0O0 = new o00OO000(this);
        Oooo00o().f40622OooO00o = new o00OO00O(this);
        Oooo000().f49456OooO0Oo.f11729Oooo = o00O00OO.f29370OooO0Oo;
        Oooo000().f49456OooO0Oo.addTextChangedListener(new p538o0o0Oo0.o00OO0O0(this));
        ImageView imageView2 = Oooo000().f49458OooO0o0;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.mIvAt");
        com.yalla.support.common.util.o00O0O.OooO0Oo(imageView2, new p538o0o0Oo0.o00OO(this));
        ImageView imageView3 = Oooo000().f49459OooO0oO;
        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.mIvSend");
        com.yalla.support.common.util.o00O0O.OooO0Oo(imageView3, new o00O(this));
        this.f22491o0OoOo0 = getIntent().getBooleanExtra("From", false);
        this.f22494ooOO = (MomentDetailModel) getIntent().getSerializableExtra("Data");
        this.f22476Ooooo0o = (PostCommentDetailModel) getIntent().getSerializableExtra("Module");
        StringBuilder sb = new StringBuilder();
        MomentDetailModel momentDetailModel = this.f22494ooOO;
        Intrinsics.checkNotNull(momentDetailModel);
        sb.append(momentDetailModel.getId());
        sb.append("");
        this.f22480Oooooo = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        MomentDetailModel momentDetailModel2 = this.f22494ooOO;
        Intrinsics.checkNotNull(momentDetailModel2);
        sb2.append(momentDetailModel2.getUserId());
        sb2.append("");
        this.f22482OoooooO = sb2.toString();
        this.f22485o00Oo0 = (PostCommentSonModel) getIntent().getSerializableExtra("Type");
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("initData postCommentSonModel = ");
        sbOooO0o0.append(this.f22485o00Oo0);
        o00O00.OooO0Oo(sbOooO0o0.toString());
        HeaderLayout headerLayout2 = this.f11463OoooO;
        if (headerLayout2 != null) {
            String string = getString(R.string.xxx_replies);
            StringBuilder sb3 = new StringBuilder();
            PostCommentDetailModel postCommentDetailModel = this.f22476Ooooo0o;
            Intrinsics.checkNotNull(postCommentDetailModel);
            sb3.append(postCommentDetailModel.getNum());
            sb3.append("");
            headerLayout2.setTitle(com.yalla.support.common.util.OooOo.OooO00o(string, sb3.toString()));
        }
        if (this.f22476Ooooo0o == null) {
            finish();
        } else {
            Oooo0oo(true);
            Oooo0().f11709Oooo0o = new o00Oo00.OooO0OO() { // from class: o0o0Oo0.o00O0O0
                @Override // o00Oo00.OooO0OO
                public final void OooO00o(Object obj) {
                    PostDetailCommentSonListActivity this$0 = this.f43954OooO0Oo;
                    AbsListenerTag absListenerTag = (AbsListenerTag) obj;
                    PostDetailCommentSonListActivity.OooO00o oooO00o = PostDetailCommentSonListActivity.f22473o0ooOOo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    int i2 = absListenerTag == null ? -1 : PostDetailCommentSonListActivity.OooO0O0.$EnumSwitchMapping$0[absListenerTag.ordinal()];
                    if (i2 == 1) {
                        o00O0OO0 onLogin = new o00O0OO0(this$0);
                        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                        if (Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                            onLogin.invoke();
                            return;
                        }
                        Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
                        if (activityOooO0O0 != null) {
                            o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
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
                        if (Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                            onLogin2.invoke();
                            return;
                        }
                        Activity activityOooO0O1 = o00000O.f34254OooO00o.OooO0O0();
                        if (activityOooO0O1 != null) {
                            o0OOO0o.OooO0O0(activityOooO0O1, d.R, activityOooO0O1, LoginActivity.class);
                            return;
                        }
                        return;
                    }
                    if (this$0.f22491o0OoOo0) {
                        this$0.onBackPressed();
                        return;
                    }
                    oo0o0O0 onLogin3 = new oo0o0O0(this$0);
                    Intrinsics.checkNotNullParameter(onLogin3, "onLogin");
                    if (Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                        onLogin3.invoke();
                        return;
                    }
                    Activity activityOooO0O2 = o00000O.f34254OooO00o.OooO0O0();
                    if (activityOooO0O2 != null) {
                        o0OOO0o.OooO0O0(activityOooO0O2, d.R, activityOooO0O2, LoginActivity.class);
                    }
                }
            };
            Oooo0().f22744ooOO = new o000O0Oo(this);
            PostDetailCommentSonListHeaderView postDetailCommentSonListHeaderViewOooo0 = Oooo0();
            PostCommentDetailModel postCommentDetailModel2 = this.f22476Ooooo0o;
            postDetailCommentSonListHeaderViewOooo0.OooO0oo(postCommentDetailModel2, -1);
            if (postDetailCommentSonListHeaderViewOooo0.f11708Oooo != 0) {
                postDetailCommentSonListHeaderViewOooo0.f22729OoooOoO.setVisibility(8);
                postDetailCommentSonListHeaderViewOooo0.f22727OoooOOo.OooO00o();
                postDetailCommentSonListHeaderViewOooo0.f22729OoooOoO.setText("");
                o00O00.OooO0O0("setData PostCommentDetailModel = " + postCommentDetailModel2);
                oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(postDetailCommentSonListHeaderViewOooo0.f11715OoooO0O);
                oooO00o.OooO00o(o00OOO.OooO00o.OooO0o0());
                oooO00o.OooO0OO(1, com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_e2e2e2));
                String headurl = ((PostCommentDetailModel) postDetailCommentSonListHeaderViewOooo0.f11708Oooo).getHeadurl();
                int i2 = postDetailCommentSonListHeaderViewOooo0.f22739Ooooooo;
                oooO00o.f48429OooO0OO = CloudImageUtilKt.imgSize(headurl, i2, i2);
                oooO00o.f48427OooO00o = 0;
                oooO00o.OooO0o(postDetailCommentSonListHeaderViewOooo0.f22726OoooOOO);
                postDetailCommentSonListHeaderViewOooo0.f22727OoooOOo.OooO0o(((PostCommentDetailModel) postDetailCommentSonListHeaderViewOooo0.f11708Oooo).getVip(), ((PostCommentDetailModel) postDetailCommentSonListHeaderViewOooo0.f11708Oooo).getVipLevel());
                postDetailCommentSonListHeaderViewOooo0.f22727OoooOOo.setName(p520o0o0O0O0.o00O0O.f42677OooO00o.OooO0O0(com.yalla.support.common.util.OooO.OooO0o(((PostCommentDetailModel) postDetailCommentSonListHeaderViewOooo0.f11708Oooo).getUserid()), ((PostCommentDetailModel) postDetailCommentSonListHeaderViewOooo0.f11708Oooo).getNickname()));
                postDetailCommentSonListHeaderViewOooo0.f22727OoooOOo.setKaVip(postCommentDetailModel2.kaVIPLv);
                postDetailCommentSonListHeaderViewOooo0.f22727OoooOOo.setAuthor(postDetailCommentSonListHeaderViewOooo0.f22743o0OoOo0.equals(((PostCommentDetailModel) postDetailCommentSonListHeaderViewOooo0.f11708Oooo).getUserid() + ""));
                postDetailCommentSonListHeaderViewOooo0.f22734OooooOO.OooO0OO(((PostCommentDetailModel) postDetailCommentSonListHeaderViewOooo0.f11708Oooo).isPraise());
                postDetailCommentSonListHeaderViewOooo0.OooOO0();
                postDetailCommentSonListHeaderViewOooo0.f22728OoooOo0.setText(o00O0.f48624OooO00o.OooO0Oo(((PostCommentDetailModel) postDetailCommentSonListHeaderViewOooo0.f11708Oooo).getCreateTime(), System.currentTimeMillis()));
                if (((PostCommentDetailModel) postDetailCommentSonListHeaderViewOooo0.f11708Oooo).getContent() != null) {
                    postDetailCommentSonListHeaderViewOooo0.f22729OoooOoO.setVisibility(0);
                    o0o0Oo.OooO0O0(postDetailCommentSonListHeaderViewOooo0.f11711Oooo0oo, ((PostCommentDetailModel) postDetailCommentSonListHeaderViewOooo0.f11708Oooo).getContent(), postDetailCommentSonListHeaderViewOooo0.f22729OoooOoO, new o0O000(postDetailCommentSonListHeaderViewOooo0));
                }
                boolean z = ((PostCommentDetailModel) postDetailCommentSonListHeaderViewOooo0.f11708Oooo).isSendProp() && ((PostCommentDetailModel) postDetailCommentSonListHeaderViewOooo0.f11708Oooo).getPropNum() > 0;
                postDetailCommentSonListHeaderViewOooo0.f22735OooooOo.setText(o0O0O00.OooO0oO(((PostCommentDetailModel) postDetailCommentSonListHeaderViewOooo0.f11708Oooo).getPropNum(), false));
                TextView textView = postDetailCommentSonListHeaderViewOooo0.f22735OooooOo;
                if (z) {
                    context = postDetailCommentSonListHeaderViewOooo0.f11715OoooO0O;
                    i = R.color.color_FFA16C;
                } else {
                    context = postDetailCommentSonListHeaderViewOooo0.f11715OoooO0O;
                    i = R.color.color_666666;
                }
                textView.setTextColor(o000O000.OooO00o.OooO0O0(context, i));
                postDetailCommentSonListHeaderViewOooo0.f22736Oooooo.setVisibility(0);
                postDetailCommentSonListHeaderViewOooo0.f22736Oooooo.setImageResource(R.drawable.icon_reward_gray);
                if (((PostCommentDetailModel) postDetailCommentSonListHeaderViewOooo0.f11708Oooo).isSendProp()) {
                    postDetailCommentSonListHeaderViewOooo0.f22736Oooooo.setImageResource(R.drawable.icon_reward_red);
                }
            }
            OooOooo().setHeaderView(Oooo0().f11713OoooO0);
            o000Oo0 o000oo0OooOooo = OooOooo();
            o00Oo00.OooO0O0 oooO0O0 = new o00Oo00.OooO0O0() { // from class: o0o0Oo0.o00O0O00
                @Override // o00Oo00.OooO0O0
                public final void OooO0O0(Object obj, int i3, Object obj2) {
                    PostDetailCommentSonListActivity this$0 = this.f43955OooO0Oo;
                    PostCommentSonModel data = (PostCommentSonModel) obj;
                    AbsListenerTag absListenerTag = (AbsListenerTag) obj2;
                    PostDetailCommentSonListActivity.OooO00o oooO00o2 = PostDetailCommentSonListActivity.f22473o0ooOOo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(data, "data");
                    int i4 = absListenerTag == null ? -1 : PostDetailCommentSonListActivity.OooO0O0.$EnumSwitchMapping$0[absListenerTag.ordinal()];
                    if (i4 == 1) {
                        o00O0OOO onLogin = new o00O0OOO(this$0, data);
                        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                        if (Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                            onLogin.invoke();
                            return;
                        }
                        Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
                        if (activityOooO0O0 != null) {
                            o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                            return;
                        }
                        return;
                    }
                    if (i4 != 3) {
                        return;
                    }
                    oo0oOO0 onLogin2 = new oo0oOO0(this$0, data);
                    Intrinsics.checkNotNullParameter(onLogin2, "onLogin");
                    if (Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                        onLogin2.invoke();
                        return;
                    }
                    Activity activityOooO0O1 = o00000O.f34254OooO00o.OooO0O0();
                    if (activityOooO0O1 != null) {
                        o0OOO0o.OooO0O0(activityOooO0O1, d.R, activityOooO0O1, LoginActivity.class);
                    }
                }
            };
            Intrinsics.checkNotNull(oooO0O0, "null cannot be cast to non-null type com.app.base.framework.abs.AbsListener.AbsTagDataListener<com.yalla.yalla.model.PostCommentSonModel, com.app.base.framework.abs.AbsListener.AbsListenerTag?>");
            o000oo0OooOooo.f45444OooO0Oo = oooO0O0;
            Oooo000().f49460OooO0oo.setLayoutManager(new FixLinearLayoutManager(this));
            Oooo000().f49460OooO0oo.setAdapter(OooOooo());
            this.f22483Ooooooo = new o00Oo00(this);
        }
        Oooo0o();
        p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().observe(this, new p142o00OOooO.o000Oo0(this, 5));
        ((MomentVM) this.f22493oo000o.getValue()).statisticalTime();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.app.base.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((MomentVM) this.f22493oo000o.getValue()).statisticalTime();
    }
}
