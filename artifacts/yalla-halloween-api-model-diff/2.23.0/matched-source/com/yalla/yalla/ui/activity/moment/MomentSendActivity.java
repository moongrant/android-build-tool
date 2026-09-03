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
import androidx.camera.core.impl.o000OOo0;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000O;
import com.code.android.util.o000O0Oo;
import com.code.android.util.o000OO00;
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
import p377o0OOoOo.o0000OO0;
import p409o0Oo0o0o.o00000O;
import p409o0Oo0o0o.o00000O0;
import p417o0OoO0.o0000O0O;
import p485o0o00O0.o0;
import p485o0o00O0.o0O00;
import p485o0o00O0.o0O000;
import p485o0o00O0.o0O0000O;
import p485o0o00O0.o0O000O;
import p485o0o00O0.o0O000Oo;
import p485o0o00O0.o0O000o0;
import p485o0o00O0.o0O00O;
import p485o0o00O0.o0O00O0o;
import p485o0o00O0.o0O00o0;
import p485o0o00O0.o0OoO00O;
import p485o0o00O0.o0OoOoOo;
import p485o0o00O0.o0oOO;
import p485o0o00O0.oo00oO;
import p488o0o00O0o.o000OO;
import p539o0o0OoOO.y0;
import p556o0oOOooo.oO0;
import p556o0oOOooo.oO0O0O00;
import p579o0oOoo.oO00O0o0;
import p579o0oOoo.oO0O0Oo0;
import p579o0oOoo.oO0oO000;
import p584o0oOooO0.oO00OOo0;
import p585o0oOooOO.h;
import p587o0oOooo.o0OO000;
import p595o0oo00Oo.o0000Ooo;
import p641o0ooOOOO.p0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/MomentSendActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMomentSendActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentSendActivity.kt\ncom/yalla/yalla/ui/activity/moment/MomentSendActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1017:1\n22#2,2:1018\n75#3,13:1020\n1855#4,2:1033\n1855#4,2:1035\n1855#4,2:1037\n*S KotlinDebug\n*F\n+ 1 MomentSendActivity.kt\ncom/yalla/yalla/ui/activity/moment/MomentSendActivity\n*L\n84#1:1018,2\n142#1:1020,13\n301#1:1033,2\n629#1:1035,2\n941#1:1037,2\n*E\n"})
public final class MomentSendActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public static final /* synthetic */ int f26175Oooo0OO = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public TopicInfoModel f26177OooOo;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public o000OO f26184OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public String f26185OooOoo;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public long f26188OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f26190Oooo000;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f26176OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(p0.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public String f26179OooOo00 = "";

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f26178OooOo0 = -1;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final Lazy f26180OooOo0O = LazyKt.lazy(new OooOO0());

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final Lazy f26181OooOo0o = LazyKt.lazy(new OooOOOO());

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f26183OooOoO0 = 10;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f26182OooOoO = 3;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final Lazy f26186OooOoo0 = LazyKt.lazy(new OooOOO());

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final long f26187OooOooO = 1000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26191Oooo00O = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MomentSendVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.MomentSendActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f26208OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26208OooO0Oo;
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
    public final Lazy f26192Oooo00o = LazyKt.lazy(new OooO0o());

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    @NotNull
    public final Lazy f26189Oooo0 = LazyKt.lazy(new OooO());

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    @NotNull
    public String f26193Oooo0O0 = "";

    public static final class OooO extends Lambda implements Function0<oO0oO000> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oO0oO000 invoke() {
            return new oO0oO000(MomentSendActivity.this);
        }
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: com.yalla.yalla.ui.activity.moment.MomentSendActivity$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0326OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Context f26195OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ MomentSendShareModel f26196OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0326OooO00o(Context context, MomentSendShareModel momentSendShareModel) {
                super(0);
                this.f26195OooO0Oo = context;
                this.f26196OooO0o0 = momentSendShareModel;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Context context = this.f26195OooO0Oo;
                Intent intent = new Intent(context, (Class<?>) MomentSendActivity.class);
                intent.putExtra("SHARE_POST_MODEL", this.f26196OooO0o0);
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
            C0326OooO00o onLogin = new C0326OooO00o(context, sharePostModel);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(p464o0Oooo.o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
                return;
            }
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                int i = LoginActivity.f25186OooOo0O;
                LoginActivity.OooO00o.OooO00o(activityOooO0O0);
            }
        }
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[WebFrom.values().length];
            try {
                iArr[WebFrom.RoomMainBanner.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WebFrom.MomentActivityBanner.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MomentSendShareType.values().length];
            try {
                iArr2[MomentSendShareType.ShareRoom.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[MomentSendShareType.ShareEvent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MomentSendShareType.ShareWeb.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<MomentSelectMedia, MomentSelectMedia> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f26197OooO0Oo = new OooO0OO();

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

    public static final class OooO0o extends Lambda implements Function0<oO0O0Oo0> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oO0O0Oo0 invoke() {
            return new oO0O0Oo0(MomentSendActivity.this);
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
        public final /* synthetic */ Ref.BooleanRef f26201OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(Ref.BooleanRef booleanRef) {
            super(0);
            this.f26201OooO0o0 = booleanRef;
        }

        /* JADX WARN: Code duplicated, block: B:35:0x0118  */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            final MomentSendModel momentSendModelOooOoOO;
            String jSONString;
            MomentSendContentModel content;
            o0OO000.OooO0O0("106108", MapsKt.mapOf(TuplesKt.to("state", 1)));
            int i = MomentSendActivity.f26175Oooo0OO;
            MomentSendActivity momentSendActivity = MomentSendActivity.this;
            if (momentSendActivity.OooOoOO().isInEdit()) {
                return null;
            }
            if (this.f26201OooO0o0.element) {
                Collection collection = momentSendActivity.OooOoO().f48450OooO0OO.f10111OooOOoo;
                Intrinsics.checkNotNull(collection, "null cannot be cast to non-null type java.util.ArrayList<com.yalla.yalla.model.MomentSelectMedia>{ kotlin.collections.TypeAliasesKt.ArrayList<com.yalla.yalla.model.MomentSelectMedia> }");
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) collection).iterator();
                while (it.hasNext()) {
                    arrayList.add((MomentSelectMedia) it.next());
                }
                o000OO o000oo2 = momentSendActivity.f26184OooOoOO;
                String str = "";
                if (o000oo2 != null) {
                    momentSendModelOooOoOO = momentSendActivity.OooOoOO();
                    Activity activity = o000oo2.f48439OooO00o;
                    EditTextSpan editTextSpan = o000oo2.f48440OooO0O0;
                    MomentSendContentModel momentSendContentModel = new MomentSendContentModel(o0000Ooo.OooO00o(activity, editTextSpan));
                    ArrayList<? extends h> arrayListOooO0O0 = editTextSpan.getSpanManager().OooO0O0("@");
                    for (int i2 = 0; i2 < arrayListOooO0O0.size(); i2++) {
                        h hVar = arrayListOooO0O0.get(i2);
                        if (hVar != null) {
                            momentSendContentModel.getAt().add(new MomentSendContentAtModel(android.support.v4.media.session.OooO0o.OooO0O0(new StringBuilder(), hVar.f56771OooO0o0, ""), hVar.f56769OooO0Oo));
                        }
                    }
                    momentSendModelOooOoOO.setContent(momentSendContentModel);
                    if (momentSendModelOooOoOO.getType() == MomentType.Text.getValue()) {
                        p488o0o00O0o.o0ooOOo.OooO00o(arrayList, new Function1() { // from class: o0o00O0o.o0000O0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                momentSendModelOooOoOO.setType(((MomentType) obj).getValue());
                                return null;
                            }
                        });
                    }
                    p592o0oo00O.OooOOO0.OooO0oO("sendPost\n sendPostModel.Text = " + momentSendContentModel.getContent() + "\n sendPostModel.Text.Length = " + momentSendContentModel.getContent().length() + "\n sendPostModel = " + momentSendModelOooOoOO.toJSONString());
                } else {
                    momentSendModelOooOoOO = null;
                }
                TopicInfoModel topicInfoModel = momentSendActivity.f26177OooOo;
                if (topicInfoModel != null && momentSendModelOooOoOO != null && (content = momentSendModelOooOoOO.getContent()) != null) {
                    content.setCircle(topicInfoModel.getId(), topicInfoModel.getName());
                }
                MomentSendPollModel sendMomentPoll = momentSendActivity.OooOo().f58561OooO0oo.getSendMomentPoll();
                o00000O o00000oOooOO0 = p408o0Oo0o0O.o00Oo0.OooOO0();
                if (momentSendModelOooOoOO != null) {
                    o00000oOooOO0.getClass();
                    jSONString = momentSendModelOooOoOO.toJSONString();
                    if (jSONString == null) {
                        jSONString = "";
                    }
                } else {
                    jSONString = "";
                }
                o00000oOooOO0.OooOO0o(jSONString);
                p515o0o0O0O0.OooO.f51694OooO00o = arrayList;
                o00000O o00000oOooOO1 = p408o0Oo0o0O.o00Oo0.OooOO0();
                o00000oOooOO1.getClass();
                o00000O.OooO00o oooO00o = new o00000O.OooO00o();
                oooO00o.f45211OooO00o = arrayList;
                o00000oOooOO1.OooOO0O(p140o00OOooo.OooOO0.OooO00o(oooO00o));
                o00000O o00000oOooOO2 = p408o0Oo0o0O.o00Oo0.OooOO0();
                if (sendMomentPoll != null) {
                    o00000oOooOO2.getClass();
                    String jSONString2 = sendMomentPoll.toJSONString();
                    if (jSONString2 != null) {
                        str = jSONString2;
                    }
                }
                o00000oOooOO2.OooOOO0(str);
            }
            momentSendActivity.finish();
            return null;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<p488o0o00O0o.o0OO00O> {
        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p488o0o00O0o.o0OO00O invoke() {
            int i = MomentSendActivity.f26175Oooo0OO;
            MomentSendActivity momentSendActivity = MomentSendActivity.this;
            NoScrollRecyclerView noScrollRecyclerView = momentSendActivity.OooOo().f58557OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(noScrollRecyclerView, "binding.imagesRecyclerView");
            p488o0o00O0o.o0OO00O o0oo00o2 = new p488o0o00O0o.o0OO00O(momentSendActivity, noScrollRecyclerView);
            o0oo00o2.f48451OooO0Oo = new o00oO0o(momentSendActivity);
            o0oo00o2.f48453OooO0o0 = new o0ooOOo(momentSendActivity);
            return o0oo00o2;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Object> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f26204OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(Ref.BooleanRef booleanRef) {
            super(0);
            this.f26204OooO0o0 = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            o0OO000.OooO0O0("106108", MapsKt.mapOf(TuplesKt.to("state", 0)));
            int i = MomentSendActivity.f26175Oooo0OO;
            MomentSendActivity momentSendActivity = MomentSendActivity.this;
            if (momentSendActivity.OooOoOO().isInEdit()) {
                momentSendActivity.finish();
                return null;
            }
            if (this.f26204OooO0o0.element) {
                List<MomentSelectMedia> list = p515o0o0O0O0.OooO.f51694OooO00o;
                if (list != null) {
                    list.clear();
                }
                p515o0o0O0O0.OooO.f51694OooO00o = null;
                o00000O o00000oOooOO0 = p408o0Oo0o0O.o00Oo0.OooOO0();
                o00000oOooOO0.OooOO0o("");
                o00000oOooOO0.OooOOO0("");
                o00000oOooOO0.OooOO0O("");
                momentSendActivity.finish();
            }
            return null;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<MomentSendModel> {
        public OooOOOO() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final MomentSendModel invoke() {
            MomentSendModel momentSendModel = new MomentSendModel(null, 1, 0 == true ? 1 : 0);
            o00000O o00000oOooOO0 = p408o0Oo0o0O.o00Oo0.OooOO0();
            o00000oOooOO0.getClass();
            p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
            MomentSendModel momentSendModel2 = (MomentSendModel) p140o00OOooo.OooOO0.OooO0O0(MomentSendModel.class, o00000oOooOO0.OooO0o0("sendModel" + p464o0Oooo.o000000O.OooOOo0().getValue(), ""));
            if (momentSendModel2 == null) {
                return momentSendModel;
            }
            int i = MomentSendActivity.f26175Oooo0OO;
            MomentSendActivity momentSendActivity = MomentSendActivity.this;
            if (momentSendActivity.OooOoO0().getType() != MomentType.Text.getValue()) {
                return momentSendModel;
            }
            momentSendActivity.f26190Oooo000 = true;
            return momentSendModel2;
        }
    }

    public final p0 OooOo() {
        return (p0) this.f26176OooOOoo.getValue();
    }

    public final p488o0o00O0o.o0OO00O OooOoO() {
        return (p488o0o00O0o.o0OO00O) this.f26186OooOoo0.getValue();
    }

    public final MomentSendShareModel OooOoO0() {
        return (MomentSendShareModel) this.f26180OooOo0O.getValue();
    }

    public final MomentSendModel OooOoOO() {
        return (MomentSendModel) this.f26181OooOo0o.getValue();
    }

    public final boolean OooOoo() {
        MomentDetailModel editMomentDetailModel;
        if (OooOoOO().isInEdit() && (editMomentDetailModel = OooOoO0().getEditMomentDetailModel()) != null) {
            p488o0o00O0o.o0OO00O o0oo00oOooOoO = OooOoO();
            o0oo00oOooOoO.getClass();
            ArrayList arrayList = new ArrayList();
            Collection<MomentSelectMedia> collection = o0oo00oOooOoO.f48450OooO0OO.f10111OooOOoo;
            Intrinsics.checkNotNullExpressionValue(collection, "adapter.data");
            for (MomentSelectMedia it : collection) {
                if (o0000O0O.OooO0o(it.getPath())) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    arrayList.add(it);
                }
            }
            if (!p417o0OoO0.oo000o.OooO0O0(arrayList, OooOoOO().getHttpImagesFromEditMomentDetailMedia(), OooO0OO.f26197OooO0Oo) || !Intrinsics.areEqual(editMomentDetailModel.getAddress(), OooOoOO().getAddress()) || !Intrinsics.areEqual(this.f26193Oooo0O0, OooOo().f58559OooO0o0.getText().toString())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MomentSendVM OooOoo0() {
        return (MomentSendVM) this.f26191Oooo00O.getValue();
    }

    public final boolean OooOooO() {
        OooOo().f58558OooO0o.OooO0o0();
        String string = StringsKt.trim((CharSequence) OooOo().f58559OooO0o0.getText().toString()).toString();
        if (!(string.length() > 0) && !OooOoO().OooO0O0()) {
            MomentSendPollModel sendMomentPoll = OooOo().f58561OooO0oo.getSendMomentPoll();
            if (sendMomentPoll != null) {
                Iterator<T> it = sendMomentPoll.getOption().iterator();
                while (it.hasNext()) {
                    string = ((Object) string) + ((MomentSendPollModel.Option) it.next()).getText();
                }
            }
            if (!(!StringsKt.isBlank(string)) && TextUtils.isEmpty(OooOoOO().getSourcesid())) {
                List<MomentSelectMedia> list = p515o0o0O0O0.OooO.f51694OooO00o;
                if (list != null) {
                    list.clear();
                }
                p515o0o0O0O0.OooO.f51694OooO00o = null;
                o00000O o00000oOooOO0 = p408o0Oo0o0O.o00Oo0.OooOO0();
                o00000oOooOO0.OooOO0o("");
                o00000oOooOO0.OooOOO0("");
                o00000oOooOO0.OooOO0O("");
                finish();
                return true;
            }
        }
        String strOooO0OO = p417o0OoO0.o00oO0o.OooO0OO(this, oO00OOo0.send_post_keep_this_edit);
        String strOooO0OO2 = p417o0OoO0.o00oO0o.OooO0OO(this, oO00OOo0.Discard);
        String strOooO0OO3 = p417o0OoO0.o00oO0o.OooO0OO(this, oO00OOo0.Save);
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        if (OooOoOO().isInEdit()) {
            strOooO0OO = p417o0OoO0.o00oO0o.OooO0OO(this, oO00OOo0.Moment_Edit_Page_Changes);
            strOooO0OO2 = p417o0OoO0.o00oO0o.OooO0OO(this, oO00OOo0.Moment_Edit_Page_Discard);
            strOooO0OO3 = p417o0OoO0.o00oO0o.OooO0OO(this, oO00OOo0.Cancel);
            if (!OooOoo()) {
                List<MomentSelectMedia> list2 = p515o0o0O0O0.OooO.f51694OooO00o;
                if (list2 != null) {
                    list2.clear();
                }
                p515o0o0O0O0.OooO.f51694OooO00o = null;
                o00000O o00000oOooOO1 = p408o0Oo0o0O.o00Oo0.OooOO0();
                o00000oOooOO1.OooOO0o("");
                o00000oOooOO1.OooOOO0("");
                o00000oOooOO1.OooOO0O("");
                finish();
                return false;
            }
        } else if (OooOoO0().getType() == MomentType.Share.getValue() || OooOoO0().getType() == MomentType.Forward.getValue()) {
            strOooO0OO = p417o0OoO0.o00oO0o.OooO0OO(this, oO00OOo0.Sure_to_quit_editing);
            strOooO0OO2 = p417o0OoO0.o00oO0o.OooO0OO(this, oO00OOo0.Cancel);
            strOooO0OO3 = p417o0OoO0.o00oO0o.OooO0OO(this, oO00OOo0.OK);
            booleanRef.element = false;
        }
        p157o00OoOO0.o0OO00O o0oo00o2 = new p157o00OoOO0.o0OO00O(this);
        o0oo00o2.OooOo00(strOooO0OO);
        if (o0000O0O.OooO0o(strOooO0OO3)) {
            o0oo00o2.OooOOOo(strOooO0OO3);
            o0oo00o2.OooOo0(new OooOO0O(booleanRef));
        }
        o0oo00o2.OooOo0o(strOooO0OO2);
        o0oo00o2.OooOo0O(new OooOOO0(booleanRef));
        o0oo00o2.OooOO0o();
        return false;
    }

    public final void OooOooo() {
        boolean z = false;
        if (OooOoOO().isInEdit()) {
            OooOoo0().setToolbarIsClickable(OooOoo());
            OooOo().f58558OooO0o.OooO0OO(OooOoO().f48454OooO0oO <= 0 && OooOoO().f48455OooO0oo < 9);
            SendMomentEmojiAtPollView sendMomentEmojiAtPollView = OooOo().f58558OooO0o;
            if (OooOoO().f48454OooO0oO <= 0 && OooOoO().f48455OooO0oo < 9) {
                z = true;
            }
            sendMomentEmojiAtPollView.OooO0Oo(z);
            return;
        }
        if (OooOoO0().getType() == MomentType.Share.getValue() || OooOoO0().getType() == MomentType.Forward.getValue()) {
            OooOoo0().setToolbarIsClickable(true);
            return;
        }
        MomentSendPollModel sendMomentPoll = OooOo().f58561OooO0oo.getSendMomentPoll();
        if (sendMomentPoll == null) {
            MomentSendVM momentSendVMOooOoo0 = OooOoo0();
            Editable text = OooOo().f58559OooO0o0.getText();
            Intrinsics.checkNotNullExpressionValue(text, "binding.mEditContent.text");
            momentSendVMOooOoo0.setToolbarIsClickable((text.length() > 0) || OooOoO().OooO0O0());
            OooOo().f58558OooO0o.OooO0OO(OooOoO().f48454OooO0oO <= 0 && OooOoO().f48455OooO0oo < 9);
            OooOo().f58558OooO0o.OooO0Oo(OooOoO().f48454OooO0oO <= 0 && OooOoO().f48455OooO0oo < 9);
            SendMomentEmojiAtPollView sendMomentEmojiAtPollView2 = OooOo().f58558OooO0o;
            if (OooOoO().f48454OooO0oO <= 0 && OooOoO().f48455OooO0oo <= 0) {
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
        Editable text2 = OooOo().f58559OooO0o0.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "binding.mEditContent.text");
        momentSendVMOooOoo1.setToolbarIsClickable((text2.length() > 0) && i >= 2 && sendMomentPoll.getExpireTime() > 0);
        OooOo().f58558OooO0o.OooO0OO(false);
        OooOo().f58558OooO0o.OooO0Oo(false);
        OooOo().f58558OooO0o.OooO0o(true);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        EditTextSpan view = OooOo().f58559OooO0o0;
        Intrinsics.checkNotNullExpressionValue(view, "binding.mEditContent");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        InputMethodManager inputMethodManagerOooO00o = p367o0OOo0o0.Oooo000.OooO00o(context);
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        int i = 0;
        if (window != null) {
            p370o0OOoO.OooOOO0.OooO0OO(window, 0);
        }
        setContentView(OooOo().f58554OooO00o);
        MomentSendContentModel content = OooOoOO().getContent();
        if (content != null && content.hasCircle()) {
            TopicInfoModel topicInfoModel = new TopicInfoModel();
            topicInfoModel.setId(content.getCircleId());
            String circleName = content.getCircleName();
            if (circleName == null) {
                circleName = "";
            }
            topicInfoModel.setName(circleName);
            this.f26177OooOo = topicInfoModel;
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
        int i2 = 1;
        if (type == momentType.getValue()) {
            p592o0oo00O.OooOOO0.OooO0oO("分享 mRoomShareModel " + OooOoO0().getRoomShareModel());
            int i3 = OooO0O0.$EnumSwitchMapping$1[OooOoO0().getSharePostType().ordinal()];
            if (i3 == 1) {
                RoomShareModel roomShareModel = OooOoO0().getRoomShareModel();
                if (roomShareModel != null) {
                    MomentSendModel momentSendModelOooOoOO = OooOoOO();
                    String roomid = roomShareModel.getRoomid();
                    Intrinsics.checkNotNullExpressionValue(roomid, "it.roomid");
                    momentSendModelOooOoOO.setSourcesid(roomid);
                    OooOoOO().setShareType(roomShareModel.getType());
                    int type2 = roomShareModel.getType();
                    if (type2 == WebFrom.RoomMainBanner.getValue()) {
                        OooOoOO().setShareType(3);
                    } else if (type2 == WebFrom.MomentActivityBanner.getValue()) {
                        OooOoOO().setShareType(4);
                    }
                }
            } else if (i3 != 2) {
                if (i3 == 3) {
                    p592o0oo00O.OooOOO0.OooO0oO("分享Web sharePostModel " + OooOoO0().getWebModel());
                    ShareWebModel webModel = OooOoO0().getWebModel();
                    if (webModel != null) {
                        MomentSendModel momentSendModelOooOoOO2 = OooOoOO();
                        String id = webModel.getId();
                        if (id == null) {
                            id = "";
                        }
                        momentSendModelOooOoOO2.setSourcesid(id);
                        WebFrom webFrom = webModel.getWebFrom();
                        int i4 = webFrom == null ? -1 : OooO0O0.$EnumSwitchMapping$0[webFrom.ordinal()];
                        if (i4 == 1) {
                            OooOoOO().setType(momentType.getValue());
                            OooOoOO().setShareType(3);
                        } else if (i4 == 2) {
                            OooOoOO().setType(momentType.getValue());
                            OooOoOO().setShareType(4);
                        }
                    }
                }
            } else if (OooOoO0().getEventModel() != null) {
                p592o0oo00O.OooOOO0.OooO0oO("分享房主活动 sharePostModel " + OooOoO0().getEventModel());
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
                p592o0oo00O.OooOOO0.OooO0oO("转发 sharePostModel.postDetailModel " + OooOoO0().getForwardMomentDetailModel());
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
                            Intrinsics.checkNotNullExpressionValue(name, "file.name");
                            String strSubstring = name.substring(0, 1);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                            if (Intrinsics.areEqual(".", strSubstring)) {
                                File parentFile = file.getParentFile();
                                String path = parentFile != null ? parentFile.getPath() : null;
                                String str = File.separator;
                                String name2 = file.getName();
                                Intrinsics.checkNotNullExpressionValue(name2, "file.name");
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
            this.f26185OooOoo = imagePath;
            p592o0oo00O.OooOOO0.OooO0oO("本地截图发起的动态 postImageModel " + imagePath);
        } else if (type == MomentType.Topic.getValue()) {
            this.f26177OooOo = OooOoO0().getTopicInfoModel();
            OooOoOO().setType(MomentType.Text.getValue());
            p592o0oo00O.OooOOO0.OooO0oO("圈子发起 mTopicInfoModel " + this.f26177OooOo);
        }
        oO00O0o0.OooO0oO();
        OooOoo0().setToolbarTitleText(p417o0OoO0.o00oO0o.OooO0OO(this, oO00OOo0.Post));
        OooOoo0().setToolbarRightText(p417o0OoO0.o00oO0o.OooO0OO(this, oO00OOo0.Btn_Post));
        OooOoo0().setToolbarIsClickable(false);
        ComposeView composeView = OooOo().f58564OooOO0o;
        Intrinsics.checkNotNullExpressionValue(composeView, "binding.topComposeView");
        p147o00Oo0Oo.o000OOo.OooO0Oo(composeView, ComposableLambdaKt.composableLambdaInstance(995593087, true, new o0O000(this)));
        SendMomentLocationPowerView sendMomentLocationPowerView = OooOo().f58560OooO0oO;
        MomentSendModel sendPostModel = OooOoOO();
        o0O000O o0o000o = new o0O000O(this);
        sendMomentLocationPowerView.getClass();
        Intrinsics.checkNotNullParameter(this, "activity");
        Intrinsics.checkNotNullParameter(sendPostModel, "sendPostModel");
        sendMomentLocationPowerView.f31203OooO0o = this;
        sendMomentLocationPowerView.f31205OooO0oO = sendPostModel;
        sendMomentLocationPowerView.changeLocationListener = o0o000o;
        OooOo().f58561OooO0oo.setCloseListener(new o0OoOoOo(this));
        OooOo().f58561OooO0oo.setChangeListener(new o0O000Oo(this));
        OooOo().f58558OooO0o.setAddImageListener(new o0O000o0(this));
        OooOo().f58558OooO0o.setAddVideoListener(new o0O00(this));
        OooOo().f58558OooO0o.setPollListener(new o0OoO00O(this));
        SendMomentEmojiAtPollView sendMomentEmojiAtPollView = OooOo().f58558OooO0o;
        EditTextSpan editContent = OooOo().f58559OooO0o0;
        Intrinsics.checkNotNullExpressionValue(editContent, "binding.mEditContent");
        ComposeView bottomComposeView = OooOo().f58555OooO0O0;
        Intrinsics.checkNotNullExpressionValue(bottomComposeView, "binding.bottomComposeView");
        sendMomentEmojiAtPollView.getClass();
        Intrinsics.checkNotNullParameter(this, "activity");
        Intrinsics.checkNotNullParameter(editContent, "editContent");
        Intrinsics.checkNotNullParameter(bottomComposeView, "bottomComposeView");
        sendMomentEmojiAtPollView.f31182OooO = this;
        int i5 = this.f26183OooOoO0;
        sendMomentEmojiAtPollView.f31188OooOO0 = i5;
        sendMomentEmojiAtPollView.f31189OooOO0O = editContent;
        p147o00Oo0Oo.o000OOo.OooO0Oo(bottomComposeView, ComposableLambdaKt.composableLambdaInstance(-1966316632, true, new oO0(sendMomentEmojiAtPollView, new y0(true, 287), editContent)));
        ComposeView composeView2 = OooOo().f58556OooO0OO;
        Intrinsics.checkNotNullExpressionValue(composeView2, "binding.composeView");
        p147o00Oo0Oo.o000OOo.OooO0Oo(composeView2, p485o0o00O0.o00Ooo.f47875OooO00o);
        OooOo().f58562OooOO0.setRootListener(new o0O00O0o(this));
        OooOo().f58562OooOO0.setClearTopicListener(new o0O00O(this));
        OooOo().f58559OooO0o0.f30974OooO0oO = new androidx.compose.animation.Oooo000();
        EditTextSpan editTextSpan = OooOo().f58559OooO0o0;
        editTextSpan.getClass();
        if (!TextUtils.isEmpty("@")) {
            editTextSpan.getMaskKeys().put("@", "@");
        }
        OooOo().f58559OooO0o0.f30972OooO0o = new o000OOo0(this);
        OooOo().f58559OooO0o0.addTextChangedListener(new o0(this));
        OooOooo();
        if (this.f26190Oooo000) {
            o00O0OO.OooO0O0.OooO0OO(this, OooOoOO().getContent(), OooOo().f58559OooO0o0);
            o00000O o00000oOooOO0 = p408o0Oo0o0O.o00Oo0.OooOO0();
            o00000oOooOO0.getClass();
            ArrayList arrayList = new ArrayList();
            p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
            o00000O.OooO00o oooO00o = (o00000O.OooO00o) p140o00OOooo.OooOO0.OooO0O0(o00000O.OooO00o.class, o00000oOooOO0.OooO0o0("momentMediaString" + p464o0Oooo.o000000O.OooOOo0().getValue(), ""));
            if (oooO00o != null) {
                arrayList.clear();
                List<MomentSelectMedia> list = oooO00o.f45211OooO00o;
                if (list != null) {
                    arrayList.addAll(list);
                }
            }
            p515o0o0O0O0.OooO.f51694OooO00o = arrayList;
            OooOoO().OooO0OO(arrayList);
            o00000O o00000oOooOO1 = p408o0Oo0o0O.o00Oo0.OooOO0();
            o00000oOooOO1.getClass();
            MomentSendPollModel poll = (MomentSendPollModel) p140o00OOooo.OooOO0.OooO0O0(MomentSendPollModel.class, o00000oOooOO1.OooO0o0("sendPoll" + p464o0Oooo.o000000O.OooOOo0().getValue(), ""));
            if (poll != null) {
                SendMomentPollView sendMomentPollView = OooOo().f58561OooO0oo;
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
                sendMomentPollView.binding.f57718OooO0Oo.postDelayed(new oO0O0O00(sendMomentPollView, i), 210L);
            }
        } else {
            int type3 = OooOoO0().getType();
            if (type3 == MomentType.Share.getValue()) {
                if (OooOoO0().getRoomShareModel() != null) {
                    EditTextSpan editTextSpan2 = OooOo().f58559OooO0o0;
                    String strOooO0OO = p417o0OoO0.o00oO0o.OooO0OO(this, oO00OOo0.Room_ID_XXX);
                    String[] strArr = new String[1];
                    RoomShareModel roomShareModel2 = OooOoO0().getRoomShareModel();
                    strArr[0] = roomShareModel2 != null ? roomShareModel2.getRoomIdx() : null;
                    editTextSpan2.setText(o0000O.OooO00o(strOooO0OO, strArr));
                    OooOo().f58559OooO0o0.setSelection(OooOo().f58559OooO0o0.getText().length());
                }
                OooOo().f58558OooO0o.binding.f57542OooO0O0.setVisibility(8);
                OooOo().f58558OooO0o.binding.f57543OooO0OO.setVisibility(8);
                OooOo().f58558OooO0o.binding.f57545OooO0o.setVisibility(8);
            } else if (type3 == MomentType.Forward.getValue()) {
                OooOo().f58558OooO0o.binding.f57542OooO0O0.setVisibility(8);
                OooOo().f58558OooO0o.binding.f57543OooO0OO.setVisibility(8);
                OooOo().f58558OooO0o.binding.f57545OooO0o.setVisibility(8);
            }
        }
        OooOo().f58562OooOO0.setData(this.f26177OooOo);
        if (OooOoOO().isInEdit()) {
            OooOoo0().setToolbarTitleText(p417o0OoO0.o00oO0o.OooO0OO(this, oO00OOo0.Moment_Edit_Page_Title));
            OooOoo0().setToolbarRightText(p417o0OoO0.o00oO0o.OooO0OO(this, oO00OOo0.Moment_Edit_Page_Save));
            o00000O0 o00000o0OooO = p408o0Oo0o0O.o00Oo0.OooO();
            o00000o0OooO.getClass();
            p464o0Oooo.o000000O o000000o3 = p464o0Oooo.o000000O.f46674OooO00o;
            if (!o00000o0OooO.OooO0O0("isHideMomentEditTipsFirst" + p464o0Oooo.o000000O.OooOOo0().getValue(), false)) {
                SendMomentTipsView sendMomentTipsView = OooOo().f58553OooO;
                Intrinsics.checkNotNullExpressionValue(sendMomentTipsView, "binding.sendMomentTipsView");
                o000OO00.OooOOOO(sendMomentTipsView);
                OooOo().f58553OooO.setData(OooOoO0().getEditMaxNum());
                OooOo().f58553OooO.setCloseListener(new o0O00o0(this));
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
                        this.f26177OooOo = topicInfoModel2;
                    }
                    o00O0OO.OooO0O0.OooO0OO(this, content2, OooOo().f58559OooO0o0);
                }
                int type4 = OooOoOO().getType();
                if ((((type4 == MomentType.Event.getValue() || type4 == MomentType.Share.getValue()) || type4 == MomentType.Forward.getValue()) ? 1 : 0) == 0) {
                    if (type4 == MomentType.Image.getValue()) {
                        ArrayList<MomentImageModel> imageInfoList = editMomentDetailModel2.getImageInfoList();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<T> it = imageInfoList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new MomentSelectMedia(p139o00OOooO.OooO0o.OooO0Oo(((MomentImageModel) it.next()).getUrl())));
                        }
                        OooOoO().OooO0OO(arrayList2);
                    } else if (type4 == MomentType.Video.getValue()) {
                        OooOoO().OooO0OO(MomentDetailModelKt.editVideoToLocalModel(editMomentDetailModel2));
                    }
                }
                OooOoOO().setAddress(editMomentDetailModel2.getAddress());
                OooOoOO().setPower(editMomentDetailModel2.getPower());
                p592o0oo00O.OooOOO0.OooO0O0("编辑动态 initEditView\n\t editMomentDetailModel : " + editMomentDetailModel2 + "\n\t sendPostModel : " + OooOoOO());
            }
            SendMomentTopicView sendMomentTopicView = OooOo().f58562OooOO0;
            Intrinsics.checkNotNullExpressionValue(sendMomentTopicView, "binding.sendMomentTopicView");
            o000OO00.OooOOOO(sendMomentTopicView);
            OooOo().f58562OooOO0.setIsInEdit(true);
            OooOo().f58562OooOO0.setData(this.f26177OooOo);
            OooOo().f58560OooO0oO.OooO0o(true, true, this.f26177OooOo, OooOoOO());
            OooOo().f58558OooO0o.binding.f57545OooO0o.setVisibility(8);
            this.f26193Oooo0O0 = OooOo().f58559OooO0o0.getText().toString();
        } else {
            int type5 = OooOoO0().getType();
            if (type5 == MomentType.Share.getValue() || type5 == MomentType.Image.getValue()) {
                SendMomentTopicView sendMomentTopicView2 = OooOo().f58562OooOO0;
                Intrinsics.checkNotNullExpressionValue(sendMomentTopicView2, "binding.sendMomentTopicView");
                o000OO00.OooO0O0(sendMomentTopicView2);
                OooOo().f58559OooO0o0.setHint(p417o0OoO0.o00oO0o.OooO0OO(this, oO00OOo0.SendPost_NoTopic_Hint));
            } else if (type5 == MomentType.Forward.getValue()) {
                SendMomentTopicView sendMomentTopicView3 = OooOo().f58562OooOO0;
                Intrinsics.checkNotNullExpressionValue(sendMomentTopicView3, "binding.sendMomentTopicView");
                o000OO00.OooOOOO(sendMomentTopicView3);
                OooOo().f58559OooO0o0.setHint(p417o0OoO0.o00oO0o.OooO0OO(this, oO00OOo0.SendPost_NoTopic_Hint));
                OooOo().f58559OooO0o0.setHint(p417o0OoO0.o00oO0o.OooO0OO(this, oO00OOo0.SendPost_AddTopic_Hint));
            } else if (type5 == MomentType.Topic.getValue()) {
                OooOo().f58559OooO0o0.setHint(p417o0OoO0.o00oO0o.OooO0OO(this, oO00OOo0.SendPost_AddTopic_Hint));
            }
            OooOo().f58560OooO0oO.OooO0o(this.f26190Oooo000, false, this.f26177OooOo, OooOoOO());
        }
        ComposeView composeView3 = OooOo().f58563OooOO0O;
        Intrinsics.checkNotNullExpressionValue(composeView3, "binding.shareComposeView");
        p147o00Oo0Oo.o000OOo.OooO0Oo(composeView3, ComposableLambdaKt.composableLambdaInstance(832635511, true, new o0O0000O(this)));
        OooOo().f58559OooO0o0.postDelayed(new com.facebook.appevents.codeless.OooO0O0(this, i2), 500L);
        OooOoo0().getPollConfig().observe(this, new o0000OO0(o0oOO.f48019OooO0Oo, null, null, false, 14));
        o000OO o000oo2 = new o000OO(this, OooOo().f58559OooO0o0, OooOo().f58561OooO0oo);
        this.f26184OooOoOO = o000oo2;
        o000oo2.f48445OooO0oO = OooOoO0();
        o000OO o000oo3 = this.f26184OooOoOO;
        if (o000oo3 != null) {
            o000oo3.f48442OooO0Oo = i5;
            o000oo3.f48444OooO0o0 = this.f26182OooOoO;
        }
        LiveEventBus.get("MOMENT_EDIT_SEND_SUCCESS", Long.TYPE).observe(this, new oo00oO(this));
        OooOoo0().statisticalTime();
        String str2 = this.f26185OooOoo;
        if (str2 != null) {
            p488o0o00O0o.o0OO00O o0oo00oOooOoO = OooOoO();
            MomentSelectMedia image = new MomentSelectMedia(str2);
            o0oo00oOooOoO.getClass();
            Intrinsics.checkNotNullParameter(image, "image");
            o0oo00oOooOoO.f48450OooO0OO.OooO0OO(image);
            o0oo00oOooOoO.OooO0Oo();
        }
        p592o0oo00O.OooOOO0.OooO0O0("编辑动态 onCreateEnd\n momentSendShareModel = " + OooOoO0() + "\n isRecoverMoment = " + this.f26190Oooo000 + "\n sendPostModel = " + OooOoOO());
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
                OooOo().f58558OooO0o.OooO0o0();
            }
            return super.onKeyDown(i, keyEvent);
        }
        MutableState<p367o0OOo0o0.OooOOOO> mutableState = OooOo().f58558OooO0o.f31190OooOO0o;
        if (mutableState.getValue() != null) {
            p367o0OOo0o0.OooOOOO value = mutableState.getValue();
            if (value == null) {
                z2 = false;
            } else {
                if (value.f43973OooO0o == 2) {
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
