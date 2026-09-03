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
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o000O0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.model.MomentSelectMedia;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModelKt;
import com.yalla.yalla.model.moment.MomentImageModel;
import com.yalla.yalla.model.moment.MomentSendContentAtModel;
import com.yalla.yalla.model.moment.MomentSendContentModel;
import com.yalla.yalla.model.moment.MomentSendModel;
import com.yalla.yalla.model.moment.MomentSendPollModel;
import com.yalla.yalla.model.moment.MomentSendShareModel;
import com.yalla.yalla.model.moment.MomentSendShareType;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.model.share.ShareWebModel;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.view.editTextSpan.EditTextSpan;
import com.yalla.yalla.ui.view.moment.SendMomentEmojiAtPollView;
import com.yalla.yalla.ui.view.moment.SendMomentLocationPowerView;
import com.yalla.yalla.ui.view.moment.SendMomentPollView;
import com.yalla.yalla.ui.view.moment.SendMomentTipsView;
import com.yalla.yalla.ui.view.moment.SendMomentTopicView;
import com.yalla.yalla.ui.view.pop.roomSharePop.RoomShareModel;
import com.yalla.yalla.ui.view.recyclerview.NoScrollRecyclerView;
import com.yalla.yalla.ui.vm.moment.MomentSendVM;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p037OoooOo0.o00O0000;
import p205o00o0o0o.o000O;
import p381o0OOoOOO.o00O00o0;
import p407o0Oo0OOO.o00O0OO;
import p416o0Oo0oO.oO00O0o;
import p416o0Oo0oO.oO00O0o0;
import p425o0OoO0OO.o0000O;
import p425o0OoO0OO.o0000OO0;
import p425o0OoO0OO.oOO00O;
import p450o0OoOoo.o0O000Oo;
import p474o0OoooOO.oo0oO0;
import p493o0o00O0o.o0OO000o;
import p493o0o00O0o.oO;
import p493o0o00O0o.oO0O0Oo0;
import p493o0o00O0o.oO0OO0O;
import p493o0o00O0o.oO0o0000;
import p493o0o00O0o.oO0oO000;
import p493o0o00O0o.oOO000;
import p493o0o00O0o.oOO0000;
import p493o0o00O0o.oOO00000;
import p493o0o00O0o.oOO000o;
import p493o0o00O0o.oOo00o00;
import p493o0o00O0o.oOo0o0oO;
import p493o0o00O0o.ooo0o;
import p546o0o0Ooo0.o0OO00o0;
import p559o0oOOoo0.o0O000;
import p566o0oOo00O.o00OO0O0;
import p566o0oOo00O.o0o0Oo;
import p587o0oOooO.oO00OOo0;
import p587o0oOooO.oO0Oo0o0;
import p587o0oOooO.oOO00;
import p593o0oOoooO.h0;
import p600o0oo00Oo.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/MomentSendActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMomentSendActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentSendActivity.kt\ncom/yalla/yalla/ui/activity/moment/MomentSendActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1017:1\n22#2,2:1018\n75#3,13:1020\n1855#4,2:1033\n1855#4,2:1035\n1855#4,2:1037\n*S KotlinDebug\n*F\n+ 1 MomentSendActivity.kt\ncom/yalla/yalla/ui/activity/moment/MomentSendActivity\n*L\n84#1:1018,2\n142#1:1020,13\n301#1:1033,2\n629#1:1035,2\n941#1:1037,2\n*E\n"})
public final class MomentSendActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public static final /* synthetic */ int f25728Oooo0OO = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public TopicInfoModel f25730OooOo;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public p494o0o00OO0.oo000o f25737OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public String f25738OooOoo;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public long f25741OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f25743Oooo000;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f25729OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(o00O0OO.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public String f25732OooOo00 = "";

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f25731OooOo0 = -1;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final Lazy f25733OooOo0O = LazyKt.lazy(new OooOO0());

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final Lazy f25734OooOo0o = LazyKt.lazy(new OooOOOO());

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f25736OooOoO0 = 10;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f25735OooOoO = 3;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final Lazy f25739OooOoo0 = LazyKt.lazy(new OooOOO());

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final long f25740OooOooO = 1000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25744Oooo00O = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MomentSendVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.MomentSendActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f25761OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25761OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @NotNull
    public final Lazy f25745Oooo00o = LazyKt.lazy(new OooO0o());

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    @NotNull
    public final Lazy f25742Oooo0 = LazyKt.lazy(new OooO());

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    @NotNull
    public String f25746Oooo0O0 = "";

    public static final class OooO extends Lambda implements Function0<oOO00> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oOO00 invoke() {
            return new oOO00(MomentSendActivity.this);
        }
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: com.yalla.yalla.ui.activity.moment.MomentSendActivity$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0325OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Context f25748OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ MomentSendShareModel f25749OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0325OooO00o(Context context, MomentSendShareModel momentSendShareModel) {
                super(0);
                this.f25748OooO0Oo = context;
                this.f25749OooO0o0 = momentSendShareModel;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Context context = this.f25748OooO0Oo;
                Intent intent = new Intent(context, (Class<?>) MomentSendActivity.class);
                intent.putExtra("SHARE_POST_MODEL", this.f25749OooO0o0);
                context.startActivity(intent);
                return Unit.INSTANCE;
            }
        }

        public static void OooO00o(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            MomentSendShareModel momentSendShareModel = new MomentSendShareModel(MomentType.Text.getValue());
            momentSendShareModel.setSharePostType(MomentSendShareType.CreateText);
            OooO0O0(context, momentSendShareModel);
        }

        public static void OooO0O0(@NotNull Context context, @NotNull MomentSendShareModel sharePostModel) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sharePostModel, "sharePostModel");
            C0325OooO00o onLogin = new C0325OooO00o(context, sharePostModel);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            if (Intrinsics.areEqual(oo0oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
                return;
            }
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                int i = LoginActivity.f24734OooOo0O;
                LoginActivity.OooO00o.OooO00o(activityOooO0O0);
            }
        }
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[MomentAdapterTag.values().length];
            try {
                iArr[MomentAdapterTag.PrivateChat.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MomentAdapterTag.PostDetailActivity.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[WebFrom.values().length];
            try {
                iArr2[WebFrom.RoomMainBanner.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[WebFrom.MomentActivityBanner.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[MomentSendShareType.values().length];
            try {
                iArr3[MomentSendShareType.ShareRoom.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[MomentSendShareType.ShareEvent.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[MomentSendShareType.ShareWeb.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<MomentSelectMedia, MomentSelectMedia> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f25750OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final MomentSelectMedia invoke(MomentSelectMedia momentSelectMedia) {
            MomentSelectMedia it = momentSelectMedia;
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<oO0Oo0o0> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oO0Oo0o0 invoke() {
            return new oO0Oo0o0(MomentSendActivity.this);
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<MomentSendShareModel> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentSendShareModel invoke() {
            Serializable serializableExtra = MomentSendActivity.this.getIntent().getSerializableExtra("SHARE_POST_MODEL");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.yalla.yalla.model.moment.MomentSendShareModel");
            return (MomentSendShareModel) serializableExtra;
        }
    }

    @SourceDebugExtension({"SMAP\nMomentSendActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentSendActivity.kt\ncom/yalla/yalla/ui/activity/moment/MomentSendActivity$onBackClick$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1017:1\n1855#2,2:1018\n*S KotlinDebug\n*F\n+ 1 MomentSendActivity.kt\ncom/yalla/yalla/ui/activity/moment/MomentSendActivity$onBackClick$1\n*L\n840#1:1018,2\n*E\n"})
    public static final class OooOO0O extends Lambda implements Function0<Object> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f25754OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(Ref.BooleanRef booleanRef) {
            super(0);
            this.f25754OooO0o0 = booleanRef;
        }

        /* JADX WARN: Code duplicated, block: B:35:0x0119  */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            final MomentSendModel momentSendModelOooOoOO;
            String jSONString;
            MomentSendContentModel content;
            h0.OooO0OO("106108", MapsKt.mapOf(TuplesKt.to("state", 1)));
            int i = MomentSendActivity.f25728Oooo0OO;
            MomentSendActivity momentSendActivity = MomentSendActivity.this;
            if (momentSendActivity.OooOoOO().isInEdit()) {
                return null;
            }
            if (this.f25754OooO0o0.element) {
                Collection collection = momentSendActivity.OooOoO().f49538OooO0OO.f13200OooOOoo;
                Intrinsics.checkNotNull(collection, "null cannot be cast to non-null type java.util.ArrayList<com.yalla.yalla.model.MomentSelectMedia>{ kotlin.collections.TypeAliasesKt.ArrayList<com.yalla.yalla.model.MomentSelectMedia> }");
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) collection).iterator();
                while (it.hasNext()) {
                    arrayList.add((MomentSelectMedia) it.next());
                }
                p494o0o00OO0.oo000o oo000oVar = momentSendActivity.f25737OooOoOO;
                String str = "";
                if (oo000oVar != null) {
                    momentSendModelOooOoOO = momentSendActivity.OooOoOO();
                    Activity activity = oo000oVar.f49581OooO00o;
                    EditTextSpan editTextSpan = oo000oVar.f49582OooO0O0;
                    MomentSendContentModel momentSendContentModel = new MomentSendContentModel(o0000oo.OooO00o(activity, editTextSpan));
                    ArrayList<? extends o0O000> arrayListOooO0O0 = editTextSpan.getSpanManager().OooO0O0("@");
                    for (int i2 = 0; i2 < arrayListOooO0O0.size(); i2++) {
                        o0O000 o0o001 = arrayListOooO0O0.get(i2);
                        if (o0o001 != null) {
                            momentSendContentModel.getAt().add(new MomentSendContentAtModel(android.support.v4.media.session.OooO0OO.OooO00o(new StringBuilder(), o0o001.f56122OooO0o0, ""), o0o001.f56120OooO0Oo));
                        }
                    }
                    momentSendModelOooOoOO.setContent(momentSendContentModel);
                    if (momentSendModelOooOoOO.getType() == MomentType.Text.getValue()) {
                        p494o0o00OO0.OooO0OO.OooO00o(arrayList, new Function1() { // from class: o0o00OO0.o00Ooo
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                momentSendModelOooOoOO.setType(((MomentType) obj).getValue());
                                return null;
                            }
                        });
                    }
                    p597o0oo00O.OooOOOO.OooO0oO("sendPost\n sendPostModel.Text = " + momentSendContentModel.getContent() + "\n sendPostModel.Text.Length = " + momentSendContentModel.getContent().length() + "\n sendPostModel = " + momentSendModelOooOoOO.toJSONString());
                } else {
                    momentSendModelOooOoOO = null;
                }
                TopicInfoModel topicInfoModel = momentSendActivity.f25730OooOo;
                if (topicInfoModel != null && momentSendModelOooOoOO != null && (content = momentSendModelOooOoOO.getContent()) != null) {
                    content.setCircle(topicInfoModel.getId(), topicInfoModel.getName());
                }
                MomentSendPollModel sendMomentPoll = momentSendActivity.OooOo().f44321OooO0oo.getSendMomentPoll();
                oO00O0o oo00o0oOooOO0 = p417o0Oo0oO0.o00Oo0.OooOO0();
                if (momentSendModelOooOoOO != null) {
                    oo00o0oOooOO0.getClass();
                    jSONString = momentSendModelOooOoOO.toJSONString();
                    if (jSONString == null) {
                        jSONString = "";
                    }
                } else {
                    jSONString = "";
                }
                oo00o0oOooOO0.OooOO0o(jSONString);
                p539o0o0Oo00.OooO.f54305OooO00o = arrayList;
                oO00O0o oo00o0oOooOO1 = p417o0Oo0oO0.o00Oo0.OooOO0();
                oo00o0oOooOO1.getClass();
                oO00O0o.OooO00o oooO00o = new oO00O0o.OooO00o();
                oooO00o.f46397OooO00o = arrayList;
                oo00o0oOooOO1.OooOO0O(p187o00o00o0.OooO.OooO00o(oooO00o));
                oO00O0o oo00o0oOooOO2 = p417o0Oo0oO0.o00Oo0.OooOO0();
                if (sendMomentPoll != null) {
                    oo00o0oOooOO2.getClass();
                    String jSONString2 = sendMomentPoll.toJSONString();
                    if (jSONString2 != null) {
                        str = jSONString2;
                    }
                }
                oo00o0oOooOO2.OooOOO0(str);
            }
            momentSendActivity.finish();
            return null;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<p494o0o00OO0.OooO> {
        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p494o0o00OO0.OooO invoke() {
            int i = MomentSendActivity.f25728Oooo0OO;
            MomentSendActivity momentSendActivity = MomentSendActivity.this;
            NoScrollRecyclerView imagesRecyclerView = momentSendActivity.OooOo().f44317OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(imagesRecyclerView, "imagesRecyclerView");
            p494o0o00OO0.OooO oooO = new p494o0o00OO0.OooO(momentSendActivity, imagesRecyclerView);
            oooO.f49539OooO0Oo = new o00oO0o(momentSendActivity);
            oooO.f49541OooO0o0 = new o0ooOOo(momentSendActivity);
            return oooO;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Object> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f25757OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(Ref.BooleanRef booleanRef) {
            super(0);
            this.f25757OooO0o0 = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            h0.OooO0OO("106108", MapsKt.mapOf(TuplesKt.to("state", 0)));
            int i = MomentSendActivity.f25728Oooo0OO;
            MomentSendActivity momentSendActivity = MomentSendActivity.this;
            if (momentSendActivity.OooOoOO().isInEdit()) {
                momentSendActivity.finish();
                return null;
            }
            if (this.f25757OooO0o0.element) {
                List<MomentSelectMedia> list = p539o0o0Oo00.OooO.f54305OooO00o;
                if (list != null) {
                    list.clear();
                }
                p539o0o0Oo00.OooO.f54305OooO00o = null;
                oO00O0o oo00o0oOooOO0 = p417o0Oo0oO0.o00Oo0.OooOO0();
                oo00o0oOooOO0.OooOO0o("");
                oo00o0oOooOO0.OooOOO0("");
                oo00o0oOooOO0.OooOO0O("");
                momentSendActivity.finish();
            }
            return null;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<MomentSendModel> {
        public OooOOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentSendModel invoke() {
            MomentSendModel momentSendModel = new MomentSendModel(null, 1, null);
            oO00O0o oo00o0oOooOO0 = p417o0Oo0oO0.o00Oo0.OooOO0();
            oo00o0oOooOO0.getClass();
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            MomentSendModel momentSendModel2 = (MomentSendModel) p187o00o00o0.OooO.OooO0O0(MomentSendModel.class, oo00o0oOooOO0.OooO0o0("sendModel" + oo0oO0.OooOOo0().getValue(), ""));
            if (momentSendModel2 == null) {
                return momentSendModel;
            }
            int i = MomentSendActivity.f25728Oooo0OO;
            MomentSendActivity momentSendActivity = MomentSendActivity.this;
            if (momentSendActivity.OooOoO0().getType() != MomentType.Text.getValue()) {
                return momentSendModel;
            }
            momentSendActivity.f25743Oooo000 = true;
            return momentSendModel2;
        }
    }

    public final o00O0OO OooOo() {
        return (o00O0OO) this.f25729OooOOoo.getValue();
    }

    public final p494o0o00OO0.OooO OooOoO() {
        return (p494o0o00OO0.OooO) this.f25739OooOoo0.getValue();
    }

    public final MomentSendShareModel OooOoO0() {
        return (MomentSendShareModel) this.f25733OooOo0O.getValue();
    }

    public final MomentSendModel OooOoOO() {
        return (MomentSendModel) this.f25734OooOo0o.getValue();
    }

    public final boolean OooOoo() {
        MomentDetailModel editMomentDetailModel;
        if (OooOoOO().isInEdit() && (editMomentDetailModel = OooOoO0().getEditMomentDetailModel()) != null) {
            p494o0o00OO0.OooO oooOOooOoO = OooOoO();
            oooOOooOoO.getClass();
            ArrayList arrayList = new ArrayList();
            Collection<MomentSelectMedia> collection = oooOOooOoO.f49538OooO0OO.f13200OooOOoo;
            Intrinsics.checkNotNullExpressionValue(collection, "getData(...)");
            for (MomentSelectMedia momentSelectMedia : collection) {
                if (oOO00O.OooO0o(momentSelectMedia.getPath())) {
                    Intrinsics.checkNotNull(momentSelectMedia);
                    arrayList.add(momentSelectMedia);
                }
            }
            if (!o0000O.OooO0O0(arrayList, OooOoOO().getHttpImagesFromEditMomentDetailMedia(), OooO0OO.f25750OooO0Oo) || !Intrinsics.areEqual(editMomentDetailModel.getAddress(), OooOoOO().getAddress()) || !Intrinsics.areEqual(this.f25746Oooo0O0, OooOo().f44319OooO0o0.getText().toString())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MomentSendVM OooOoo0() {
        return (MomentSendVM) this.f25744Oooo00O.getValue();
    }

    public final boolean OooOooO() {
        OooOo().f44318OooO0o.OooO0o0();
        String string = StringsKt.trim((CharSequence) OooOo().f44319OooO0o0.getText().toString()).toString();
        if (!(string.length() > 0) && !OooOoO().OooO0O0()) {
            MomentSendPollModel sendMomentPoll = OooOo().f44321OooO0oo.getSendMomentPoll();
            if (sendMomentPoll != null) {
                Iterator<T> it = sendMomentPoll.getOption().iterator();
                while (it.hasNext()) {
                    string = ((Object) string) + ((MomentSendPollModel.Option) it.next()).getText();
                }
            }
            if (!(!StringsKt.isBlank(string)) && TextUtils.isEmpty(OooOoOO().getSourcesid())) {
                List<MomentSelectMedia> list = p539o0o0Oo00.OooO.f54305OooO00o;
                if (list != null) {
                    list.clear();
                }
                p539o0o0Oo00.OooO.f54305OooO00o = null;
                oO00O0o oo00o0oOooOO0 = p417o0Oo0oO0.o00Oo0.OooOO0();
                oo00o0oOooOO0.OooOO0o("");
                oo00o0oOooOO0.OooOOO0("");
                oo00o0oOooOO0.OooOO0O("");
                finish();
                return true;
            }
        }
        String strOooO0OO = o0000OO0.OooO0OO(this, p565o0oOo000.o000OOo.send_post_keep_this_edit);
        String strOooO0OO2 = o0000OO0.OooO0OO(this, p565o0oOo000.o000OOo.Discard);
        String strOooO0OO3 = o0000OO0.OooO0OO(this, p565o0oOo000.o000OOo.Save);
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        if (OooOoOO().isInEdit()) {
            strOooO0OO = o0000OO0.OooO0OO(this, p565o0oOo000.o000OOo.Moment_Edit_Page_Changes);
            strOooO0OO2 = o0000OO0.OooO0OO(this, p565o0oOo000.o000OOo.Moment_Edit_Page_Discard);
            strOooO0OO3 = o0000OO0.OooO0OO(this, p565o0oOo000.o000OOo.Cancel);
            if (!OooOoo()) {
                List<MomentSelectMedia> list2 = p539o0o0Oo00.OooO.f54305OooO00o;
                if (list2 != null) {
                    list2.clear();
                }
                p539o0o0Oo00.OooO.f54305OooO00o = null;
                oO00O0o oo00o0oOooOO1 = p417o0Oo0oO0.o00Oo0.OooOO0();
                oo00o0oOooOO1.OooOO0o("");
                oo00o0oOooOO1.OooOOO0("");
                oo00o0oOooOO1.OooOO0O("");
                finish();
                return false;
            }
        } else if (OooOoO0().getType() == MomentType.Share.getValue() || OooOoO0().getType() == MomentType.Forward.getValue()) {
            strOooO0OO = o0000OO0.OooO0OO(this, p565o0oOo000.o000OOo.Sure_to_quit_editing);
            strOooO0OO2 = o0000OO0.OooO0OO(this, p565o0oOo000.o000OOo.Cancel);
            strOooO0OO3 = o0000OO0.OooO0OO(this, p565o0oOo000.o000OOo.OK);
            booleanRef.element = false;
        }
        o000O o000o = new o000O(this);
        o000o.OooOo00(strOooO0OO);
        if (oOO00O.OooO0o(strOooO0OO3)) {
            o000o.OooOOOo(strOooO0OO3);
            o000o.OooOo0(new OooOO0O(booleanRef));
        }
        o000o.OooOo0o(strOooO0OO2);
        o000o.OooOo0O(new OooOOO0(booleanRef));
        o000o.OooOO0o();
        return false;
    }

    public final void OooOooo() {
        boolean z = false;
        if (OooOoOO().isInEdit()) {
            OooOoo0().setToolbarIsClickable(OooOoo());
            OooOo().f44318OooO0o.OooO0OO(OooOoO().f49542OooO0oO <= 0 && OooOoO().f49543OooO0oo < 9);
            SendMomentEmojiAtPollView sendMomentEmojiAtPollView = OooOo().f44318OooO0o;
            if (OooOoO().f49542OooO0oO <= 0 && OooOoO().f49543OooO0oo < 9) {
                z = true;
            }
            sendMomentEmojiAtPollView.OooO0Oo(z);
            return;
        }
        if (OooOoO0().getType() == MomentType.Share.getValue() || OooOoO0().getType() == MomentType.Forward.getValue()) {
            OooOoo0().setToolbarIsClickable(true);
            return;
        }
        MomentSendPollModel sendMomentPoll = OooOo().f44321OooO0oo.getSendMomentPoll();
        if (sendMomentPoll == null) {
            MomentSendVM momentSendVMOooOoo0 = OooOoo0();
            Editable text = OooOo().f44319OooO0o0.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            momentSendVMOooOoo0.setToolbarIsClickable((text.length() > 0) || OooOoO().OooO0O0());
            OooOo().f44318OooO0o.OooO0OO(OooOoO().f49542OooO0oO <= 0 && OooOoO().f49543OooO0oo < 9);
            OooOo().f44318OooO0o.OooO0Oo(OooOoO().f49542OooO0oO <= 0 && OooOoO().f49543OooO0oo < 9);
            SendMomentEmojiAtPollView sendMomentEmojiAtPollView2 = OooOo().f44318OooO0o;
            if (OooOoO().f49542OooO0oO <= 0 && OooOoO().f49543OooO0oo <= 0) {
                z = true;
            }
            sendMomentEmojiAtPollView2.OooO0o(z);
            return;
        }
        Iterator<T> it = sendMomentPoll.getOption().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((MomentSendPollModel.Option) it.next()).getText().length() > 0) {
                i++;
            }
        }
        MomentSendVM momentSendVMOooOoo1 = OooOoo0();
        Editable text2 = OooOo().f44319OooO0o0.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        momentSendVMOooOoo1.setToolbarIsClickable((text2.length() > 0) && i >= 2 && sendMomentPoll.getExpireTime() > 0);
        OooOo().f44318OooO0o.OooO0OO(false);
        OooOo().f44318OooO0o.OooO0Oo(false);
        OooOo().f44318OooO0o.OooO0o(true);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        EditTextSpan view = OooOo().f44319OooO0o0;
        Intrinsics.checkNotNullExpressionValue(view, "mEditContent");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        InputMethodManager inputMethodManagerOooO00o = p373o0OOo0oO.o0OOO0o.OooO00o(context);
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            o00O00o0.OooO0OO(window, 0);
        }
        setContentView(OooOo().f44314OooO00o);
        MomentSendContentModel content = OooOoOO().getContent();
        if (content != null && content.hasCircle()) {
            TopicInfoModel topicInfoModel = new TopicInfoModel();
            topicInfoModel.setId(content.getCircleId());
            String circleName = content.getCircleName();
            if (circleName == null) {
                circleName = "";
            }
            topicInfoModel.setName(circleName);
            this.f25730OooOo = topicInfoModel;
        }
        OooOoOO().setType(OooOoO0().getType());
        OooOoOO().setEditToken(com.code.android.util.o0OoOo0.OooOOO(OooOoO0().getEditToken(), ""));
        OooOoOO().setEditedNum(com.code.android.util.o0OoOo0.OooO0o0(0, OooOoO0().getEditedNum()));
        OooOoOO().setEditMaxNum(com.code.android.util.o0OoOo0.OooO0o0(0, OooOoO0().getEditMaxNum()));
        MomentDetailModel editMomentDetailModel = OooOoO0().getEditMomentDetailModel();
        if (editMomentDetailModel != null) {
            OooOoOO().setPostId(com.code.android.util.o0OoOo0.OooOO0(Long.valueOf(editMomentDetailModel.getId())));
            for (MomentImageModel momentImageModel : editMomentDetailModel.getImageInfoList()) {
                OooOoOO().getHttpImagesFromEditMomentDetail().add(momentImageModel);
                OooOoOO().getHttpImagesFromEditMomentDetailMedia().add(new MomentSelectMedia(momentImageModel.getUrl()));
            }
            MomentImageModel videoInfo = MomentDetailModelKt.getVideoInfo(editMomentDetailModel);
            if (videoInfo != null) {
                OooOoOO().getHttpImagesFromEditMomentDetail().add(videoInfo);
                List<MomentSelectMedia> httpImagesFromEditMomentDetailMedia = OooOoOO().getHttpImagesFromEditMomentDetailMedia();
                MomentSelectMedia momentSelectMedia = new MomentSelectMedia(videoInfo.getUrl());
                momentSelectMedia.setDuration(videoInfo.getDuration());
                momentSelectMedia.setWidth(videoInfo.getWidth());
                momentSelectMedia.setHeight(videoInfo.getHeight());
                httpImagesFromEditMomentDetailMedia.add(momentSelectMedia);
            }
            OooOoOO().setForward(editMomentDetailModel.getForward());
            OooOoOO().setForwardContentStr(editMomentDetailModel.getForwardContent());
        }
        int type = OooOoO0().getType();
        MomentType momentType = MomentType.Share;
        int i = 1;
        if (type == momentType.getValue()) {
            p597o0oo00O.OooOOOO.OooO0oO("分享 mRoomShareModel " + OooOoO0().getRoomShareModel());
            int i2 = OooO0O0.$EnumSwitchMapping$2[OooOoO0().getSharePostType().ordinal()];
            if (i2 == 1) {
                RoomShareModel roomShareModel = OooOoO0().getRoomShareModel();
                if (roomShareModel != null) {
                    MomentSendModel momentSendModelOooOoOO = OooOoOO();
                    String roomid = roomShareModel.getRoomid();
                    Intrinsics.checkNotNullExpressionValue(roomid, "getRoomid(...)");
                    momentSendModelOooOoOO.setSourcesid(roomid);
                    OooOoOO().setShareType(roomShareModel.getType());
                    int type2 = roomShareModel.getType();
                    if (type2 == WebFrom.RoomMainBanner.getValue()) {
                        OooOoOO().setShareType(3);
                    } else if (type2 == WebFrom.MomentActivityBanner.getValue()) {
                        OooOoOO().setShareType(4);
                    }
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    p597o0oo00O.OooOOOO.OooO0oO("分享Web sharePostModel " + OooOoO0().getWebModel());
                    ShareWebModel webModel = OooOoO0().getWebModel();
                    if (webModel != null) {
                        MomentSendModel momentSendModelOooOoOO2 = OooOoOO();
                        String id = webModel.getId();
                        if (id == null) {
                            id = "";
                        }
                        momentSendModelOooOoOO2.setSourcesid(id);
                        WebFrom webFrom = webModel.getWebFrom();
                        int i3 = webFrom == null ? -1 : OooO0O0.$EnumSwitchMapping$1[webFrom.ordinal()];
                        if (i3 == 1) {
                            OooOoOO().setType(momentType.getValue());
                            OooOoOO().setShareType(3);
                        } else if (i3 == 2) {
                            OooOoOO().setType(momentType.getValue());
                            OooOoOO().setShareType(4);
                        }
                    }
                }
            } else if (OooOoO0().getEventModel() != null) {
                p597o0oo00O.OooOOOO.OooO0oO("分享房主活动 sharePostModel " + OooOoO0().getEventModel());
                MomentSendModel momentSendModelOooOoOO3 = OooOoOO();
                EventModel eventModel = OooOoO0().getEventModel();
                Long lValueOf = eventModel != null ? Long.valueOf(eventModel.getId()) : null;
                StringBuilder sb = new StringBuilder();
                sb.append(lValueOf);
                momentSendModelOooOoOO3.setSourcesid(sb.toString());
                OooOoOO().setType(MomentType.Event.getValue());
                OooOoOO().setShareType(20);
            }
        } else if (type == MomentType.Forward.getValue()) {
            if (OooOoO0().getForwardMomentDetailModel() != null) {
                p597o0oo00O.OooOOOO.OooO0oO("转发 sharePostModel.postDetailModel " + OooOoO0().getForwardMomentDetailModel());
                MomentSendModel momentSendModelOooOoOO4 = OooOoOO();
                MomentDetailModel forwardMomentDetailModel = OooOoO0().getForwardMomentDetailModel();
                Long lValueOf2 = forwardMomentDetailModel != null ? Long.valueOf(forwardMomentDetailModel.getId()) : null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(lValueOf2);
                momentSendModelOooOoOO4.setSourcesid(sb2.toString());
            }
        } else if (type == MomentType.Image.getValue()) {
            String imagePath = OooOoO0().getImagePath();
            if (imagePath != null) {
                try {
                    if (imagePath.length() > 0) {
                        File file = new File(imagePath);
                        if (!file.exists() && !TextUtils.isEmpty(file.getName())) {
                            String name = file.getName();
                            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                            String strSubstring = name.substring(0, 1);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                            if (Intrinsics.areEqual(".", strSubstring)) {
                                File parentFile = file.getParentFile();
                                String path = parentFile != null ? parentFile.getPath() : null;
                                String str = File.separator;
                                String name2 = file.getName();
                                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                                String strSubstring2 = name2.substring(1);
                                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                                imagePath = path + str + strSubstring2;
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            this.f25738OooOoo = imagePath;
            p597o0oo00O.OooOOOO.OooO0oO("本地截图发起的动态 postImageModel " + imagePath);
        } else if (type == MomentType.Topic.getValue()) {
            this.f25730OooOo = OooOoO0().getTopicInfoModel();
            OooOoOO().setType(MomentType.Text.getValue());
            p597o0oo00O.OooOOOO.OooO0oO("圈子发起 mTopicInfoModel " + this.f25730OooOo);
        }
        oO00OOo0.OooO0oO();
        OooOoo0().setToolbarTitleText(o0000OO0.OooO0OO(this, p565o0oOo000.o000OOo.Post));
        OooOoo0().setToolbarRightText(o0000OO0.OooO0OO(this, p565o0oOo000.o000OOo.Btn_Post));
        OooOoo0().setToolbarIsClickable(false);
        ComposeView topComposeView = OooOo().f44324OooOO0o;
        Intrinsics.checkNotNullExpressionValue(topComposeView, "topComposeView");
        p193o00o0O0O.o0000oo.OooO0Oo(topComposeView, ComposableLambdaKt.composableLambdaInstance(995593087, true, new p493o0o00O0o.oO0Oo0o0(this)));
        SendMomentLocationPowerView sendMomentLocationPowerView = OooOo().f44320OooO0oO;
        MomentSendModel sendPostModel = OooOoOO();
        oO0o0000 oo0o0000 = new oO0o0000(this);
        sendMomentLocationPowerView.getClass();
        Intrinsics.checkNotNullParameter(this, "activity");
        Intrinsics.checkNotNullParameter(sendPostModel, "sendPostModel");
        sendMomentLocationPowerView.f30668OooO0o = this;
        sendMomentLocationPowerView.f30670OooO0oO = sendPostModel;
        sendMomentLocationPowerView.changeLocationListener = oo0o0000;
        OooOo().f44321OooO0oo.setCloseListener(new oO0oO000(this));
        OooOo().f44321OooO0oo.setChangeListener(new oOo00o00(this));
        OooOo().f44318OooO0o.setAddImageListener(new oO(this));
        OooOo().f44318OooO0o.setAddVideoListener(new oOO00000(this));
        OooOo().f44318OooO0o.setPollListener(new oOO0000(this));
        SendMomentEmojiAtPollView sendMomentEmojiAtPollView = OooOo().f44318OooO0o;
        EditTextSpan editContent = OooOo().f44319OooO0o0;
        Intrinsics.checkNotNullExpressionValue(editContent, "mEditContent");
        ComposeView bottomComposeView = OooOo().f44315OooO0O0;
        Intrinsics.checkNotNullExpressionValue(bottomComposeView, "bottomComposeView");
        sendMomentEmojiAtPollView.getClass();
        Intrinsics.checkNotNullParameter(this, "activity");
        Intrinsics.checkNotNullParameter(editContent, "editContent");
        Intrinsics.checkNotNullParameter(bottomComposeView, "bottomComposeView");
        sendMomentEmojiAtPollView.f30647OooO = this;
        int i4 = this.f25736OooOoO0;
        sendMomentEmojiAtPollView.f30653OooOO0 = i4;
        sendMomentEmojiAtPollView.f30654OooOO0O = editContent;
        p193o00o0O0O.o0000oo.OooO0Oo(bottomComposeView, ComposableLambdaKt.composableLambdaInstance(-1966316632, true, new o00OO0O0(sendMomentEmojiAtPollView, new o0OO00o0(true, 287), editContent)));
        ComposeView composeView = OooOo().f44316OooO0OO;
        Intrinsics.checkNotNullExpressionValue(composeView, "composeView");
        p193o00o0O0O.o0000oo.OooO0Oo(composeView, o0OO000o.f49187OooO00o);
        OooOo().f44322OooOO0.setRootListener(new oOO000(this));
        OooOo().f44322OooOO0.setClearTopicListener(new oOO000o(this));
        OooOo().f44319OooO0o0.f30439OooO0oO = new o000O0.o0000OO0();
        EditTextSpan editTextSpan = OooOo().f44319OooO0o0;
        editTextSpan.getClass();
        if (!TextUtils.isEmpty("@")) {
            editTextSpan.getMaskKeys().put("@", "@");
        }
        OooOo().f44319OooO0o0.f30437OooO0o = new o00O0000(this, 2);
        OooOo().f44319OooO0o0.addTextChangedListener(new ooo0o(this));
        OooOooo();
        if (this.f25743Oooo000) {
            com.google.gson.internal.OooO00o.OooO0O0(this, OooOoOO().getContent(), OooOo().f44319OooO0o0);
            oO00O0o oo00o0oOooOO0 = p417o0Oo0oO0.o00Oo0.OooOO0();
            oo00o0oOooOO0.getClass();
            ArrayList arrayList = new ArrayList();
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            oO00O0o.OooO00o oooO00o = (oO00O0o.OooO00o) p187o00o00o0.OooO.OooO0O0(oO00O0o.OooO00o.class, oo00o0oOooOO0.OooO0o0("momentMediaString" + oo0oO0.OooOOo0().getValue(), ""));
            if (oooO00o != null) {
                arrayList.clear();
                List<MomentSelectMedia> list = oooO00o.f46397OooO00o;
                if (list != null) {
                    arrayList.addAll(list);
                }
            }
            p539o0o0Oo00.OooO.f54305OooO00o = arrayList;
            OooOoO().OooO0OO(arrayList);
            oO00O0o oo00o0oOooOO1 = p417o0Oo0oO0.o00Oo0.OooOO0();
            oo00o0oOooOO1.getClass();
            MomentSendPollModel poll = (MomentSendPollModel) p187o00o00o0.OooO.OooO0O0(MomentSendPollModel.class, oo00o0oOooOO1.OooO0o0("sendPoll" + oo0oO0.OooOOo0().getValue(), ""));
            if (poll != null) {
                SendMomentPollView sendMomentPollView = OooOo().f44321OooO0oo;
                sendMomentPollView.getClass();
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
                sendMomentPollView.binding.f44627OooO0Oo.postDelayed(new o0o0Oo(sendMomentPollView, 0), 210L);
            }
        } else {
            int type3 = OooOoO0().getType();
            if (type3 == MomentType.Share.getValue()) {
                if (OooOoO0().getRoomShareModel() != null) {
                    EditTextSpan editTextSpan2 = OooOo().f44319OooO0o0;
                    String strOooO0OO = o0000OO0.OooO0OO(this, p565o0oOo000.o000OOo.Room_ID_XXX);
                    String[] strArr = new String[1];
                    RoomShareModel roomShareModel2 = OooOoO0().getRoomShareModel();
                    strArr[0] = roomShareModel2 != null ? roomShareModel2.getRoomIdx() : null;
                    editTextSpan2.setText(com.code.android.util.o0000O.OooO00o(strOooO0OO, strArr));
                    OooOo().f44319OooO0o0.setSelection(OooOo().f44319OooO0o0.getText().length());
                }
                OooOo().f44318OooO0o.binding.f44619OooO0O0.setVisibility(8);
                OooOo().f44318OooO0o.binding.f44620OooO0OO.setVisibility(8);
                OooOo().f44318OooO0o.binding.f44622OooO0o.setVisibility(8);
            } else if (type3 == MomentType.Forward.getValue()) {
                OooOo().f44318OooO0o.binding.f44619OooO0O0.setVisibility(8);
                OooOo().f44318OooO0o.binding.f44620OooO0OO.setVisibility(8);
                OooOo().f44318OooO0o.binding.f44622OooO0o.setVisibility(8);
            }
        }
        OooOo().f44322OooOO0.setData(this.f25730OooOo);
        if (OooOoOO().isInEdit()) {
            OooOoo0().setToolbarTitleText(o0000OO0.OooO0OO(this, p565o0oOo000.o000OOo.Moment_Edit_Page_Title));
            OooOoo0().setToolbarRightText(o0000OO0.OooO0OO(this, p565o0oOo000.o000OOo.Moment_Edit_Page_Save));
            oO00O0o0 oo00o0o0OooO = p417o0Oo0oO0.o00Oo0.OooO();
            oo00o0o0OooO.getClass();
            oo0oO0 oo0oo1 = oo0oO0.f47967OooO00o;
            if (!oo00o0o0OooO.OooO0O0("isHideMomentEditTipsFirst" + oo0oO0.OooOOo0().getValue(), false)) {
                SendMomentTipsView sendMomentTipsView = OooOo().f44313OooO;
                Intrinsics.checkNotNullExpressionValue(sendMomentTipsView, "sendMomentTipsView");
                com.code.android.util.o000O.OooOOOO(sendMomentTipsView);
                OooOo().f44313OooO.setData(OooOoO0().getEditMaxNum());
                OooOo().f44313OooO.setCloseListener(new oOo0o0oO(this));
            }
            MomentDetailModel editMomentDetailModel2 = OooOoO0().getEditMomentDetailModel();
            if (editMomentDetailModel2 != null) {
                MomentSendContentModel content2 = editMomentDetailModel2.getContent();
                if (content2 != null) {
                    if (content2.hasCircle()) {
                        TopicInfoModel topicInfoModel2 = new TopicInfoModel();
                        topicInfoModel2.setId(content2.getCircleId());
                        String circleName2 = content2.getCircleName();
                        topicInfoModel2.setName(circleName2 != null ? circleName2 : "");
                        this.f25730OooOo = topicInfoModel2;
                    }
                    com.google.gson.internal.OooO00o.OooO0O0(this, content2, OooOo().f44319OooO0o0);
                }
                int type4 = OooOoOO().getType();
                if (!((type4 == MomentType.Event.getValue() || type4 == MomentType.Share.getValue()) || type4 == MomentType.Forward.getValue())) {
                    if (type4 == MomentType.Image.getValue()) {
                        ArrayList<MomentImageModel> imageInfoList = editMomentDetailModel2.getImageInfoList();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<T> it = imageInfoList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new MomentSelectMedia(p184o00o00O0.OooO0OO.OooO0Oo(((MomentImageModel) it.next()).getUrl())));
                        }
                        OooOoO().OooO0OO(arrayList2);
                    } else if (type4 == MomentType.Video.getValue()) {
                        OooOoO().OooO0OO(MomentDetailModelKt.editVideoToLocalModel(editMomentDetailModel2));
                    }
                }
                OooOoOO().setAddress(editMomentDetailModel2.getAddress());
                OooOoOO().setPower(editMomentDetailModel2.getPower());
                p597o0oo00O.OooOOOO.OooO0O0("编辑动态 initEditView\n\t editMomentDetailModel : " + editMomentDetailModel2 + "\n\t sendPostModel : " + OooOoOO());
            }
            SendMomentTopicView sendMomentTopicView = OooOo().f44322OooOO0;
            Intrinsics.checkNotNullExpressionValue(sendMomentTopicView, "sendMomentTopicView");
            com.code.android.util.o000O.OooOOOO(sendMomentTopicView);
            OooOo().f44322OooOO0.setIsInEdit(true);
            OooOo().f44322OooOO0.setData(this.f25730OooOo);
            OooOo().f44320OooO0oO.OooO0o(true, true, this.f25730OooOo, OooOoOO());
            OooOo().f44318OooO0o.binding.f44622OooO0o.setVisibility(8);
            this.f25746Oooo0O0 = OooOo().f44319OooO0o0.getText().toString();
        } else {
            int type5 = OooOoO0().getType();
            if (type5 == MomentType.Share.getValue() || type5 == MomentType.Image.getValue()) {
                SendMomentTopicView sendMomentTopicView2 = OooOo().f44322OooOO0;
                Intrinsics.checkNotNullExpressionValue(sendMomentTopicView2, "sendMomentTopicView");
                com.code.android.util.o000O.OooO0O0(sendMomentTopicView2);
                OooOo().f44319OooO0o0.setHint(o0000OO0.OooO0OO(this, p565o0oOo000.o000OOo.SendPost_NoTopic_Hint));
            } else if (type5 == MomentType.Forward.getValue()) {
                SendMomentTopicView sendMomentTopicView3 = OooOo().f44322OooOO0;
                Intrinsics.checkNotNullExpressionValue(sendMomentTopicView3, "sendMomentTopicView");
                com.code.android.util.o000O.OooOOOO(sendMomentTopicView3);
                OooOo().f44319OooO0o0.setHint(o0000OO0.OooO0OO(this, p565o0oOo000.o000OOo.SendPost_NoTopic_Hint));
                OooOo().f44319OooO0o0.setHint(o0000OO0.OooO0OO(this, p565o0oOo000.o000OOo.SendPost_AddTopic_Hint));
            } else if (type5 == MomentType.Topic.getValue()) {
                OooOo().f44319OooO0o0.setHint(o0000OO0.OooO0OO(this, p565o0oOo000.o000OOo.SendPost_AddTopic_Hint));
            }
            OooOo().f44320OooO0oO.OooO0o(this.f25743Oooo000, false, this.f25730OooOo, OooOoOO());
        }
        ComposeView shareComposeView = OooOo().f44323OooOO0O;
        Intrinsics.checkNotNullExpressionValue(shareComposeView, "shareComposeView");
        p193o00o0O0O.o0000oo.OooO0Oo(shareComposeView, ComposableLambdaKt.composableLambdaInstance(832635511, true, new oO0OO0O(this)));
        OooOo().f44319OooO0o0.postDelayed(new p003OooO0o0.o000000(this, 2), 500L);
        OooOoo0().getPollConfig().observe(this, new p386o0OOoo0O.o0OoOo0(oO0O0Oo0.f49273OooO0Oo, null, null, false, 14));
        p494o0o00OO0.oo000o oo000oVar = new p494o0o00OO0.oo000o(this, OooOo().f44319OooO0o0, OooOo().f44321OooO0oo);
        this.f25737OooOoOO = oo000oVar;
        oo000oVar.f49587OooO0oO = OooOoO0();
        p494o0o00OO0.oo000o oo000oVar2 = this.f25737OooOoOO;
        if (oo000oVar2 != null) {
            oo000oVar2.f49584OooO0Oo = i4;
            oo000oVar2.f49586OooO0o0 = this.f25735OooOoO;
        }
        LiveEventBus.get("MOMENT_EDIT_SEND_SUCCESS", Long.TYPE).observe(this, new o0O000Oo(this, i));
        OooOoo0().statisticalTime();
        String str2 = this.f25738OooOoo;
        if (str2 != null) {
            p494o0o00OO0.OooO oooOOooOoO = OooOoO();
            MomentSelectMedia image = new MomentSelectMedia(str2);
            oooOOooOoO.getClass();
            Intrinsics.checkNotNullParameter(image, "image");
            oooOOooOoO.f49538OooO0OO.OooO0OO(image);
            oooOOooOoO.OooO0Oo();
        }
        p597o0oo00O.OooOOOO.OooO0O0("编辑动态 onCreateEnd\n momentSendShareModel = " + OooOoO0() + "\n isRecoverMoment = " + this.f25743Oooo000 + "\n sendPostModel = " + OooOoOO());
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        OooOoo0().statisticalTime();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, @Nullable KeyEvent keyEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        if (4 != i) {
            if (3 == i) {
                OooOo().f44318OooO0o.OooO0o0();
            }
            return super.onKeyDown(i, keyEvent);
        }
        MutableState<p373o0OOo0oO.o00oO0o> mutableState = OooOo().f44318OooO0o.f30655OooOO0o;
        if (mutableState.getValue() != null) {
            p373o0OOo0oO.o00oO0o value = mutableState.getValue();
            if (value == null) {
                z2 = false;
            } else {
                if (value.f43172OooO0o == 2) {
                    value.OooO0O0();
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            z = z2;
        }
        if (z) {
            return false;
        }
        return OooOooO();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        OooOooo();
    }
}
