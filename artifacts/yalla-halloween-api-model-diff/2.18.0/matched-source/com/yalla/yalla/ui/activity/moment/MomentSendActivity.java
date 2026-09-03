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
import p144o00OOooo.o00OOO0O;
import p165o00OoOo0.oo0O;
import p169o00Ooo0.o0O0O00;
import p174o00OooO0.o00OOO00;
import p174o00OooO0.o00OOOO0;
import p255o00ooO0O.o00000O;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o00O000o;
import p256o00ooO0o.oo0oOO0;
import p472o0Oooo0.o00O000;
import p472o0Oooo0.o00O0000;
import p480o0OooooO.oO0o0o;
import p500o0o00Oo0.o00O0;
import p500o0o00Oo0.o00O0OOO;
import p501o0o00OoO.o000000;
import p501o0o00OoO.o000000O;
import p517o0o0O00.o00O00;
import p518o0o0O000.o0Oo0oo;
import p524o0o0O0o.o000O0;
import p524o0o0O0o.oOO00O;
import p526o0o0O0oO.o0O0O0o0;
import p540o0o0Oo0.o000;
import p540o0o0Oo0.o0000O;
import p540o0o0Oo0.o0000O0O;
import p540o0o0Oo0.o0000OO0;
import p540o0o0Oo0.o000O;
import p540o0o0Oo0.o000O000;
import p540o0o0Oo0.o000O0Oo;
import p540o0o0Oo0.o000O0o;
import p540o0o0Oo0.o000OO;
import p540o0o0Oo0.o000Oo0;
import p543o0o0Oo0o.o00O00o0;
import p543o0o0Oo0o.o00oOoo;
import p571o0oOo0OO.o000O00O;
import p603o0oo00Oo.o0OOo000;
import p603o0oo00Oo.o0o0000;
import p603o0oo00Oo.oO00000;
import p619o0oo0o.o000O00;
import p651o0ooOOoo.a7;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/MomentSendActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public class MomentSendActivity extends BaseActivityK {

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22386o0ooOOo = new OooO00o();

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @Nullable
    public TopicInfoModel f22392OoooooO;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    @Nullable
    public String f22395o00Oo0;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public long f22397o00o0O;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public boolean f22400o00ooo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    @Nullable
    public o00O00o0 f22404ooOO;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final o00O000o f22387OooooO0 = new o00O000o(Reflection.getOrCreateKotlinClass(a7.class), this, null);

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public String f22388OooooOO = "";

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f22389OooooOo = -1;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public final Lazy f22391Oooooo0 = LazyKt.lazy(new OooO());

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @NotNull
    public final Lazy f22390Oooooo = LazyKt.lazy(new OooOOO());

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public final int f22393Ooooooo = 10;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public final int f22401o0OoOo0 = 3;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    @NotNull
    public final Lazy f22394o00O0O = LazyKt.lazy(new OooOOO0());

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public final long f22396o00Ooo = 1000;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22403oo000o = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MomentVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.MomentSendActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0 f22418Oooo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22418Oooo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f22399o00oO0o = LazyKt.lazy(new OooO0o());

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    @NotNull
    public String f22398o00oO0O = "";

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    @NotNull
    public final o00O0 f22402o0ooOO0 = new o00O0();

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

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ Context f22406Oooo;

            /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
            public final /* synthetic */ MomentSendShareModel f22407OoooO00;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0255OooO00o(Context context, MomentSendShareModel momentSendShareModel) {
                super(0);
                this.f22406Oooo = context;
                this.f22407OoooO00 = momentSendShareModel;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Intent intent = new Intent(this.f22406Oooo, (Class<?>) MomentSendActivity.class);
                intent.putExtra("SHARE_POST_MODEL", this.f22407OoooO00);
                this.f22406Oooo.startActivity(intent);
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
            if (Intrinsics.areEqual(p500o0o00Oo0.OooOOO.f41235OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
                return;
            }
            Activity activityOooO0O0 = o00000O.f34276OooO00o.OooO0O0();
            if (activityOooO0O0 != null) {
                LoginActivity.OooO00o oooO00o = LoginActivity.f21771Oooooo0;
                o0OOO0o.OooO00o(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
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

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public static final OooO0OO f22408Oooo = new OooO0OO();

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

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f22411OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(Ref.BooleanRef booleanRef) {
            super(0);
            this.f22411OoooO00 = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            MomentSendModel momentSendModelOooo00O;
            String jSONString;
            String jSONString2;
            MomentSendContentModel content;
            MomentSendActivity momentSendActivity = MomentSendActivity.this;
            OooO00o oooO00o = MomentSendActivity.f22386o0ooOOo;
            if (momentSendActivity.Oooo00O().isInEdit()) {
                return null;
            }
            if (this.f22411OoooO00.element) {
                List<String> data = MomentSendActivity.this.Oooo000().f44180OooO0Oo.getData();
                Intrinsics.checkNotNull(data, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String?>");
                ArrayList<String> arrayList = new ArrayList();
                for (String str : (ArrayList) data) {
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                MomentSendActivity momentSendActivity2 = MomentSendActivity.this;
                o00O00o0 o00o00o1 = momentSendActivity2.f22404ooOO;
                String str2 = "";
                if (o00o00o1 != null) {
                    momentSendModelOooo00O = momentSendActivity2.Oooo00O();
                    MomentSendContentModel momentSendContentModel = new MomentSendContentModel(o00OOOO0.OooO00o(o00o00o1.f44170OooO00o, o00o00o1.f44171OooO0O0));
                    ArrayList<? extends p151o00Oo0Oo.OooOo> arrayListOooO0OO = o00o00o1.f44171OooO0O0.getSpanManager().OooO0OO("@");
                    for (int i = 0; i < arrayListOooO0OO.size(); i++) {
                        p151o00Oo0Oo.OooOo oooOo = arrayListOooO0OO.get(i);
                        if (oooOo != null) {
                            momentSendContentModel.getAt().add(new MomentSendContentAtModel(android.support.v4.media.session.OooOOO0.OooO00o(new StringBuilder(), oooOo.f32195OoooO00, ""), oooOo.f32192Oooo));
                        }
                    }
                    momentSendModelOooo00O.setContent(momentSendContentModel);
                    if (momentSendModelOooo00O.getType() == MomentType.Text.getValue() && arrayList.size() > 1) {
                        momentSendModelOooo00O.setType(MomentType.Image.getValue());
                    }
                    StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("sendPost\n sendPostModel.Text = ");
                    sbOooO0O0.append(momentSendContentModel.getContent());
                    sbOooO0O0.append("\n sendPostModel.Text.Length = ");
                    sbOooO0O0.append(momentSendContentModel.getContent().length());
                    sbOooO0O0.append("\n sendPostModel = ");
                    sbOooO0O0.append(momentSendModelOooo00O.toJSONString());
                    o00O00.OooO(sbOooO0O0.toString());
                } else {
                    momentSendModelOooo00O = null;
                }
                TopicInfoModel topicInfoModel = MomentSendActivity.this.f22392OoooooO;
                if (topicInfoModel != null && momentSendModelOooo00O != null && (content = momentSendModelOooo00O.getContent()) != null) {
                    content.setCircle(topicInfoModel.getId(), topicInfoModel.getName());
                }
                MomentSendPollModel sendMomentPoll = MomentSendActivity.this.OooOooO().f48929OooOO0.getSendMomentPoll();
                p138o00OO0oo.OooOOO0 oooOOO0 = p138o00OO0oo.OooOOO0.f31680OooO00o;
                p138o00OO0oo.OooOOO0 oooOOO1 = p138o00OO0oo.OooOOO0.f31680OooO00o;
                p499o0o00Oo.OooOOO0 oooOOO2 = p499o0o00Oo.OooOOO0.f41199OooO00o;
                o000000O o000000oOooOO0 = p499o0o00Oo.OooOOO0.OooOO0();
                Objects.requireNonNull(o000000oOooOO0);
                if (momentSendModelOooo00O == null || (jSONString = momentSendModelOooo00O.toJSONString()) == null) {
                    jSONString = "";
                }
                o000000oOooOO0.OooOO0o(jSONString);
                p138o00OO0oo.OooOOO0.OooO0O0().clear();
                p138o00OO0oo.OooOOO0.OooO0O0().addAll(arrayList);
                o000000O o000000oOooOO1 = p499o0o00Oo.OooOOO0.OooOO0();
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
                p138o00OO0oo.OooOOO0 oooOOO3 = p138o00OO0oo.OooOOO0.f31680OooO00o;
                p138o00OO0oo.OooOOO0 oooOOO4 = p138o00OO0oo.OooOOO0.f31680OooO00o;
                p499o0o00Oo.OooOOO0 oooOOO5 = p499o0o00Oo.OooOOO0.f41199OooO00o;
                o000000O o000000oOooOO2 = p499o0o00Oo.OooOOO0.OooOO0();
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

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f22413OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(Ref.BooleanRef booleanRef) {
            super(0);
            this.f22413OoooO00 = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            MomentSendActivity momentSendActivity = MomentSendActivity.this;
            OooO00o oooO00o = MomentSendActivity.f22386o0ooOOo;
            if (momentSendActivity.Oooo00O().isInEdit()) {
                MomentSendActivity.this.finish();
                return null;
            }
            if (this.f22413OoooO00.element) {
                p138o00OO0oo.OooOOO0 oooOOO0 = p138o00OO0oo.OooOOO0.f31680OooO00o;
                p138o00OO0oo.OooOOO0.OooO00o();
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
            p138o00OO0oo.OooOOO0 oooOOO0 = p138o00OO0oo.OooOOO0.f31680OooO00o;
            p499o0o00Oo.OooOOO0 oooOOO1 = p499o0o00Oo.OooOOO0.f41199OooO00o;
            o000000O o000000oOooOO0 = p499o0o00Oo.OooOOO0.OooOO0();
            Objects.requireNonNull(o000000oOooOO0);
            MomentSendModel momentSendModel2 = (MomentSendModel) o0Oo0oo.OooO0OO(o000000oOooOO0.OooO0Oo("sendModel" + p500o0o00Oo0.OooOOO.f41235OooO00o.OooOo().getValue(), ""), MomentSendModel.class);
            o00O00.OooO0O0("getSendModel fromJson = " + momentSendModel2 + "= ");
            p138o00OO0oo.OooOOO0 oooOOO2 = p138o00OO0oo.OooOOO0.f31680OooO00o;
            if (momentSendModel2 == null) {
                return momentSendModel;
            }
            MomentSendActivity momentSendActivity = MomentSendActivity.this;
            OooO00o oooO00o = MomentSendActivity.f22386o0ooOOo;
            if (momentSendActivity.OooOooo().getType() != MomentType.Text.getValue()) {
                return momentSendModel;
            }
            momentSendActivity.f22400o00ooo = true;
            return momentSendModel2;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<o00oOoo> {
        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00oOoo invoke() {
            MomentSendActivity momentSendActivity = MomentSendActivity.this;
            OooO00o oooO00o = MomentSendActivity.f22386o0ooOOo;
            NoScrollRecyclerView noScrollRecyclerView = momentSendActivity.OooOooO().f48924OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(noScrollRecyclerView, "binding.imagesRecyclerView");
            ImageView imageView = MomentSendActivity.this.OooOooO().f48927OooO0oO;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.mIvAddImage");
            o00oOoo o00oooo2 = new o00oOoo(momentSendActivity, noScrollRecyclerView, imageView);
            MomentSendActivity momentSendActivity2 = MomentSendActivity.this;
            o00oooo2.f44182OooO0o0 = new com.yalla.yalla.ui.activity.moment.OooOO0O(momentSendActivity2);
            o00oooo2.f44181OooO0o = new com.yalla.yalla.ui.activity.moment.OooOOO0(momentSendActivity2);
            return o00oooo2;
        }
    }

    public static final void OooOoo(MomentSendActivity momentSendActivity) {
        String strOooO;
        momentSendActivity.OooOooO().f48928OooO0oo.OooO0O0();
        if (p169o00Ooo0.o0OoOo0.OooO0o0(momentSendActivity.OooOooO().f48925OooO0o) > 1000) {
            ToastUtil.f12582OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.Input_a_maximum_of_1000_characters));
            return;
        }
        if (p169o00Ooo0.o0OoOo0.OooO0Oo(momentSendActivity.OooOooO().f48925OooO0o) > 50) {
            ToastUtil.f12582OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.char_room_edit1));
            return;
        }
        if (momentSendActivity.OooOooo().getType() != MomentType.Share.getValue() && momentSendActivity.OooOooo().getType() != MomentType.Forward.getValue() && Intrinsics.areEqual("", StringsKt.trim((CharSequence) momentSendActivity.OooOooO().f48925OooO0o.getText().toString()).toString()) && momentSendActivity.Oooo000().f44180OooO0Oo.getData().size() == 1) {
            ToastUtil.f12582OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.please_input_dynamic));
            return;
        }
        List<String> data = momentSendActivity.Oooo000().f44180OooO0Oo.getData();
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
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00O0OOO(sourcePage, actionType, actionInfo, sessionId, null), 3, null);
            }
        }
        o00O00o0 o00o00o1 = momentSendActivity.f22404ooOO;
        if (o00o00o1 != null) {
            MomentSendModel momentSendModelOooo00O = momentSendActivity.Oooo00O();
            TopicInfoModel topicInfoModel = momentSendActivity.f22392OoooooO;
            o000O o000o = new o000O(momentSendActivity);
            o00o00o1.f44174OooO0o = topicInfoModel;
            o00O00.OooO0O0("PostContentUtils sendPost");
            boolean z = arrayList.size() > 1;
            if (o00o00o1.f44171OooO0O0.getSpanManager().OooO0Oo("@") > o00o00o1.f44173OooO0Oo) {
                ToastUtil.OooO0O0 oooO0O0 = ToastUtil.f12582OooO00o;
                String string = o00o00o1.f44170OooO00o.getString(R.string.Mention_a_maximum_of_XXX_people);
                StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("");
                sbOooO0O0.append(o00o00o1.f44173OooO0Oo);
                oooO0O0.OooO0O0(com.yalla.support.common.util.OooOo.OooO00o(string, sbOooO0O0.toString()));
            } else if (o00o00o1.f44171OooO0O0.getSpanManager().OooO0Oo("#") > o00o00o1.f44175OooO0o0) {
                ToastUtil.f12582OooO00o.OooO0O0(o00o00o1.f44170OooO00o.getString(R.string.You_can_add_3_topics_at_most));
            } else {
                MomentSendContentModel momentSendContentModel = new MomentSendContentModel(o00OOOO0.OooO00o(o00o00o1.f44170OooO00o, o00o00o1.f44171OooO0O0));
                ArrayList<? extends p151o00Oo0Oo.OooOo> arrayListOooO0OO = o00o00o1.f44171OooO0O0.getSpanManager().OooO0OO("@");
                for (int i = 0; i < arrayListOooO0OO.size(); i++) {
                    p151o00Oo0Oo.OooOo oooOo = arrayListOooO0OO.get(i);
                    if (oooOo != null) {
                        momentSendContentModel.getAt().add(new MomentSendContentAtModel(android.support.v4.media.session.OooOOO0.OooO00o(new StringBuilder(), oooOo.f32195OoooO00, ""), oooOo.f32192Oooo));
                    }
                }
                TopicInfoModel topicInfoModel2 = o00o00o1.f44174OooO0o;
                if (topicInfoModel2 != null && topicInfoModel2.getId() > 0) {
                    momentSendContentModel.setCircle(o00o00o1.f44174OooO0o.getId(), o00o00o1.f44174OooO0o.getName());
                }
                if (momentSendContentModel.getContent().isEmpty() && o00o00o1.f44176OooO0oO.getType() == MomentType.Share.getValue()) {
                    if (o00o00o1.f44176OooO0oO.getRoomShareModel() != null) {
                        momentSendContentModel.setContent(com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Room_ID_XXX), o00o00o1.f44176OooO0oO.getRoomShareModel().getRoomIdx()));
                    }
                    if (o00o00o1.f44176OooO0oO.getEventModel() != null) {
                        momentSendContentModel.setContent(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.event_share_moment));
                    }
                }
                momentSendModelOooo00O.setContent(momentSendContentModel);
                if (momentSendModelOooo00O.getType() == MomentType.Text.getValue() && z) {
                    momentSendModelOooo00O.setType(MomentType.Image.getValue());
                }
                StringBuilder sbOooO0O1 = OooO00o.OooO00o.OooO0O0("sendPost sendPostModel.Text = ");
                sbOooO0O1.append(momentSendContentModel.getContent());
                sbOooO0O1.append(", sendPostModel.Text.Length = ");
                sbOooO0O1.append(momentSendContentModel.getContent().length());
                sbOooO0O1.append("\n sendPostModel = ");
                sbOooO0O1.append(momentSendModelOooo00O.toJSONString());
                o00O00.OooO(sbOooO0O1.toString());
                momentSendModel = momentSendModelOooo00O;
            }
            if (momentSendModel == null) {
                return;
            }
            if (momentSendModel.getContent().getCircleId() > 0 && com.android.billingclient.api.o00000O.OooO0O0().OooO0Oo("FIRST_SEND_POST_FOR_TOPIC", true)) {
                com.android.billingclient.api.o00000O.OooO0O0().OooO0oo("FIRST_SEND_POST_FOR_TOPIC", false);
                ToastUtil.f12582OooO00o.OooO0O0(o00o00o1.f44170OooO00o.getString(R.string.first_send_post_for_topic));
            }
            momentSendModel.setPoll(o00o00o1.f44172OooO0OO.getSendMomentPoll());
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

    public final a7 OooOooO() {
        return (a7) this.f22387OooooO0.getValue();
    }

    public final MomentSendShareModel OooOooo() {
        return (MomentSendShareModel) this.f22391Oooooo0.getValue();
    }

    public final boolean Oooo0() {
        MomentDetailModel editMomentDetailModel;
        if (Oooo00O().isInEdit() && (editMomentDetailModel = OooOooo().getEditMomentDetailModel()) != null) {
            o00oOoo o00ooooOooo000 = Oooo000();
            Objects.requireNonNull(o00ooooOooo000);
            ArrayList arrayList = new ArrayList();
            List<String> data = o00ooooOooo000.f44180OooO0Oo.getData();
            Intrinsics.checkNotNullExpressionValue(data, "adapter.data");
            for (String it : data) {
                if (p524o0o0O0o.o00O0.OooO0o0(it)) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    arrayList.add(it);
                }
            }
            if (!o000O0.OooO0O0(arrayList, Oooo00O().getHttpImagesFromEditMomentDetailUrl(), OooO0OO.f22408Oooo) || !Intrinsics.areEqual(editMomentDetailModel.getAddress(), Oooo00O().getAddress()) || !Intrinsics.areEqual(this.f22398o00oO0O, OooOooO().f48925OooO0o.getText().toString())) {
                return true;
            }
        }
        return false;
    }

    public final o00oOoo Oooo000() {
        return (o00oOoo) this.f22394o00O0O.getValue();
    }

    public final MomentSendModel Oooo00O() {
        return (MomentSendModel) this.f22390Oooooo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MomentVM Oooo00o() {
        return (MomentVM) this.f22403oo000o.getValue();
    }

    public final boolean Oooo0O0() {
        OooOooO().f48928OooO0oo.OooO0O0();
        int size = Oooo000().f44180OooO0Oo.getData().size();
        String string = StringsKt.trim((CharSequence) OooOooO().f48925OooO0o.getText().toString()).toString();
        if (!(string.length() > 0) && size <= 1) {
            p138o00OO0oo.OooOOO0 oooOOO0 = p138o00OO0oo.OooOOO0.f31680OooO00o;
            MomentSendPollModel sendMomentPoll = OooOooO().f48929OooOO0.getSendMomentPoll();
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("");
            if (string == null) {
                string = "";
            }
            sbOooO0O0.append(string);
            String string2 = sbOooO0O0.toString();
            if (sendMomentPoll != null) {
                for (MomentSendPollModel.Option option : sendMomentPoll.getOption()) {
                    StringBuilder sbOooO0O1 = OooO00o.OooO00o.OooO0O0(string2);
                    sbOooO0O1.append(option.getText());
                    string2 = sbOooO0O1.toString();
                }
            }
            if (!(!StringsKt.isBlank(string2)) && TextUtils.isEmpty(Oooo00O().getSourcesid())) {
                p138o00OO0oo.OooOOO0 oooOOO1 = p138o00OO0oo.OooOOO0.f31680OooO00o;
                p138o00OO0oo.OooOOO0.OooO00o();
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
                p138o00OO0oo.OooOOO0 oooOOO2 = p138o00OO0oo.OooOOO0.f31680OooO00o;
                p138o00OO0oo.OooOOO0.OooO00o();
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
        if (p524o0o0O0o.o00O0.OooO0o0(strOooO0OO3)) {
            oo0ooo0.OooOOo0(strOooO0OO3);
            oo0ooo0.OooOo0o(new OooOO0(booleanRef));
        }
        oo0ooo0.OooOoO0(strOooO0OO2);
        oo0ooo0.OooOo(new OooOO0O(booleanRef));
        oo0ooo0.OooOOO0();
        return false;
    }

    public final void Oooo0OO() {
        TextView f12058o00000;
        TextView f12058o00001;
        TextView f12058o00002;
        TextView f12058o00003;
        TextView f12058o00004;
        TextView f12058o00005;
        TextView f12058o00006;
        TextView f12058o00007;
        if (Oooo00O().isInEdit()) {
            if (Oooo0()) {
                HeaderLayout headerLayout = this.f11480OoooOOO;
                f12058o00000 = headerLayout != null ? headerLayout.getF12058o00000() : null;
                if (f12058o00000 != null) {
                    f12058o00000.setClickable(true);
                }
                HeaderLayout headerLayout2 = this.f11480OoooOOO;
                if (headerLayout2 == null || (f12058o00007 = headerLayout2.getF12058o00000()) == null) {
                    return;
                }
                f12058o00007.setTextColor(-1);
                return;
            }
            HeaderLayout headerLayout3 = this.f11480OoooOOO;
            f12058o00000 = headerLayout3 != null ? headerLayout3.getF12058o00000() : null;
            if (f12058o00000 != null) {
                f12058o00000.setClickable(false);
            }
            HeaderLayout headerLayout4 = this.f11480OoooOOO;
            if (headerLayout4 == null || (f12058o00006 = headerLayout4.getF12058o00000()) == null) {
                return;
            }
            f12058o00006.setTextColor(-1962934273);
            return;
        }
        if (OooOooo().getType() == MomentType.Share.getValue() || OooOooo().getType() == MomentType.Forward.getValue()) {
            HeaderLayout headerLayout5 = this.f11480OoooOOO;
            f12058o00000 = headerLayout5 != null ? headerLayout5.getF12058o00000() : null;
            if (f12058o00000 != null) {
                f12058o00000.setClickable(true);
            }
            HeaderLayout headerLayout6 = this.f11480OoooOOO;
            if (headerLayout6 == null || (f12058o00001 = headerLayout6.getF12058o00000()) == null) {
                return;
            }
            f12058o00001.setTextColor(-1);
            return;
        }
        MomentSendPollModel sendMomentPoll = OooOooO().f48929OooOO0.getSendMomentPoll();
        if (sendMomentPoll == null) {
            int size = Oooo000().f44180OooO0Oo.getData().size();
            Editable text = OooOooO().f48925OooO0o.getText();
            Intrinsics.checkNotNullExpressionValue(text, "binding.mEditContent.text");
            if ((text.length() > 0) || size > 1) {
                HeaderLayout headerLayout7 = this.f11480OoooOOO;
                f12058o00000 = headerLayout7 != null ? headerLayout7.getF12058o00000() : null;
                if (f12058o00000 != null) {
                    f12058o00000.setClickable(true);
                }
                HeaderLayout headerLayout8 = this.f11480OoooOOO;
                if (headerLayout8 == null || (f12058o00002 = headerLayout8.getF12058o00000()) == null) {
                    return;
                }
                f12058o00002.setTextColor(-1);
                return;
            }
            HeaderLayout headerLayout9 = this.f11480OoooOOO;
            f12058o00000 = headerLayout9 != null ? headerLayout9.getF12058o00000() : null;
            if (f12058o00000 != null) {
                f12058o00000.setClickable(false);
            }
            HeaderLayout headerLayout10 = this.f11480OoooOOO;
            if (headerLayout10 == null || (f12058o00003 = headerLayout10.getF12058o00000()) == null) {
                return;
            }
            f12058o00003.setTextColor(-1962934273);
            return;
        }
        Iterator<T> it = sendMomentPoll.getOption().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((MomentSendPollModel.Option) it.next()).getText().length() > 0) {
                i++;
            }
        }
        Editable text2 = OooOooO().f48925OooO0o.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "binding.mEditContent.text");
        if (!(text2.length() > 0) || i < 2 || sendMomentPoll.getExpireTime() <= 0) {
            HeaderLayout headerLayout11 = this.f11480OoooOOO;
            f12058o00000 = headerLayout11 != null ? headerLayout11.getF12058o00000() : null;
            if (f12058o00000 != null) {
                f12058o00000.setClickable(false);
            }
            HeaderLayout headerLayout12 = this.f11480OoooOOO;
            if (headerLayout12 == null || (f12058o00004 = headerLayout12.getF12058o00000()) == null) {
                return;
            }
            f12058o00004.setTextColor(-1962934273);
            return;
        }
        HeaderLayout headerLayout13 = this.f11480OoooOOO;
        f12058o00000 = headerLayout13 != null ? headerLayout13.getF12058o00000() : null;
        if (f12058o00000 != null) {
            f12058o00000.setClickable(true);
        }
        HeaderLayout headerLayout14 = this.f11480OoooOOO;
        if (headerLayout14 == null || (f12058o00005 = headerLayout14.getF12058o00000()) == null) {
            return;
        }
        f12058o00005.setTextColor(-1);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        EditTextSpan view = OooOooO().f48925OooO0o;
        Intrinsics.checkNotNullExpressionValue(view, "binding.mEditContent");
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

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        HeaderLayout headerLayout;
        super.onCreate(bundle);
        setContentView(OooOooO().f48921OooO00o);
        MomentSendContentModel content = Oooo00O().getContent();
        if (content != null && content.hasCircle()) {
            TopicInfoModel topicInfoModel = new TopicInfoModel();
            topicInfoModel.setId(content.getCircleId());
            String circleName = content.getCircleName();
            if (circleName == null) {
                circleName = "";
            }
            topicInfoModel.setName(circleName);
            this.f22392OoooooO = topicInfoModel;
        }
        Oooo00O().setType(OooOooo().getType());
        Oooo00O().setEditToken(p524o0o0O0o.o00O0.OooO0oO(OooOooo().getEditToken()));
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
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("分享 mRoomShareModel ");
            sbOooO0O0.append(OooOooo().getRoomShareModel());
            o00O00.OooO(sbOooO0O0.toString());
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
                    StringBuilder sbOooO0O1 = OooO00o.OooO00o.OooO0O0("分享Web sharePostModel ");
                    sbOooO0O1.append(OooOooo().getWebModel());
                    o00O00.OooO(sbOooO0O1.toString());
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
                StringBuilder sbOooO0O2 = OooO00o.OooO00o.OooO0O0("分享房主活动 sharePostModel ");
                sbOooO0O2.append(OooOooo().getEventModel());
                o00O00.OooO(sbOooO0O2.toString());
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
                StringBuilder sbOooO0O3 = OooO00o.OooO00o.OooO0O0("转发 sharePostModel.postDetailModel ");
                sbOooO0O3.append(OooOooo().getForwardMomentDetailModel());
                o00O00.OooO(sbOooO0O3.toString());
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
            this.f22395o00Oo0 = imagePath;
            StringBuilder sbOooO0O4 = OooO00o.OooO00o.OooO0O0("本地截图发起的动态 postImageModel ");
            sbOooO0O4.append(this.f22395o00Oo0);
            o00O00.OooO(sbOooO0O4.toString());
        } else if (type == MomentType.Topic.getValue()) {
            this.f22392OoooooO = OooOooo().getTopicInfoModel();
            Oooo00O().setType(MomentType.Text.getValue());
            o00O00.OooO("圈子发起 mTopicInfoModel " + this.f22392OoooooO);
        }
        p169o00Ooo0.o0OoOo0.OooO();
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        oO0o0o.OooO0Oo(window, 0);
        OooOoO0(o000O0O0.OooO0OO(R.string.Post));
        HeaderLayout headerLayout2 = this.f11480OoooOOO;
        if (headerLayout2 != null) {
            headerLayout2.OooOoo(o000O0O0.OooO0OO(R.string.Btn_Post), new o000O000(this));
        }
        HeaderLayout headerLayout3 = this.f11480OoooOOO;
        if (headerLayout3 != null) {
            headerLayout3.OooOoO0(new o000O0o(this));
        }
        HeaderLayout headerLayout4 = this.f11480OoooOOO;
        if (headerLayout4 != null) {
            oO0o0o.OooO00o(headerLayout4, true, true);
        }
        HeaderLayout headerLayout5 = this.f11480OoooOOO;
        if (headerLayout5 != null) {
            headerLayout5.setNavigationIcon(R.drawable.icon_back_x);
        }
        SendMomentLocationPowerView sendMomentLocationPowerView = OooOooO().f48920OooO;
        MomentSendModel sendPostModel = Oooo00O();
        o000Oo0 o000oo1 = new o000Oo0(this);
        Objects.requireNonNull(sendMomentLocationPowerView);
        Intrinsics.checkNotNullParameter(this, "activity");
        Intrinsics.checkNotNullParameter(sendPostModel, "sendPostModel");
        sendMomentLocationPowerView.f25188OoooO0 = this;
        sendMomentLocationPowerView.f25187OoooO = sendPostModel;
        sendMomentLocationPowerView.changeLocationListener = o000oo1;
        OooOooO().f48929OooOO0.setCloseListener(new p540o0o0Oo0.o000O00(this));
        OooOooO().f48929OooOO0.setChangeListener(new p540o0o0Oo0.o000O00O(this));
        OooOooO().f48928OooO0oo.setPollListener(new p540o0o0Oo0.o000O0(this));
        SendMomentEmojiAtPollView sendMomentEmojiAtPollView = OooOooO().f48928OooO0oo;
        int i7 = this.f22393Ooooooo;
        EditTextSpan editContent = OooOooO().f48925OooO0o;
        Intrinsics.checkNotNullExpressionValue(editContent, "binding.mEditContent");
        EmojiFaceView emojiFaceView = OooOooO().f48922OooO0O0;
        Intrinsics.checkNotNullExpressionValue(emojiFaceView, "binding.emojiFaceView");
        PanelLayout faceLayout = OooOooO().f48923OooO0OO;
        Intrinsics.checkNotNullExpressionValue(faceLayout, "binding.faceLayout");
        Objects.requireNonNull(sendMomentEmojiAtPollView);
        Intrinsics.checkNotNullParameter(this, "activity");
        Intrinsics.checkNotNullParameter(editContent, "editContent");
        Intrinsics.checkNotNullParameter(emojiFaceView, "emojiFaceView");
        Intrinsics.checkNotNullParameter(faceLayout, "faceLayout");
        sendMomentEmojiAtPollView.f25181OoooO0O = i7;
        sendMomentEmojiAtPollView.f25178OoooO = editContent;
        emojiFaceView.OooO00o(editContent, true);
        o00O0000 o00o0001 = new o00O0000(faceLayout, editContent);
        ImageView imageView = sendMomentEmojiAtPollView.f25177Oooo.f50628OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivEmoji");
        o00o0001.OooO0O0(imageView);
        sendMomentEmojiAtPollView.f25182OoooOO0 = o00o0001;
        o00o0001.f40642OooO0O0 = o0OOo000.f48240Oooo;
        o00o0001.f40641OooO00o = new o0o0000(sendMomentEmojiAtPollView);
        OooOooO().f48932OooOOO0.setRootListener(new o000O0Oo(this));
        OooOooO().f48925OooO0o.f11748OoooO0O = com.facebook.OooOo.f12714OoooO00;
        EditTextSpan editTextSpan = OooOooO().f48925OooO0o;
        Objects.requireNonNull(editTextSpan);
        if (!TextUtils.isEmpty("@")) {
            editTextSpan.getMaskKeys().put("@", "@");
        }
        OooOooO().f48925OooO0o.f11746OoooO0 = new p143o00OOooO.OooOOO0(this, 2);
        OooOooO().f48925OooO0o.addTextChangedListener(new o0000OO0(this));
        SendMomentShareView sendMomentShareView = OooOooO().f48930OooOO0O;
        EditTextSpan editContent2 = OooOooO().f48925OooO0o;
        Intrinsics.checkNotNullExpressionValue(editContent2, "binding.mEditContent");
        o000 imageHideListener = new o000(this);
        Objects.requireNonNull(sendMomentShareView);
        Intrinsics.checkNotNullParameter(this, "activity");
        Intrinsics.checkNotNullParameter(editContent2, "editContent");
        Intrinsics.checkNotNullParameter(imageHideListener, "imageHideListener");
        sendMomentShareView.f25223OoooO0O = this;
        sendMomentShareView.f25220OoooO = editContent2;
        sendMomentShareView.f25224OoooOO0 = imageHideListener;
        Oooo0OO();
        if (this.f22400o00ooo) {
            o00OOO00.OooO00o(OooOooO().f48925OooO0o, Oooo00O().getContent(), this);
            p138o00OO0oo.OooOOO0 oooOOO0 = p138o00OO0oo.OooOOO0.f31680OooO00o;
            p499o0o00Oo.OooOOO0 oooOOO1 = p499o0o00Oo.OooOOO0.f41199OooO00o;
            o000000O o000000oOooOO0 = p499o0o00Oo.OooOOO0.OooOO0();
            Objects.requireNonNull(o000000oOooOO0);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("sendImage");
            p500o0o00Oo0.OooOOO oooOOO = p500o0o00Oo0.OooOOO.f41235OooO00o;
            sb4.append(oooOOO.OooOo().getValue());
            String strOooO0Oo = o000000oOooOO0.OooO0Oo(sb4.toString(), "");
            ArrayList arrayList = new ArrayList();
            if (strOooO0Oo != null) {
                if (StringsKt.OooO0OO(strOooO0Oo, ",")) {
                    Object[] array = StringsKt__StringsKt.split$default(strOooO0Oo, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
                    Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    CollectionsKt.addAll(arrayList, (String[]) array);
                } else {
                    arrayList.add(strOooO0Oo);
                }
            }
            o00O00.OooO0O0("getSendImage imageList = " + arrayList + "= ");
            p138o00OO0oo.OooOOO0.OooO0O0().clear();
            p138o00OO0oo.OooOOO0.OooO0O0().addAll(arrayList);
            List<String> listData = p138o00OO0oo.OooOOO0.OooO0O0();
            o00oOoo o00ooooOooo000 = Oooo000();
            Objects.requireNonNull(o00ooooOooo000);
            Intrinsics.checkNotNullParameter(listData, "listData");
            o00ooooOooo000.f44180OooO0Oo.setNewData(o00ooooOooo000.OooO00o(listData));
            o00ooooOooo000.OooO0OO();
            o000000O o000000oOooOO1 = p499o0o00Oo.OooOOO0.OooOO0();
            Objects.requireNonNull(o000000oOooOO1);
            StringBuilder sbOooO0O5 = OooO00o.OooO00o.OooO0O0("sendPoll");
            sbOooO0O5.append(oooOOO.OooOo().getValue());
            MomentSendPollModel poll = (MomentSendPollModel) o0Oo0oo.OooO0OO(o000000oOooOO1.OooO0Oo(sbOooO0O5.toString(), ""), MomentSendPollModel.class);
            o00O00.OooO0O0("getSendPoll fromJson = " + poll + "= ");
            p138o00OO0oo.OooOOO0 oooOOO2 = p138o00OO0oo.OooOOO0.f31680OooO00o;
            if (poll != null) {
                SendMomentPollView sendMomentPollView = OooOooO().f48929OooOO0;
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
                sendMomentPollView.f25206Oooo.f50804OooO0Oo.postDelayed(new oO00000(sendMomentPollView, i), 210L);
            }
        } else {
            int type3 = OooOooo().getType();
            if (type3 == MomentType.Share.getValue()) {
                if (OooOooo().getRoomShareModel() != null) {
                    EditTextSpan editTextSpan2 = OooOooO().f48925OooO0o;
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.Room_ID_XXX);
                    String[] strArr = new String[1];
                    RoomShareModel roomShareModel2 = OooOooo().getRoomShareModel();
                    strArr[0] = roomShareModel2 != null ? roomShareModel2.getRoomIdx() : null;
                    editTextSpan2.setText(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO, strArr));
                    OooOooO().f48925OooO0o.setSelection(OooOooO().f48925OooO0o.getText().length());
                }
                OooOooO().f48928OooO0oo.OooO0Oo();
            } else if (type3 == MomentType.Forward.getValue()) {
                OooOooO().f48928OooO0oo.OooO0Oo();
            }
        }
        OooOooO().f48932OooOOO0.setData(this.f22392OoooooO);
        if (Oooo00O().isInEdit()) {
            OooOoO0(o000O0O0.OooO0OO(R.string.Moment_Edit_Page_Title));
            HeaderLayout headerLayout6 = this.f11480OoooOOO;
            if (headerLayout6 != null) {
                headerLayout6.OooOoo(o000O0O0.OooO0OO(R.string.Moment_Edit_Page_Save), new o000OO(this));
            }
            p499o0o00Oo.OooOOO0 oooOOO3 = p499o0o00Oo.OooOOO0.f41199OooO00o;
            o000000 o000000VarOooO = p499o0o00Oo.OooOOO0.OooO();
            Objects.requireNonNull(o000000VarOooO);
            if (!o000000VarOooO.OooO00o("isHideMomentEditTipsFirst" + p500o0o00Oo0.OooOOO.f41235OooO00o.OooOo().getValue(), false)) {
                SendMomentTipsView sendMomentTipsView = OooOooO().f48931OooOO0o;
                Intrinsics.checkNotNullExpressionValue(sendMomentTipsView, "binding.sendMomentTipsView");
                com.yalla.support.common.util.o00O0O.OooO(sendMomentTipsView);
                OooOooO().f48931OooOO0o.setData(OooOooo().getEditMaxNum());
                OooOooO().f48931OooOO0o.setCloseListener(new o0000O(this));
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
                        this.f22392OoooooO = topicInfoModel2;
                    }
                    o00OOO00.OooO00o(OooOooO().f48925OooO0o, content2, this);
                }
                int type4 = Oooo00O().getType();
                if ((((type4 == MomentType.Event.getValue() || type4 == MomentType.Share.getValue()) || type4 == MomentType.Forward.getValue()) ? 1 : 0) != 0) {
                    OooOooO().f48930OooOO0O.OooO00o(OooOooo(), Oooo00O());
                } else if (type4 == MomentType.Image.getValue()) {
                    ArrayList<ImageView9GridModel> imageInfoList = editMomentDetailModel2.getImageInfoList();
                    ArrayList listData2 = new ArrayList();
                    Iterator<T> it = imageInfoList.iterator();
                    while (it.hasNext()) {
                        listData2.add(CloudImageUtilKt.imgFormat(((ImageView9GridModel) it.next()).getUrl()));
                    }
                    o00oOoo o00ooooOooo001 = Oooo000();
                    Objects.requireNonNull(o00ooooOooo001);
                    Intrinsics.checkNotNullParameter(listData2, "listData");
                    o00ooooOooo001.f44180OooO0Oo.setNewData(o00ooooOooo001.OooO00o(listData2));
                    o00ooooOooo001.OooO0OO();
                }
                Oooo00O().setAddress(editMomentDetailModel2.getAddress());
                Oooo00O().setPower(editMomentDetailModel2.getPower());
                o00O00.OooO0O0("编辑动态 initEditView\n\t editMomentDetailModel : " + editMomentDetailModel2 + "\n\t sendPostModel : " + Oooo00O());
            }
            SendMomentTopicView sendMomentTopicView = OooOooO().f48932OooOOO0;
            Intrinsics.checkNotNullExpressionValue(sendMomentTopicView, "binding.sendMomentTopicView");
            com.yalla.support.common.util.o00O0O.OooO(sendMomentTopicView);
            OooOooO().f48932OooOOO0.setIsInEdit(true);
            OooOooO().f48932OooOOO0.setData(this.f22392OoooooO);
            OooOooO().f48920OooO.OooO0Oo(true, true, this.f22392OoooooO, Oooo00O());
            OooOooO().f48928OooO0oo.OooO0Oo();
            this.f22398o00oO0O = OooOooO().f48925OooO0o.getText().toString();
        } else {
            int type5 = OooOooo().getType();
            if (type5 == MomentType.Share.getValue() || type5 == MomentType.Image.getValue()) {
                SendMomentTopicView sendMomentTopicView2 = OooOooO().f48932OooOOO0;
                Intrinsics.checkNotNullExpressionValue(sendMomentTopicView2, "binding.sendMomentTopicView");
                com.yalla.support.common.util.o00O0O.OooO00o(sendMomentTopicView2);
                OooOooO().f48925OooO0o.setHint(o000O0O0.OooO0OO(R.string.SendPost_NoTopic_Hint));
            } else if (type5 == MomentType.Forward.getValue()) {
                SendMomentTopicView sendMomentTopicView3 = OooOooO().f48932OooOOO0;
                Intrinsics.checkNotNullExpressionValue(sendMomentTopicView3, "binding.sendMomentTopicView");
                com.yalla.support.common.util.o00O0O.OooO(sendMomentTopicView3);
                OooOooO().f48925OooO0o.setHint(o000O0O0.OooO0OO(R.string.SendPost_NoTopic_Hint));
                OooOooO().f48925OooO0o.setHint(o000O0O0.OooO0OO(R.string.SendPost_AddTopic_Hint));
            } else if (type5 == MomentType.Topic.getValue()) {
                OooOooO().f48925OooO0o.setHint(o000O0O0.OooO0OO(R.string.SendPost_AddTopic_Hint));
            }
            OooOooO().f48930OooOO0O.OooO00o(OooOooo(), Oooo00O());
            OooOooO().f48920OooO.OooO0Oo(this.f22400o00ooo, false, this.f22392OoooooO, Oooo00O());
        }
        Oooo00o().getPollConfig().observe(this, new o0o0000.OooOo(new o0000O0O(this), null, null, false, 14));
        o00O00o0 o00o00o1 = new o00O00o0(this, OooOooO().f48925OooO0o, OooOooO().f48929OooOO0);
        this.f22404ooOO = o00o00o1;
        o00o00o1.f44176OooO0oO = OooOooo();
        o00O00o0 o00o00o2 = this.f22404ooOO;
        if (o00o00o2 != null) {
            int i8 = this.f22393Ooooooo;
            int i9 = this.f22401o0OoOo0;
            o00o00o2.f44173OooO0Oo = i8;
            o00o00o2.f44175OooO0o0 = i9;
        }
        if (o00o00o2 != null && (headerLayout = this.f11480OoooOOO) != null) {
            headerLayout.getF12058o00000();
        }
        LiveEventBus.get("MOMENT_EDIT_SEND_SHOWING", MomentSendModel.class).observe(this, new p536o0o0OOo0.o00O0(this, i4));
        Class cls = Long.TYPE;
        LiveEventBus.get("MOMENT_EDIT_SEND_SUCCESS", cls).observe(this, new o0O0O0o0(this, i2));
        LiveEventBus.get("MOMENT_EDIT_SEND_FILED_CONTENT", cls).observe(this, new oo0O(this, i3));
        LiveEventBus.get("MOMENT_EDIT_SEND_FILED_IMAGE", cls).observe(this, new o00OOO0O(this, i2));
        Oooo00o().statisticalTime();
        String image = this.f22395o00Oo0;
        if (image != null) {
            o00oOoo o00ooooOooo002 = Oooo000();
            Objects.requireNonNull(o00ooooOooo002);
            Intrinsics.checkNotNullParameter(image, "image");
            o00ooooOooo002.f44180OooO0Oo.addData(image);
            o00ooooOooo002.OooO0OO();
        }
        StringBuilder sbOooO0O6 = OooO00o.OooO00o.OooO0O0("编辑动态 onCreateEnd\n momentSendShareModel = ");
        sbOooO0O6.append(OooOooo());
        sbOooO0O6.append("\n isRecoverMoment = ");
        sbOooO0O6.append(this.f22400o00ooo);
        sbOooO0O6.append("\n sendPostModel = ");
        sbOooO0O6.append(Oooo00O());
        o00O00.OooO0O0(sbOooO0O6.toString());
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
                OooOooO().f48928OooO0oo.OooO0O0();
            }
            return super.onKeyDown(i, keyEvent);
        }
        o00O0000 o00o0001 = OooOooO().f48928OooO0oo.f25182OoooOO0;
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
