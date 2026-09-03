package com.yalla.yalla.ui.activity.moment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.adapter.imageView9Grid.ImageView9GridModel;
import com.app.base.framework.view.editTextSpan.EditTextSpan;
import com.app.base.framework.view.recyclerView.NoScrollRecyclerView;
import com.app.base.view.EmojiFaceView;
import com.app.base.view.HeaderLayout;
import com.app.base.view.pop.roomSharePop.RoomShareModel;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.support.keyboardpanel.panel.PanelLayout;
import com.yalla.yalla.common.model.MomentLogActionType;
import com.yalla.yalla.common.model.MomentLogActionTypeForward;
import com.yalla.yalla.common.model.MomentLogSourcePage;
import com.yalla.yalla.common.model.ShareWebModel;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentSendContentAtModel;
import com.yalla.yalla.model.MomentSendContentModel;
import com.yalla.yalla.model.MomentSendModel;
import com.yalla.yalla.model.MomentSendPollModel;
import com.yalla.yalla.model.MomentSendShareModel;
import com.yalla.yalla.model.MomentSendShareType;
import com.yalla.yalla.model.MomentType;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.view.SendMomentEmojiAtPollView;
import com.yalla.yalla.ui.view.SendMomentLocationPowerView;
import com.yalla.yalla.ui.view.SendMomentPollView;
import com.yalla.yalla.ui.view.SendMomentShareView;
import com.yalla.yalla.ui.view.SendMomentTipsView;
import com.yalla.yalla.ui.view.SendMomentTopicView;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import o00OO0O0.o0OOO0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooo.o00OOO0O;
import p164o00OoOo0.o00OO0OO;
import p168o00Ooo0.o0O0O00;
import p173o00OooO0.o00OO;
import p173o00OooO0.o0o0Oo;
import p254o00ooO0O.o00000O;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p255o00ooO0o.oo0oOO0;
import p470o0Oooo0.o00O0000;
import p478o0OooooO.oO0OoOO0;
import p498o0o00Oo0.o00O0OO;
import p499o0o00OoO.o000000;
import p499o0o00OoO.o000000O;
import p515o0o0O00.o00O00;
import p516o0o0O000.o0Oo0oo;
import p522o0o0O0o.o000O0;
import p522o0o0O0o.o00O0;
import p522o0o0O0o.oOO00O;
import p524o0o0O0oO.o0O0O0Oo;
import p534o0o0OOo0.o00O0O0;
import p538o0o0Oo0.o000;
import p538o0o0Oo0.o0000O;
import p538o0o0Oo0.o0000O0O;
import p538o0o0Oo0.o0000OO0;
import p538o0o0Oo0.o000O;
import p538o0o0Oo0.o000O000;
import p538o0o0Oo0.o000O0Oo;
import p538o0o0Oo0.o000O0o;
import p538o0o0Oo0.o000OO;
import p538o0o0Oo0.o000Oo0;
import p541o0o0Oo0o.o00O000;
import p541o0o0Oo0o.oo00o;
import p569o0oOo0OO.o000O00O;
import p601o0oo00Oo.o0OOo000;
import p601o0oo00Oo.o0o0000;
import p601o0oo00Oo.oO00000;
import p617o0oo0o.o000O00;
import p649o0ooOOoo.b7;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/MomentSendActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public class MomentSendActivity extends BaseActivityK {

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22367o00oO0o = new OooO00o();

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @Nullable
    public TopicInfoModel f22373OooooOo;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @Nullable
    public oo00o f22376OoooooO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public long f22378o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public boolean f22379o00Oo0;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    @Nullable
    public String f22383o0OoOo0;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22368OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(b7.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public String f22369Ooooo00 = "";

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f22370Ooooo0o = -1;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final Lazy f22371OooooO0 = LazyKt.lazy(new OooO());

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public final Lazy f22372OooooOO = LazyKt.lazy(new OooOOO());

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public final int f22375Oooooo0 = 10;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public final int f22374Oooooo = 3;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @NotNull
    public final Lazy f22377Ooooooo = LazyKt.lazy(new OooOOO0());

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public final long f22385ooOO = 1000;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22380o00Ooo = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MomentVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.MomentSendActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.moment.MomentSendActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.moment.MomentSendActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f22399Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22399Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    @NotNull
    public final Lazy f22381o00o0O = LazyKt.lazy(new OooO0o());

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    @NotNull
    public String f22382o00ooo = "";

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    @NotNull
    public final p498o0o00Oo0.oo00o f22384oo000o = new p498o0o00Oo0.oo00o();

    public static final class OooO extends Lambda implements Function0<MomentSendShareModel> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentSendShareModel invoke() {
            Serializable serializableExtra = MomentSendActivity.this.getIntent().getSerializableExtra("SHARE_POST_MODEL");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.yalla.yalla.model.MomentSendShareModel");
            return (MomentSendShareModel) serializableExtra;
        }
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: com.yalla.yalla.ui.activity.moment.MomentSendActivity$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0255OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Context f22387Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ MomentSendShareModel f22388Oooo0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0255OooO00o(Context context, MomentSendShareModel momentSendShareModel) {
                super(0);
                this.f22387Oooo0o = context;
                this.f22388Oooo0oO = momentSendShareModel;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Intent intent = new Intent(this.f22387Oooo0o, (Class<?>) MomentSendActivity.class);
                intent.putExtra("SHARE_POST_MODEL", this.f22388Oooo0oO);
                this.f22387Oooo0o.startActivity(intent);
                return null;
            }
        }

        public final void OooO00o(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            MomentSendShareModel momentSendShareModel = new MomentSendShareModel(MomentType.Text.getValue());
            momentSendShareModel.setSharePostType(MomentSendShareType.CreateText);
            OooO0O0(context, momentSendShareModel);
        }

        public final void OooO0O0(@NotNull Context context, @NotNull MomentSendShareModel sharePostModel) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sharePostModel, "sharePostModel");
            C0255OooO00o onLogin = new C0255OooO00o(context, sharePostModel);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
                return;
            }
            Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
            if (activityOooO0O0 != null) {
                LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
            }
        }
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[MomentAdapterTag.values().length];
            iArr[MomentAdapterTag.PrivateChat.ordinal()] = 1;
            iArr[MomentAdapterTag.PostDetailActivity.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[WebFrom.values().length];
            iArr2[WebFrom.RoomMainBanner.ordinal()] = 1;
            iArr2[WebFrom.MomentActivityBanner.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[MomentSendShareType.values().length];
            iArr3[MomentSendShareType.ShareRoom.ordinal()] = 1;
            iArr3[MomentSendShareType.ShareEvent.ordinal()] = 2;
            iArr3[MomentSendShareType.ShareWeb.ordinal()] = 3;
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<String, String> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f22389Oooo0o = new OooO0OO();

        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<o000O00> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000O00 invoke() {
            return new o000O00(MomentSendActivity.this);
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Object> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f22392Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(Ref.BooleanRef booleanRef) {
            super(0);
            this.f22392Oooo0oO = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            MomentSendModel momentSendModelOooo00O;
            String jSONString;
            String jSONString2;
            MomentSendContentModel content;
            MomentSendActivity momentSendActivity = MomentSendActivity.this;
            OooO00o oooO00o = MomentSendActivity.f22367o00oO0o;
            if (momentSendActivity.Oooo00O().isInEdit()) {
                return null;
            }
            if (this.f22392Oooo0oO.element) {
                List<String> data = MomentSendActivity.this.Oooo000().f44148OooO0Oo.getData();
                Intrinsics.checkNotNull(data, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String?>");
                ArrayList<String> arrayList = new ArrayList();
                for (String str : (ArrayList) data) {
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                MomentSendActivity momentSendActivity2 = MomentSendActivity.this;
                oo00o oo00oVar = momentSendActivity2.f22376OoooooO;
                String str2 = "";
                if (oo00oVar != null) {
                    momentSendModelOooo00O = momentSendActivity2.Oooo00O();
                    MomentSendContentModel momentSendContentModel = new MomentSendContentModel(o0o0Oo.OooO00o(oo00oVar.f44173OooO00o, oo00oVar.f44174OooO0O0));
                    ArrayList<? extends p150o00Oo0Oo.OooOo> arrayListOooO0OO = oo00oVar.f44174OooO0O0.getSpanManager().OooO0OO("@");
                    for (int i = 0; i < arrayListOooO0OO.size(); i++) {
                        p150o00Oo0Oo.OooOo oooOo = arrayListOooO0OO.get(i);
                        if (oooOo != null) {
                            momentSendContentModel.getAt().add(new MomentSendContentAtModel(android.support.v4.media.session.OooOOO0.OooO00o(new StringBuilder(), oooOo.f32173Oooo0oO, ""), oooOo.f32172Oooo0o));
                        }
                    }
                    momentSendModelOooo00O.setContent(momentSendContentModel);
                    if (momentSendModelOooo00O.getType() == MomentType.Text.getValue() && arrayList.size() > 1) {
                        momentSendModelOooo00O.setType(MomentType.Image.getValue());
                    }
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("sendPost\n sendPostModel.Text = ");
                    sbOooO0o0.append(momentSendContentModel.getContent());
                    sbOooO0o0.append("\n sendPostModel.Text.Length = ");
                    sbOooO0o0.append(momentSendContentModel.getContent().length());
                    sbOooO0o0.append("\n sendPostModel = ");
                    sbOooO0o0.append(momentSendModelOooo00O.toJSONString());
                    o00O00.OooO(sbOooO0o0.toString());
                } else {
                    momentSendModelOooo00O = null;
                }
                TopicInfoModel topicInfoModel = MomentSendActivity.this.f22373OooooOo;
                if (topicInfoModel != null && momentSendModelOooo00O != null && (content = momentSendModelOooo00O.getContent()) != null) {
                    content.setCircle(topicInfoModel.getId(), topicInfoModel.getName());
                }
                MomentSendPollModel sendMomentPoll = MomentSendActivity.this.OooOooO().f48992OooOO0.getSendMomentPoll();
                p137o00OO0oo.OooOOO0 oooOOO0 = p137o00OO0oo.OooOOO0.f31661OooO00o;
                p137o00OO0oo.OooOOO0 oooOOO1 = p137o00OO0oo.OooOOO0.f31661OooO00o;
                p497o0o00Oo.OooOOO0 oooOOO2 = p497o0o00Oo.OooOOO0.f41180OooO00o;
                o000000O o000000oOooOO0 = p497o0o00Oo.OooOOO0.OooOO0();
                Objects.requireNonNull(o000000oOooOO0);
                if (momentSendModelOooo00O == null || (jSONString = momentSendModelOooo00O.toJSONString()) == null) {
                    jSONString = "";
                }
                o000000oOooOO0.OooOO0o(jSONString);
                p137o00OO0oo.OooOOO0.OooO0O0().clear();
                p137o00OO0oo.OooOOO0.OooO0O0().addAll(arrayList);
                o000000O o000000oOooOO1 = p497o0o00Oo.OooOOO0.OooOO0();
                Objects.requireNonNull(o000000oOooOO1);
                StringBuffer stringBuffer = new StringBuffer();
                for (String str3 : arrayList) {
                    if (stringBuffer.length() > 0) {
                        stringBuffer.append(",");
                    }
                    stringBuffer.append(str3);
                }
                String string = stringBuffer.toString();
                Intrinsics.checkNotNullExpressionValue(string, "stringBuffer.toString()");
                o000000oOooOO1.OooOO0O(string);
                p137o00OO0oo.OooOOO0 oooOOO3 = p137o00OO0oo.OooOOO0.f31661OooO00o;
                p137o00OO0oo.OooOOO0 oooOOO4 = p137o00OO0oo.OooOOO0.f31661OooO00o;
                p497o0o00Oo.OooOOO0 oooOOO5 = p497o0o00Oo.OooOOO0.f41180OooO00o;
                o000000O o000000oOooOO2 = p497o0o00Oo.OooOOO0.OooOO0();
                Objects.requireNonNull(o000000oOooOO2);
                if (sendMomentPoll != null && (jSONString2 = sendMomentPoll.toJSONString()) != null) {
                    str2 = jSONString2;
                }
                o000000oOooOO2.OooOOO0(str2);
            }
            MomentSendActivity.this.finish();
            return null;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Object> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f22394Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(Ref.BooleanRef booleanRef) {
            super(0);
            this.f22394Oooo0oO = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            MomentSendActivity momentSendActivity = MomentSendActivity.this;
            OooO00o oooO00o = MomentSendActivity.f22367o00oO0o;
            if (momentSendActivity.Oooo00O().isInEdit()) {
                MomentSendActivity.this.finish();
                return null;
            }
            if (this.f22394Oooo0oO.element) {
                p137o00OO0oo.OooOOO0 oooOOO0 = p137o00OO0oo.OooOOO0.f31661OooO00o;
                p137o00OO0oo.OooOOO0.OooO00o();
                MomentSendActivity.this.finish();
            }
            return null;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<MomentSendModel> {
        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentSendModel invoke() {
            MomentSendModel momentSendModel = new MomentSendModel(null, 1, null);
            p137o00OO0oo.OooOOO0 oooOOO0 = p137o00OO0oo.OooOOO0.f31661OooO00o;
            p497o0o00Oo.OooOOO0 oooOOO1 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            o000000O o000000oOooOO0 = p497o0o00Oo.OooOOO0.OooOO0();
            Objects.requireNonNull(o000000oOooOO0);
            MomentSendModel momentSendModel2 = (MomentSendModel) o0Oo0oo.OooO0OO(o000000oOooOO0.OooO0Oo("sendModel" + p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue(), ""), MomentSendModel.class);
            o00O00.OooO0O0("getSendModel fromJson = " + momentSendModel2 + "= ");
            p137o00OO0oo.OooOOO0 oooOOO2 = p137o00OO0oo.OooOOO0.f31661OooO00o;
            if (momentSendModel2 == null) {
                return momentSendModel;
            }
            MomentSendActivity momentSendActivity = MomentSendActivity.this;
            OooO00o oooO00o = MomentSendActivity.f22367o00oO0o;
            if (momentSendActivity.OooOooo().getType() != MomentType.Text.getValue()) {
                return momentSendModel;
            }
            momentSendActivity.f22379o00Oo0 = true;
            return momentSendModel2;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<o00O000> {
        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00O000 invoke() {
            MomentSendActivity momentSendActivity = MomentSendActivity.this;
            OooO00o oooO00o = MomentSendActivity.f22367o00oO0o;
            NoScrollRecyclerView noScrollRecyclerView = momentSendActivity.OooOooO().f48987OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(noScrollRecyclerView, "binding.imagesRecyclerView");
            ImageView imageView = MomentSendActivity.this.OooOooO().f48990OooO0oO;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.mIvAddImage");
            o00O000 o00o001 = new o00O000(momentSendActivity, noScrollRecyclerView, imageView);
            MomentSendActivity momentSendActivity2 = MomentSendActivity.this;
            o00o001.f44150OooO0o0 = new com.yalla.yalla.ui.activity.moment.OooOO0O(momentSendActivity2);
            o00o001.f44149OooO0o = new com.yalla.yalla.ui.activity.moment.OooOOO0(momentSendActivity2);
            return o00o001;
        }
    }

    public static final void OooOoo(MomentSendActivity momentSendActivity) {
        String strOooO;
        momentSendActivity.OooOooO().f48991OooO0oo.OooO0O0();
        if (p168o00Ooo0.o0OoOo0.OooO0o0(momentSendActivity.OooOooO().f48988OooO0o) > 1000) {
            ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.Input_a_maximum_of_1000_characters));
            return;
        }
        if (p168o00Ooo0.o0OoOo0.OooO0Oo(momentSendActivity.OooOooO().f48988OooO0o) > 50) {
            ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.char_room_edit1));
            return;
        }
        if (momentSendActivity.OooOooo().getType() != MomentType.Share.getValue() && momentSendActivity.OooOooo().getType() != MomentType.Forward.getValue() && Intrinsics.areEqual("", StringsKt.trim((CharSequence) momentSendActivity.OooOooO().f48988OooO0o.getText().toString()).toString()) && momentSendActivity.Oooo000().f44148OooO0Oo.getData().size() == 1) {
            ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.please_input_dynamic));
            return;
        }
        List<String> data = momentSendActivity.Oooo000().f44148OooO0Oo.getData();
        Intrinsics.checkNotNull(data, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
        ArrayList<String> arrayList = (ArrayList) data;
        MomentLogSourcePage sourcePage = o000O00O.OooO00o(momentSendActivity.OooOooo().getMomentAdapterTag());
        MomentSendModel momentSendModel = null;
        if (sourcePage != null && momentSendActivity.OooOooo().getForwardMomentDetailModel() != null) {
            MomentDetailModel forwardMomentDetailModel = momentSendActivity.OooOooo().getForwardMomentDetailModel();
            if (!o0O0O00.OooO(String.valueOf(forwardMomentDetailModel != null ? Long.valueOf(forwardMomentDetailModel.getUserId()) : null))) {
                MomentLogActionTypeForward momentLogActionTypeForward = new MomentLogActionTypeForward(null, null, 3, null);
                MomentDetailModel forwardMomentDetailModel2 = momentSendActivity.OooOooo().getForwardMomentDetailModel();
                momentLogActionTypeForward.setObject_userid(String.valueOf(forwardMomentDetailModel2 != null ? Long.valueOf(forwardMomentDetailModel2.getUserId()) : null));
                MomentDetailModel forwardMomentDetailModel3 = momentSendActivity.OooOooo().getForwardMomentDetailModel();
                if (forwardMomentDetailModel3 == null || (strOooO = com.yalla.support.common.util.OooO.OooO(Long.valueOf(forwardMomentDetailModel3.getId()), "")) == null) {
                    strOooO = "";
                }
                momentLogActionTypeForward.setDiscoveryid(strOooO);
                MomentLogActionType actionType = MomentLogActionType.forward;
                String actionInfo = momentLogActionTypeForward.toJson();
                MomentDetailModel forwardMomentDetailModel4 = momentSendActivity.OooOooo().getForwardMomentDetailModel();
                String sessionId = forwardMomentDetailModel4 != null ? forwardMomentDetailModel4.getSessionId() : null;
                Intrinsics.checkNotNullParameter(sourcePage, "sourcePage");
                Intrinsics.checkNotNullParameter(actionType, "actionType");
                Intrinsics.checkNotNullParameter(actionInfo, "actionInfo");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00O0OO(sourcePage, actionType, actionInfo, sessionId, null), 3, null);
            }
        }
        oo00o oo00oVar = momentSendActivity.f22376OoooooO;
        if (oo00oVar != null) {
            MomentSendModel momentSendModelOooo00O = momentSendActivity.Oooo00O();
            TopicInfoModel topicInfoModel = momentSendActivity.f22373OooooOo;
            o000O o000o = new o000O(momentSendActivity);
            oo00oVar.f44177OooO0o = topicInfoModel;
            o00O00.OooO0O0("PostContentUtils sendPost");
            boolean z = arrayList.size() > 1;
            if (oo00oVar.f44174OooO0O0.getSpanManager().OooO0Oo("@") > oo00oVar.f44176OooO0Oo) {
                ToastUtil.OooO0O0 oooO0O0 = ToastUtil.f12567OooO00o;
                String string = oo00oVar.f44173OooO00o.getString(R.string.Mention_a_maximum_of_XXX_people);
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("");
                sbOooO0o0.append(oo00oVar.f44176OooO0Oo);
                oooO0O0.OooO0O0(com.yalla.support.common.util.OooOo.OooO00o(string, sbOooO0o0.toString()));
            } else if (oo00oVar.f44174OooO0O0.getSpanManager().OooO0Oo("#") > oo00oVar.f44178OooO0o0) {
                ToastUtil.f12567OooO00o.OooO0O0(oo00oVar.f44173OooO00o.getString(R.string.You_can_add_3_topics_at_most));
            } else {
                MomentSendContentModel momentSendContentModel = new MomentSendContentModel(o0o0Oo.OooO00o(oo00oVar.f44173OooO00o, oo00oVar.f44174OooO0O0));
                ArrayList<? extends p150o00Oo0Oo.OooOo> arrayListOooO0OO = oo00oVar.f44174OooO0O0.getSpanManager().OooO0OO("@");
                for (int i = 0; i < arrayListOooO0OO.size(); i++) {
                    p150o00Oo0Oo.OooOo oooOo = arrayListOooO0OO.get(i);
                    if (oooOo != null) {
                        momentSendContentModel.getAt().add(new MomentSendContentAtModel(android.support.v4.media.session.OooOOO0.OooO00o(new StringBuilder(), oooOo.f32173Oooo0oO, ""), oooOo.f32172Oooo0o));
                    }
                }
                TopicInfoModel topicInfoModel2 = oo00oVar.f44177OooO0o;
                if (topicInfoModel2 != null && topicInfoModel2.getId() > 0) {
                    momentSendContentModel.setCircle(oo00oVar.f44177OooO0o.getId(), oo00oVar.f44177OooO0o.getName());
                }
                if (momentSendContentModel.getContent().isEmpty() && oo00oVar.f44179OooO0oO.getType() == MomentType.Share.getValue()) {
                    if (oo00oVar.f44179OooO0oO.getRoomShareModel() != null) {
                        momentSendContentModel.setContent(com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Room_ID_XXX), oo00oVar.f44179OooO0oO.getRoomShareModel().getRoomIdx()));
                    }
                    if (oo00oVar.f44179OooO0oO.getEventModel() != null) {
                        momentSendContentModel.setContent(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.event_share_moment));
                    }
                }
                momentSendModelOooo00O.setContent(momentSendContentModel);
                if (momentSendModelOooo00O.getType() == MomentType.Text.getValue() && z) {
                    momentSendModelOooo00O.setType(MomentType.Image.getValue());
                }
                StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("sendPost sendPostModel.Text = ");
                sbOooO0o1.append(momentSendContentModel.getContent());
                sbOooO0o1.append(", sendPostModel.Text.Length = ");
                sbOooO0o1.append(momentSendContentModel.getContent().length());
                sbOooO0o1.append("\n sendPostModel = ");
                sbOooO0o1.append(momentSendModelOooo00O.toJSONString());
                o00O00.OooO(sbOooO0o1.toString());
                momentSendModel = momentSendModelOooo00O;
            }
            if (momentSendModel == null) {
                return;
            }
            if (momentSendModel.getContent().getCircleId() > 0 && com.android.billingclient.api.o00000O.OooO0O0().OooO0Oo("FIRST_SEND_POST_FOR_TOPIC", true)) {
                com.android.billingclient.api.o00000O.OooO0O0().OooO0oo("FIRST_SEND_POST_FOR_TOPIC", false);
                ToastUtil.f12567OooO00o.OooO0O0(oo00oVar.f44173OooO00o.getString(R.string.first_send_post_for_topic));
            }
            momentSendModel.setPoll(oo00oVar.f44175OooO0OO.getSendMomentPoll());
            if (momentSendModel.getPoll() != null) {
                momentSendModel.setType(MomentType.Poll.getValue());
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (String str : arrayList) {
                    if (str != null && !str.isEmpty()) {
                        arrayList2.add(str);
                    }
                }
                momentSendModel.setListSendPostImage(arrayList2);
            }
            o000o.invoke(momentSendModel);
        }
    }

    public final b7 OooOooO() {
        return (b7) this.f22368OoooOoo.getValue();
    }

    public final MomentSendShareModel OooOooo() {
        return (MomentSendShareModel) this.f22371OooooO0.getValue();
    }

    public final boolean Oooo0() {
        MomentDetailModel editMomentDetailModel;
        if (Oooo00O().isInEdit() && (editMomentDetailModel = OooOooo().getEditMomentDetailModel()) != null) {
            o00O000 o00o000Oooo000 = Oooo000();
            Objects.requireNonNull(o00o000Oooo000);
            ArrayList arrayList = new ArrayList();
            List<String> data = o00o000Oooo000.f44148OooO0Oo.getData();
            Intrinsics.checkNotNullExpressionValue(data, "adapter.data");
            for (String it : data) {
                if (o00O0.OooO0o0(it)) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    arrayList.add(it);
                }
            }
            if (!o000O0.OooO0O0(arrayList, Oooo00O().getHttpImagesFromEditMomentDetailUrl(), OooO0OO.f22389Oooo0o) || !Intrinsics.areEqual(editMomentDetailModel.getAddress(), Oooo00O().getAddress()) || !Intrinsics.areEqual(this.f22382o00ooo, OooOooO().f48988OooO0o.getText().toString())) {
                return true;
            }
        }
        return false;
    }

    public final o00O000 Oooo000() {
        return (o00O000) this.f22377Ooooooo.getValue();
    }

    public final MomentSendModel Oooo00O() {
        return (MomentSendModel) this.f22372OooooOO.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MomentVM Oooo00o() {
        return (MomentVM) this.f22380o00Ooo.getValue();
    }

    public final boolean Oooo0O0() {
        OooOooO().f48991OooO0oo.OooO0O0();
        int size = Oooo000().f44148OooO0Oo.getData().size();
        String string = StringsKt.trim((CharSequence) OooOooO().f48988OooO0o.getText().toString()).toString();
        if (!(string.length() > 0) && size <= 1) {
            p137o00OO0oo.OooOOO0 oooOOO0 = p137o00OO0oo.OooOOO0.f31661OooO00o;
            MomentSendPollModel sendMomentPoll = OooOooO().f48992OooOO0.getSendMomentPoll();
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("");
            if (string == null) {
                string = "";
            }
            sbOooO0o0.append(string);
            String string2 = sbOooO0o0.toString();
            if (sendMomentPoll != null) {
                for (MomentSendPollModel.Option option : sendMomentPoll.getOption()) {
                    StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0(string2);
                    sbOooO0o1.append(option.getText());
                    string2 = sbOooO0o1.toString();
                }
            }
            if (!(!StringsKt.isBlank(string2)) && TextUtils.isEmpty(Oooo00O().getSourcesid())) {
                p137o00OO0oo.OooOOO0 oooOOO1 = p137o00OO0oo.OooOOO0.f31661OooO00o;
                p137o00OO0oo.OooOOO0.OooO00o();
                finish();
                return true;
            }
        }
        String strOooO0OO = o000O0O0.OooO0OO(R.string.send_post_keep_this_edit);
        String strOooO0OO2 = o000O0O0.OooO0OO(R.string.Discard);
        String strOooO0OO3 = o000O0O0.OooO0OO(R.string.Save);
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        if (Oooo00O().isInEdit()) {
            strOooO0OO = o000O0O0.OooO0OO(R.string.Moment_Edit_Page_Changes);
            strOooO0OO2 = o000O0O0.OooO0OO(R.string.Moment_Edit_Page_Discard);
            strOooO0OO3 = o000O0O0.OooO0OO(R.string.Cancel);
            if (!Oooo0()) {
                p137o00OO0oo.OooOOO0 oooOOO2 = p137o00OO0oo.OooOOO0.f31661OooO00o;
                p137o00OO0oo.OooOOO0.OooO00o();
                finish();
                return false;
            }
        } else if (OooOooo().getType() == MomentType.Share.getValue() || OooOooo().getType() == MomentType.Forward.getValue()) {
            strOooO0OO = o000O0O0.OooO0OO(R.string.Sure_to_quit_editing);
            strOooO0OO2 = o000O0O0.OooO0OO(R.string.Cancel);
            strOooO0OO3 = o000O0O0.OooO0OO(R.string.OK);
            booleanRef.element = false;
        }
        oo0oOO0 oo0ooo0 = new oo0oOO0(this);
        oo0ooo0.OooOo0O(strOooO0OO);
        if (o00O0.OooO0o0(strOooO0OO3)) {
            oo0ooo0.OooOOo0(strOooO0OO3);
            oo0ooo0.OooOo0o(new OooOO0(booleanRef));
        }
        oo0ooo0.OooOoO0(strOooO0OO2);
        oo0ooo0.OooOo(new OooOO0O(booleanRef));
        oo0ooo0.OooOOO0();
        return false;
    }

    public final void Oooo0OO() {
        TextView f12044o000000;
        TextView f12044o000001;
        TextView f12044o000002;
        TextView f12044o000003;
        TextView f12044o000004;
        TextView f12044o000005;
        TextView f12044o000006;
        TextView f12044o000007;
        if (Oooo00O().isInEdit()) {
            if (Oooo0()) {
                HeaderLayout headerLayout = this.f11463OoooO;
                f12044o000000 = headerLayout != null ? headerLayout.getF12044o000000() : null;
                if (f12044o000000 != null) {
                    f12044o000000.setClickable(true);
                }
                HeaderLayout headerLayout2 = this.f11463OoooO;
                if (headerLayout2 == null || (f12044o000007 = headerLayout2.getF12044o000000()) == null) {
                    return;
                }
                f12044o000007.setTextColor(-1);
                return;
            }
            HeaderLayout headerLayout3 = this.f11463OoooO;
            f12044o000000 = headerLayout3 != null ? headerLayout3.getF12044o000000() : null;
            if (f12044o000000 != null) {
                f12044o000000.setClickable(false);
            }
            HeaderLayout headerLayout4 = this.f11463OoooO;
            if (headerLayout4 == null || (f12044o000006 = headerLayout4.getF12044o000000()) == null) {
                return;
            }
            f12044o000006.setTextColor(-1962934273);
            return;
        }
        if (OooOooo().getType() == MomentType.Share.getValue() || OooOooo().getType() == MomentType.Forward.getValue()) {
            HeaderLayout headerLayout5 = this.f11463OoooO;
            f12044o000000 = headerLayout5 != null ? headerLayout5.getF12044o000000() : null;
            if (f12044o000000 != null) {
                f12044o000000.setClickable(true);
            }
            HeaderLayout headerLayout6 = this.f11463OoooO;
            if (headerLayout6 == null || (f12044o000001 = headerLayout6.getF12044o000000()) == null) {
                return;
            }
            f12044o000001.setTextColor(-1);
            return;
        }
        MomentSendPollModel sendMomentPoll = OooOooO().f48992OooOO0.getSendMomentPoll();
        if (sendMomentPoll == null) {
            int size = Oooo000().f44148OooO0Oo.getData().size();
            Editable text = OooOooO().f48988OooO0o.getText();
            Intrinsics.checkNotNullExpressionValue(text, "binding.mEditContent.text");
            if ((text.length() > 0) || size > 1) {
                HeaderLayout headerLayout7 = this.f11463OoooO;
                f12044o000000 = headerLayout7 != null ? headerLayout7.getF12044o000000() : null;
                if (f12044o000000 != null) {
                    f12044o000000.setClickable(true);
                }
                HeaderLayout headerLayout8 = this.f11463OoooO;
                if (headerLayout8 == null || (f12044o000002 = headerLayout8.getF12044o000000()) == null) {
                    return;
                }
                f12044o000002.setTextColor(-1);
                return;
            }
            HeaderLayout headerLayout9 = this.f11463OoooO;
            f12044o000000 = headerLayout9 != null ? headerLayout9.getF12044o000000() : null;
            if (f12044o000000 != null) {
                f12044o000000.setClickable(false);
            }
            HeaderLayout headerLayout10 = this.f11463OoooO;
            if (headerLayout10 == null || (f12044o000003 = headerLayout10.getF12044o000000()) == null) {
                return;
            }
            f12044o000003.setTextColor(-1962934273);
            return;
        }
        Iterator<T> it = sendMomentPoll.getOption().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((MomentSendPollModel.Option) it.next()).getText().length() > 0) {
                i++;
            }
        }
        Editable text2 = OooOooO().f48988OooO0o.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "binding.mEditContent.text");
        if (!(text2.length() > 0) || i < 2 || sendMomentPoll.getExpireTime() <= 0) {
            HeaderLayout headerLayout11 = this.f11463OoooO;
            f12044o000000 = headerLayout11 != null ? headerLayout11.getF12044o000000() : null;
            if (f12044o000000 != null) {
                f12044o000000.setClickable(false);
            }
            HeaderLayout headerLayout12 = this.f11463OoooO;
            if (headerLayout12 == null || (f12044o000004 = headerLayout12.getF12044o000000()) == null) {
                return;
            }
            f12044o000004.setTextColor(-1962934273);
            return;
        }
        HeaderLayout headerLayout13 = this.f11463OoooO;
        f12044o000000 = headerLayout13 != null ? headerLayout13.getF12044o000000() : null;
        if (f12044o000000 != null) {
            f12044o000000.setClickable(true);
        }
        HeaderLayout headerLayout14 = this.f11463OoooO;
        if (headerLayout14 == null || (f12044o000005 = headerLayout14.getF12044o000000()) == null) {
            return;
        }
        f12044o000005.setTextColor(-1);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        EditTextSpan view = OooOooO().f48988OooO0o;
        Intrinsics.checkNotNullExpressionValue(view, "binding.mEditContent");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        InputMethodManager inputMethodManagerOooO00o = p470o0Oooo0.o00O000.OooO00o(context);
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "view.context");
        inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(context2.getApplicationContext(), new Handler()));
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        HeaderLayout headerLayout;
        super.onCreate(bundle);
        setContentView(OooOooO().f48984OooO00o);
        MomentSendContentModel content = Oooo00O().getContent();
        if (content != null && content.hasCircle()) {
            TopicInfoModel topicInfoModel = new TopicInfoModel();
            topicInfoModel.setId(content.getCircleId());
            String circleName = content.getCircleName();
            if (circleName == null) {
                circleName = "";
            }
            topicInfoModel.setName(circleName);
            this.f22373OooooOo = topicInfoModel;
        }
        Oooo00O().setType(OooOooo().getType());
        Oooo00O().setEditToken(o00O0.OooO0oO(OooOooo().getEditToken()));
        int i = 0;
        Oooo00O().setEditedNum(oOO00O.OooO0Oo(OooOooo().getEditedNum(), 0));
        Oooo00O().setEditMaxNum(oOO00O.OooO0Oo(OooOooo().getEditMaxNum(), 0));
        MomentDetailModel editMomentDetailModel = OooOooo().getEditMomentDetailModel();
        if (editMomentDetailModel != null) {
            Oooo00O().setPostId(oOO00O.OooO0o(Long.valueOf(editMomentDetailModel.getId())));
            for (ImageView9GridModel imageView9GridModel : editMomentDetailModel.getImageInfoList()) {
                Oooo00O().getHttpImagesFromEditMomentDetail().add(imageView9GridModel);
                List<String> httpImagesFromEditMomentDetailUrl = Oooo00O().getHttpImagesFromEditMomentDetailUrl();
                String url = imageView9GridModel.getUrl();
                Intrinsics.checkNotNullExpressionValue(url, "it.url");
                httpImagesFromEditMomentDetailUrl.add(url);
            }
            Oooo00O().setForward(editMomentDetailModel.getForward());
            Oooo00O().setForwardContentStr(editMomentDetailModel.getForwardContent());
        }
        int type = OooOooo().getType();
        MomentType momentType = MomentType.Share;
        int i2 = 3;
        int i3 = 4;
        int i4 = 1;
        if (type == momentType.getValue()) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("分享 mRoomShareModel ");
            sbOooO0o0.append(OooOooo().getRoomShareModel());
            o00O00.OooO(sbOooO0o0.toString());
            int i5 = OooO0O0.$EnumSwitchMapping$2[OooOooo().getSharePostType().ordinal()];
            if (i5 == 1) {
                RoomShareModel roomShareModel = OooOooo().getRoomShareModel();
                if (roomShareModel != null) {
                    MomentSendModel momentSendModelOooo00O = Oooo00O();
                    String roomid = roomShareModel.getRoomid();
                    Intrinsics.checkNotNullExpressionValue(roomid, "it.roomid");
                    momentSendModelOooo00O.setSourcesid(roomid);
                    Oooo00O().setShareType(roomShareModel.getType());
                    int type2 = roomShareModel.getType();
                    if (type2 == WebFrom.RoomMainBanner.getValue()) {
                        Oooo00O().setShareType(3);
                    } else if (type2 == WebFrom.MomentActivityBanner.getValue()) {
                        Oooo00O().setShareType(4);
                    }
                }
            } else if (i5 != 2) {
                if (i5 == 3) {
                    StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("分享Web sharePostModel ");
                    sbOooO0o1.append(OooOooo().getWebModel());
                    o00O00.OooO(sbOooO0o1.toString());
                    ShareWebModel webModel = OooOooo().getWebModel();
                    if (webModel != null) {
                        MomentSendModel momentSendModelOooo00O2 = Oooo00O();
                        String id = webModel.getId();
                        if (id == null) {
                            id = "";
                        }
                        momentSendModelOooo00O2.setSourcesid(id);
                        WebFrom webFrom = webModel.getWebFrom();
                        int i6 = webFrom == null ? -1 : OooO0O0.$EnumSwitchMapping$1[webFrom.ordinal()];
                        if (i6 == 1) {
                            Oooo00O().setType(momentType.getValue());
                            Oooo00O().setShareType(3);
                        } else if (i6 == 2) {
                            Oooo00O().setType(momentType.getValue());
                            Oooo00O().setShareType(4);
                        }
                    }
                }
            } else if (OooOooo().getEventModel() != null) {
                StringBuilder sbOooO0o2 = OooO00o.OooO00o.OooO0o0("分享房主活动 sharePostModel ");
                sbOooO0o2.append(OooOooo().getEventModel());
                o00O00.OooO(sbOooO0o2.toString());
                MomentSendModel momentSendModelOooo00O3 = Oooo00O();
                StringBuilder sb = new StringBuilder();
                EventModel eventModel = OooOooo().getEventModel();
                sb.append(eventModel != null ? Long.valueOf(eventModel.getId()) : null);
                sb.append("");
                momentSendModelOooo00O3.setSourcesid(sb.toString());
                Oooo00O().setType(MomentType.Event.getValue());
                Oooo00O().setShareType(20);
            }
        } else if (type == MomentType.Forward.getValue()) {
            if (OooOooo().getForwardMomentDetailModel() != null) {
                StringBuilder sbOooO0o3 = OooO00o.OooO00o.OooO0o0("转发 sharePostModel.postDetailModel ");
                sbOooO0o3.append(OooOooo().getForwardMomentDetailModel());
                o00O00.OooO(sbOooO0o3.toString());
                MomentSendModel momentSendModelOooo00O4 = Oooo00O();
                StringBuilder sb2 = new StringBuilder();
                MomentDetailModel forwardMomentDetailModel = OooOooo().getForwardMomentDetailModel();
                sb2.append(forwardMomentDetailModel != null ? Long.valueOf(forwardMomentDetailModel.getId()) : null);
                sb2.append("");
                momentSendModelOooo00O4.setSourcesid(sb2.toString());
            }
        } else if (type == MomentType.Image.getValue()) {
            String imagePath = OooOooo().getImagePath();
            if (imagePath != null) {
                try {
                    if (imagePath.length() > 0) {
                        File file = new File(imagePath);
                        if (!file.exists() && !TextUtils.isEmpty(file.getName())) {
                            String name = file.getName();
                            Intrinsics.checkNotNullExpressionValue(name, "file.name");
                            String strSubstring = name.substring(0, 1);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                            if (Intrinsics.areEqual(".", strSubstring)) {
                                StringBuilder sb3 = new StringBuilder();
                                File parentFile = file.getParentFile();
                                sb3.append(parentFile != null ? parentFile.getPath() : null);
                                sb3.append(File.separator);
                                String name2 = file.getName();
                                Intrinsics.checkNotNullExpressionValue(name2, "file.name");
                                String strSubstring2 = name2.substring(1);
                                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                                sb3.append(strSubstring2);
                                imagePath = sb3.toString();
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            this.f22383o0OoOo0 = imagePath;
            StringBuilder sbOooO0o4 = OooO00o.OooO00o.OooO0o0("本地截图发起的动态 postImageModel ");
            sbOooO0o4.append(this.f22383o0OoOo0);
            o00O00.OooO(sbOooO0o4.toString());
        } else if (type == MomentType.Topic.getValue()) {
            this.f22373OooooOo = OooOooo().getTopicInfoModel();
            Oooo00O().setType(MomentType.Text.getValue());
            o00O00.OooO("圈子发起 mTopicInfoModel " + this.f22373OooooOo);
        }
        p168o00Ooo0.o0OoOo0.OooO();
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        oO0OoOO0.OooO0Oo(window, 0);
        OooOoO0(o000O0O0.OooO0OO(R.string.Post));
        HeaderLayout headerLayout2 = this.f11463OoooO;
        if (headerLayout2 != null) {
            headerLayout2.OooOoo(o000O0O0.OooO0OO(R.string.Btn_Post), new o000O000(this));
        }
        HeaderLayout headerLayout3 = this.f11463OoooO;
        if (headerLayout3 != null) {
            headerLayout3.OooOoO0(new o000O0o(this));
        }
        HeaderLayout headerLayout4 = this.f11463OoooO;
        if (headerLayout4 != null) {
            oO0OoOO0.OooO00o(headerLayout4, true, true);
        }
        HeaderLayout headerLayout5 = this.f11463OoooO;
        if (headerLayout5 != null) {
            headerLayout5.setNavigationIcon(R.drawable.icon_back_x);
        }
        SendMomentLocationPowerView sendMomentLocationPowerView = OooOooO().f48983OooO;
        MomentSendModel sendPostModel = Oooo00O();
        o000Oo0 o000oo1 = new o000Oo0(this);
        Objects.requireNonNull(sendMomentLocationPowerView);
        Intrinsics.checkNotNullParameter(this, "activity");
        Intrinsics.checkNotNullParameter(sendPostModel, "sendPostModel");
        sendMomentLocationPowerView.f25170Oooo0oo = this;
        sendMomentLocationPowerView.f25173OoooO00 = sendPostModel;
        sendMomentLocationPowerView.changeLocationListener = o000oo1;
        OooOooO().f48992OooOO0.setCloseListener(new p538o0o0Oo0.o000O00(this));
        OooOooO().f48992OooOO0.setChangeListener(new p538o0o0Oo0.o000O00O(this));
        OooOooO().f48991OooO0oo.setPollListener(new p538o0o0Oo0.o000O0(this));
        SendMomentEmojiAtPollView sendMomentEmojiAtPollView = OooOooO().f48991OooO0oo;
        int i7 = this.f22375Oooooo0;
        EditTextSpan editContent = OooOooO().f48988OooO0o;
        Intrinsics.checkNotNullExpressionValue(editContent, "binding.mEditContent");
        EmojiFaceView emojiFaceView = OooOooO().f48985OooO0O0;
        Intrinsics.checkNotNullExpressionValue(emojiFaceView, "binding.emojiFaceView");
        PanelLayout faceLayout = OooOooO().f48986OooO0OO;
        Intrinsics.checkNotNullExpressionValue(faceLayout, "binding.faceLayout");
        Objects.requireNonNull(sendMomentEmojiAtPollView);
        Intrinsics.checkNotNullParameter(this, "activity");
        Intrinsics.checkNotNullParameter(editContent, "editContent");
        Intrinsics.checkNotNullParameter(emojiFaceView, "emojiFaceView");
        Intrinsics.checkNotNullParameter(faceLayout, "faceLayout");
        sendMomentEmojiAtPollView.f25158Oooo = i7;
        sendMomentEmojiAtPollView.f25163OoooO00 = editContent;
        emojiFaceView.OooO00o(editContent, true);
        o00O0000 o00o0001 = new o00O0000(faceLayout, editContent);
        ImageView imageView = sendMomentEmojiAtPollView.f25159Oooo0o.f50691OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivEmoji");
        o00o0001.OooO0O0(imageView);
        sendMomentEmojiAtPollView.f25162OoooO0 = o00o0001;
        o00o0001.f40623OooO0O0 = o0OOo000.f48224Oooo0o;
        o00o0001.f40622OooO00o = new o0o0000(sendMomentEmojiAtPollView);
        OooOooO().f48995OooOOO0.setRootListener(new o000O0Oo(this));
        OooOooO().f48988OooO0o.f11729Oooo = com.facebook.OooOo00.f12701OooO0o0;
        EditTextSpan editTextSpan = OooOooO().f48988OooO0o;
        Objects.requireNonNull(editTextSpan);
        if (!TextUtils.isEmpty("@")) {
            editTextSpan.getMaskKeys().put("@", "@");
        }
        OooOooO().f48988OooO0o.f11732Oooo0oo = new p142o00OOooO.OooOOO0(this, 2);
        OooOooO().f48988OooO0o.addTextChangedListener(new o0000OO0(this));
        SendMomentShareView sendMomentShareView = OooOooO().f48993OooOO0O;
        EditTextSpan editContent2 = OooOooO().f48988OooO0o;
        Intrinsics.checkNotNullExpressionValue(editContent2, "binding.mEditContent");
        o000 imageHideListener = new o000(this);
        Objects.requireNonNull(sendMomentShareView);
        Intrinsics.checkNotNullParameter(this, "activity");
        Intrinsics.checkNotNullParameter(editContent2, "editContent");
        Intrinsics.checkNotNullParameter(imageHideListener, "imageHideListener");
        sendMomentShareView.f25200Oooo = this;
        sendMomentShareView.f25206OoooO00 = editContent2;
        sendMomentShareView.f25205OoooO0 = imageHideListener;
        Oooo0OO();
        if (this.f22379o00Oo0) {
            o00OO.OooO00o(OooOooO().f48988OooO0o, Oooo00O().getContent(), this);
            p137o00OO0oo.OooOOO0 oooOOO0 = p137o00OO0oo.OooOOO0.f31661OooO00o;
            p497o0o00Oo.OooOOO0 oooOOO1 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            o000000O o000000oOooOO0 = p497o0o00Oo.OooOOO0.OooOO0();
            Objects.requireNonNull(o000000oOooOO0);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("sendImage");
            p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
            sb4.append(oooOOO.OooOo().getValue());
            String strOooO0Oo = o000000oOooOO0.OooO0Oo(sb4.toString(), "");
            ArrayList arrayList = new ArrayList();
            if (strOooO0Oo != null) {
                if (StringsKt__StringsKt.contains$default(strOooO0Oo, ",", false, 2, (Object) null)) {
                    Object[] array = StringsKt__StringsKt.split$default(strOooO0Oo, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
                    Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    CollectionsKt.addAll(arrayList, (String[]) array);
                } else {
                    arrayList.add(strOooO0Oo);
                }
            }
            o00O00.OooO0O0("getSendImage imageList = " + arrayList + "= ");
            p137o00OO0oo.OooOOO0.OooO0O0().clear();
            p137o00OO0oo.OooOOO0.OooO0O0().addAll(arrayList);
            List<String> listData = p137o00OO0oo.OooOOO0.OooO0O0();
            o00O000 o00o000Oooo000 = Oooo000();
            Objects.requireNonNull(o00o000Oooo000);
            Intrinsics.checkNotNullParameter(listData, "listData");
            o00o000Oooo000.f44148OooO0Oo.setNewData(o00o000Oooo000.OooO00o(listData));
            o00o000Oooo000.OooO0OO();
            o000000O o000000oOooOO1 = p497o0o00Oo.OooOOO0.OooOO0();
            Objects.requireNonNull(o000000oOooOO1);
            StringBuilder sbOooO0o5 = OooO00o.OooO00o.OooO0o0("sendPoll");
            sbOooO0o5.append(oooOOO.OooOo().getValue());
            MomentSendPollModel poll = (MomentSendPollModel) o0Oo0oo.OooO0OO(o000000oOooOO1.OooO0Oo(sbOooO0o5.toString(), ""), MomentSendPollModel.class);
            o00O00.OooO0O0("getSendPoll fromJson = " + poll + "= ");
            p137o00OO0oo.OooOOO0 oooOOO2 = p137o00OO0oo.OooOOO0.f31661OooO00o;
            if (poll != null) {
                SendMomentPollView sendMomentPollView = OooOooO().f48992OooOO0;
                Objects.requireNonNull(sendMomentPollView);
                Intrinsics.checkNotNullParameter(poll, "poll");
                List<MomentSendPollModel.Option> option = poll.getOption();
                int size = option.size();
                if (size == 0) {
                    option.add(new MomentSendPollModel.Option());
                    option.add(new MomentSendPollModel.Option());
                } else if (size == 1) {
                    option.add(new MomentSendPollModel.Option());
                }
                sendMomentPollView.sendMomentPoll = poll;
                sendMomentPollView.OooO0OO();
                sendMomentPollView.f25188Oooo0o.f50867OooO0Oo.postDelayed(new oO00000(sendMomentPollView, i), 210L);
            }
        } else {
            int type3 = OooOooo().getType();
            if (type3 == MomentType.Share.getValue()) {
                if (OooOooo().getRoomShareModel() != null) {
                    EditTextSpan editTextSpan2 = OooOooO().f48988OooO0o;
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.Room_ID_XXX);
                    String[] strArr = new String[1];
                    RoomShareModel roomShareModel2 = OooOooo().getRoomShareModel();
                    strArr[0] = roomShareModel2 != null ? roomShareModel2.getRoomIdx() : null;
                    editTextSpan2.setText(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO, strArr));
                    OooOooO().f48988OooO0o.setSelection(OooOooO().f48988OooO0o.getText().length());
                }
                OooOooO().f48991OooO0oo.OooO0Oo();
            } else if (type3 == MomentType.Forward.getValue()) {
                OooOooO().f48991OooO0oo.OooO0Oo();
            }
        }
        OooOooO().f48995OooOOO0.setData(this.f22373OooooOo);
        if (Oooo00O().isInEdit()) {
            OooOoO0(o000O0O0.OooO0OO(R.string.Moment_Edit_Page_Title));
            HeaderLayout headerLayout6 = this.f11463OoooO;
            if (headerLayout6 != null) {
                headerLayout6.OooOoo(o000O0O0.OooO0OO(R.string.Moment_Edit_Page_Save), new o000OO(this));
            }
            p497o0o00Oo.OooOOO0 oooOOO3 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            o000000 o000000VarOooO = p497o0o00Oo.OooOOO0.OooO();
            Objects.requireNonNull(o000000VarOooO);
            if (!o000000VarOooO.OooO00o("isHideMomentEditTipsFirst" + p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue(), false)) {
                SendMomentTipsView sendMomentTipsView = OooOooO().f48994OooOO0o;
                Intrinsics.checkNotNullExpressionValue(sendMomentTipsView, "binding.sendMomentTipsView");
                com.yalla.support.common.util.o00O0O.OooO(sendMomentTipsView);
                OooOooO().f48994OooOO0o.setData(OooOooo().getEditMaxNum());
                OooOooO().f48994OooOO0o.setCloseListener(new o0000O(this));
            }
            MomentDetailModel editMomentDetailModel2 = OooOooo().getEditMomentDetailModel();
            if (editMomentDetailModel2 != null) {
                MomentSendContentModel content2 = editMomentDetailModel2.getContent();
                if (content2 != null) {
                    if (content2.hasCircle()) {
                        TopicInfoModel topicInfoModel2 = new TopicInfoModel();
                        topicInfoModel2.setId(content2.getCircleId());
                        String circleName2 = content2.getCircleName();
                        topicInfoModel2.setName(circleName2 != null ? circleName2 : "");
                        this.f22373OooooOo = topicInfoModel2;
                    }
                    o00OO.OooO00o(OooOooO().f48988OooO0o, content2, this);
                }
                int type4 = Oooo00O().getType();
                if ((((type4 == MomentType.Event.getValue() || type4 == MomentType.Share.getValue()) || type4 == MomentType.Forward.getValue()) ? 1 : 0) != 0) {
                    OooOooO().f48993OooOO0O.OooO00o(OooOooo(), Oooo00O());
                } else if (type4 == MomentType.Image.getValue()) {
                    ArrayList<ImageView9GridModel> imageInfoList = editMomentDetailModel2.getImageInfoList();
                    ArrayList listData2 = new ArrayList();
                    Iterator<T> it = imageInfoList.iterator();
                    while (it.hasNext()) {
                        listData2.add(CloudImageUtilKt.imgFormat(((ImageView9GridModel) it.next()).getUrl()));
                    }
                    o00O000 o00o000Oooo001 = Oooo000();
                    Objects.requireNonNull(o00o000Oooo001);
                    Intrinsics.checkNotNullParameter(listData2, "listData");
                    o00o000Oooo001.f44148OooO0Oo.setNewData(o00o000Oooo001.OooO00o(listData2));
                    o00o000Oooo001.OooO0OO();
                }
                Oooo00O().setAddress(editMomentDetailModel2.getAddress());
                Oooo00O().setPower(editMomentDetailModel2.getPower());
                o00O00.OooO0O0("编辑动态 initEditView\n\t editMomentDetailModel : " + editMomentDetailModel2 + "\n\t sendPostModel : " + Oooo00O());
            }
            SendMomentTopicView sendMomentTopicView = OooOooO().f48995OooOOO0;
            Intrinsics.checkNotNullExpressionValue(sendMomentTopicView, "binding.sendMomentTopicView");
            com.yalla.support.common.util.o00O0O.OooO(sendMomentTopicView);
            OooOooO().f48995OooOOO0.setIsInEdit(true);
            OooOooO().f48995OooOOO0.setData(this.f22373OooooOo);
            OooOooO().f48983OooO.OooO0Oo(true, true, this.f22373OooooOo, Oooo00O());
            OooOooO().f48991OooO0oo.OooO0Oo();
            this.f22382o00ooo = OooOooO().f48988OooO0o.getText().toString();
        } else {
            int type5 = OooOooo().getType();
            if (type5 == MomentType.Share.getValue() || type5 == MomentType.Image.getValue()) {
                SendMomentTopicView sendMomentTopicView2 = OooOooO().f48995OooOOO0;
                Intrinsics.checkNotNullExpressionValue(sendMomentTopicView2, "binding.sendMomentTopicView");
                com.yalla.support.common.util.o00O0O.OooO00o(sendMomentTopicView2);
                OooOooO().f48988OooO0o.setHint(o000O0O0.OooO0OO(R.string.SendPost_NoTopic_Hint));
            } else if (type5 == MomentType.Forward.getValue()) {
                SendMomentTopicView sendMomentTopicView3 = OooOooO().f48995OooOOO0;
                Intrinsics.checkNotNullExpressionValue(sendMomentTopicView3, "binding.sendMomentTopicView");
                com.yalla.support.common.util.o00O0O.OooO(sendMomentTopicView3);
                OooOooO().f48988OooO0o.setHint(o000O0O0.OooO0OO(R.string.SendPost_NoTopic_Hint));
                OooOooO().f48988OooO0o.setHint(o000O0O0.OooO0OO(R.string.SendPost_AddTopic_Hint));
            } else if (type5 == MomentType.Topic.getValue()) {
                OooOooO().f48988OooO0o.setHint(o000O0O0.OooO0OO(R.string.SendPost_AddTopic_Hint));
            }
            OooOooO().f48993OooOO0O.OooO00o(OooOooo(), Oooo00O());
            OooOooO().f48983OooO.OooO0Oo(this.f22379o00Oo0, false, this.f22373OooooOo, Oooo00O());
        }
        Oooo00o().getPollConfig().observe(this, new o0o0000.OooOo(new o0000O0O(this), null, null, false, 14));
        oo00o oo00oVar = new oo00o(this, OooOooO().f48988OooO0o, OooOooO().f48992OooOO0);
        this.f22376OoooooO = oo00oVar;
        oo00oVar.f44179OooO0oO = OooOooo();
        oo00o oo00oVar2 = this.f22376OoooooO;
        if (oo00oVar2 != null) {
            int i8 = this.f22375Oooooo0;
            int i9 = this.f22374Oooooo;
            oo00oVar2.f44176OooO0Oo = i8;
            oo00oVar2.f44178OooO0o0 = i9;
        }
        if (oo00oVar2 != null && (headerLayout = this.f11463OoooO) != null) {
            headerLayout.getF12044o000000();
        }
        LiveEventBus.get("MOMENT_EDIT_SEND_SHOWING", MomentSendModel.class).observe(this, new o00O0O0(this, i4));
        Class cls = Long.TYPE;
        LiveEventBus.get("MOMENT_EDIT_SEND_SUCCESS", cls).observe(this, new o0O0O0Oo(this, i2));
        LiveEventBus.get("MOMENT_EDIT_SEND_FILED_CONTENT", cls).observe(this, new o00OO0OO(this, i3));
        LiveEventBus.get("MOMENT_EDIT_SEND_FILED_IMAGE", cls).observe(this, new o00OOO0O(this, i2));
        Oooo00o().statisticalTime();
        String image = this.f22383o0OoOo0;
        if (image != null) {
            o00O000 o00o000Oooo002 = Oooo000();
            Objects.requireNonNull(o00o000Oooo002);
            Intrinsics.checkNotNullParameter(image, "image");
            o00o000Oooo002.f44148OooO0Oo.addData(image);
            o00o000Oooo002.OooO0OO();
        }
        StringBuilder sbOooO0o6 = OooO00o.OooO00o.OooO0o0("编辑动态 onCreateEnd\n momentSendShareModel = ");
        sbOooO0o6.append(OooOooo());
        sbOooO0o6.append("\n isRecoverMoment = ");
        sbOooO0o6.append(this.f22379o00Oo0);
        sbOooO0o6.append("\n sendPostModel = ");
        sbOooO0o6.append(Oooo00O());
        o00O00.OooO0O0(sbOooO0o6.toString());
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.app.base.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Oooo00o().statisticalTime();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, @Nullable KeyEvent keyEvent) {
        boolean z;
        if (4 != i) {
            if (3 == i) {
                OooOooO().f48991OooO0oo.OooO0O0();
            }
            return super.onKeyDown(i, keyEvent);
        }
        o00O0000 o00o0001 = OooOooO().f48991OooO0oo.f25162OoooO0;
        if (o00o0001 != null) {
            z = o00o0001.OooO0o0();
        }
        if (z) {
            return false;
        }
        return Oooo0O0();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        Oooo0OO();
    }
}
