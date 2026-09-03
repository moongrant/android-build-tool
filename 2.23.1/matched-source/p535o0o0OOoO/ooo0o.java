package p535o0o0OOoO;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;
import androidx.compose.animation.OooOo00;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.yalla.yalla.model.MoreModel;
import com.yalla.yalla.model.MoreTag;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.vm.moment.MomentCommentsVM;
import com.yalla.yalla.ui.vm.moment.MomentReplyVM;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p069o0000ooO.o00000O0;
import p069o0000ooO.o00000OO;
import p188o00o00oO.o000;
import p205o00o0o0o.o000O0o;
import p383o0OOoOo0.o0OoOo0;
import p425o0OoO0OO.o000O0;
import p425o0OoO0OO.o00O0O0;
import p474o0OoooOO.oo0oO0;
import p565o0oOo000.o000OOo;
import p600o0oo00Oo.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMomentCommentOnLongDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentCommentOnLongDialog.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentCommentOnLongDialog\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,278:1\n76#2:279\n76#2:335\n81#3,11:280\n81#3,11:291\n81#3,11:302\n81#3,11:336\n81#3,11:347\n81#3,11:358\n486#4,4:313\n490#4,2:321\n494#4:327\n486#4,4:369\n490#4,2:377\n494#4:383\n25#5:317\n25#5:328\n25#5:373\n25#5:384\n1097#6,3:318\n1100#6,3:324\n1097#6,6:329\n1097#6,3:374\n1100#6,3:380\n1097#6,6:385\n486#7:323\n486#7:379\n*S KotlinDebug\n*F\n+ 1 MomentCommentOnLongDialog.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentCommentOnLongDialog\n*L\n44#1:279\n157#1:335\n45#1:280,11\n46#1:291,11\n47#1:302,11\n158#1:336,11\n159#1:347,11\n160#1:358,11\n48#1:313,4\n48#1:321,2\n48#1:327\n161#1:369,4\n161#1:377,2\n161#1:383\n48#1:317\n53#1:328\n161#1:373\n167#1:384\n48#1:318,3\n48#1:324,3\n53#1:329,6\n161#1:374,3\n161#1:380,3\n167#1:385,6\n48#1:323\n161#1:379\n*E\n"})
public final class ooo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ooo0o f54135OooO00o = new ooo0o();

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54137OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i) {
            super(2);
            this.f54137OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54137OooO0o0 | 1);
            ooo0o.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54139OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i) {
            super(2);
            this.f54139OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54139OooO0o0 | 1);
            ooo0o.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMomentCommentOnLongDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentCommentOnLongDialog.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentCommentOnLongDialog$ShowDialogCommentMore$1$2$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,278:1\n1#2:279\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function2<Integer, MoreModel, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MomentReplyVM f54140OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54141OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54142OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f54143OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentCommentsVM f54144OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f54145OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f54146OooOO0;

        public /* synthetic */ class OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MoreTag.values().length];
                try {
                    iArr[MoreTag.copy.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MoreTag.hide.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MoreTag.delete.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[MoreTag.report.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[MoreTag.reply.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(FragmentActivity fragmentActivity, MomentCommentDetailModel momentCommentDetailModel, MomentVideoVM momentVideoVM, MomentCommentsVM momentCommentsVM, LifecycleOwner lifecycleOwner, MomentReplyVM momentReplyVM, CoroutineScope coroutineScope) {
            super(2);
            this.f54141OooO0Oo = fragmentActivity;
            this.f54143OooO0o0 = momentCommentDetailModel;
            this.f54142OooO0o = momentVideoVM;
            this.f54144OooO0oO = momentCommentsVM;
            this.f54145OooO0oo = lifecycleOwner;
            this.f54140OooO = momentReplyVM;
            this.f54146OooOO0 = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, MoreModel moreModel) {
            MomentCommentDetailModel momentCommentDetailModel;
            List<MomentCommentDetailModel> list;
            Object next;
            num.intValue();
            MoreModel moreModel2 = moreModel;
            if (moreModel2 != null) {
                int i = OooO00o.$EnumSwitchMapping$0[moreModel2.getTag().ordinal()];
                MomentCommentDetailModel momentCommentDetailModel2 = this.f54143OooO0o0;
                if (i != 1) {
                    MomentVideoVM momentVideoVM = this.f54142OooO0o;
                    MomentCommentsVM momentCommentsVM = this.f54144OooO0oO;
                    MomentReplyVM momentReplyVM = this.f54140OooO;
                    if (i == 2) {
                        MomentDetailModel currentMomentDetail = momentVideoVM.getCurrentMomentDetail();
                        if (currentMomentDetail != null) {
                            momentVideoVM.hideComment(currentMomentDetail.getId(), momentCommentDetailModel2.getId());
                            o000<MomentCommentDetailModel> commentsPagerState = momentCommentsVM.getCommentsPagerState();
                            if (commentsPagerState == null || (list = commentsPagerState.f38492OooO0Oo) == null) {
                                momentCommentDetailModel = null;
                            } else {
                                Iterator<T> it = list.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (!(((MomentCommentDetailModel) next).getId() == momentCommentDetailModel2.getId()));
                                momentCommentDetailModel = (MomentCommentDetailModel) next;
                            }
                            if (momentCommentDetailModel != null) {
                                momentCommentDetailModel.setHide(true);
                            }
                            if (momentVideoVM.getCurrentComment() != null) {
                                momentReplyVM.closeCommentReply();
                                momentVideoVM.closeCommentReply();
                            }
                        }
                    } else if (i == 3) {
                        MomentDetailModel currentMomentDetail2 = momentVideoVM.getCurrentMomentDetail();
                        o0OoOo0.OooO00o(momentVideoVM.deleteCommentOrReply(com.code.android.util.o0OoOo0.OooOOO0("", currentMomentDetail2 != null ? Long.valueOf(currentMomentDetail2.getId()) : null), com.code.android.util.o0OoOo0.OooOOO0("", Long.valueOf(momentCommentDetailModel2.getId()))), this.f54145OooO0oo, new oO0OO0O(momentVideoVM, momentCommentsVM, momentCommentDetailModel2, momentReplyVM));
                    } else if (i == 4) {
                        MomentDetailModel currentMomentDetail3 = momentVideoVM.getCurrentMomentDetail();
                        momentVideoVM.reportCommentOrReply(com.code.android.util.o0OoOo0.OooOO0(currentMomentDetail3 != null ? Long.valueOf(currentMomentDetail3.getId()) : null), momentCommentDetailModel2.getId());
                    } else if (i == 5) {
                        oO0o0000 onLogin = new oO0o0000(momentVideoVM, momentCommentDetailModel2, this.f54146OooOO0);
                        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                        if (Intrinsics.areEqual(oo0oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                            onLogin.invoke();
                        } else {
                            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                            if (activityOooO0O0 != null) {
                                int i2 = LoginActivity.f24734OooOo0O;
                                LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                            }
                        }
                    }
                } else {
                    FragmentActivity fragmentActivity = this.f54141OooO0Oo;
                    TextView textView = new TextView(fragmentActivity);
                    o0000oo.OooO0OO(fragmentActivity, momentCommentDetailModel2.getContent(), textView, new o00000O0());
                    o00O0O0.OooO0o0(textView, fragmentActivity, o0000.OooO0OO(o000OOo.Copied));
                }
            }
            return null;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54147OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o000O0o f54148OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MomentVideoVM momentVideoVM, o000O0o o000o0o2) {
            super(0);
            this.f54147OooO0Oo = momentVideoVM;
            this.f54148OooO0o0 = o000o0o2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            this.f54147OooO0Oo.setShowDialogCommentMore(null);
            return this.f54148OooO0o0;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54149OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(MomentVideoVM momentVideoVM) {
            super(0);
            this.f54149OooO0Oo = momentVideoVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f54149OooO0Oo.setShowDialogCommentMore(null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54151OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(int i) {
            super(2);
            this.f54151OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54151OooO0o0 | 1);
            ooo0o.this.OooO0O0(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Integer, MoreModel, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MomentCommentsVM f54152OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54153OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54154OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentReplyModel f54155OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f54156OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MomentReplyVM f54157OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f54158OooOO0;

        public /* synthetic */ class OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MoreTag.values().length];
                try {
                    iArr[MoreTag.copy.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MoreTag.delete.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MoreTag.hide.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[MoreTag.report.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[MoreTag.reply.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(FragmentActivity fragmentActivity, MomentReplyModel momentReplyModel, MomentVideoVM momentVideoVM, LifecycleOwner lifecycleOwner, MomentReplyVM momentReplyVM, MomentCommentsVM momentCommentsVM, CoroutineScope coroutineScope) {
            super(2);
            this.f54153OooO0Oo = fragmentActivity;
            this.f54155OooO0o0 = momentReplyModel;
            this.f54154OooO0o = momentVideoVM;
            this.f54156OooO0oO = lifecycleOwner;
            this.f54157OooO0oo = momentReplyVM;
            this.f54152OooO = momentCommentsVM;
            this.f54158OooOO0 = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, MoreModel moreModel) {
            num.intValue();
            MoreModel moreModel2 = moreModel;
            if (moreModel2 != null) {
                int i = OooO00o.$EnumSwitchMapping$0[moreModel2.getTag().ordinal()];
                MomentReplyModel momentReplyModel = this.f54155OooO0o0;
                if (i != 1) {
                    MomentVideoVM momentVideoVM = this.f54154OooO0o;
                    if (i == 2) {
                        MomentDetailModel currentMomentDetail = momentVideoVM.getCurrentMomentDetail();
                        o0OoOo0.OooO00o(momentVideoVM.deleteCommentOrReply(com.code.android.util.o0OoOo0.OooOOO0("", currentMomentDetail != null ? Long.valueOf(currentMomentDetail.getId()) : null), com.code.android.util.o0OoOo0.OooOOO0("", Long.valueOf(momentReplyModel.getId()))), this.f54156OooO0oO, new oOo00o00(this.f54157OooO0oo, momentReplyModel, this.f54152OooO, momentVideoVM));
                    } else if (i == 3) {
                        MomentDetailModel currentMomentDetail2 = momentVideoVM.getCurrentMomentDetail();
                        long id = currentMomentDetail2 != null ? currentMomentDetail2.getId() : 0L;
                        MomentCommentDetailModel currentComment = momentVideoVM.getCurrentComment();
                        momentVideoVM.hideReply(id, currentComment != null ? currentComment.getId() : 0L, momentReplyModel.getId());
                        momentReplyModel.setHide(true);
                    } else if (i == 4) {
                        MomentDetailModel currentMomentDetail3 = momentVideoVM.getCurrentMomentDetail();
                        momentVideoVM.reportCommentOrReply(com.code.android.util.o0OoOo0.OooOO0(currentMomentDetail3 != null ? Long.valueOf(currentMomentDetail3.getId()) : null), momentReplyModel.getId());
                    } else if (i == 5) {
                        oOO00000 onLogin = new oOO00000(momentVideoVM, momentReplyModel, this.f54158OooOO0);
                        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                        if (Intrinsics.areEqual(oo0oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                            onLogin.invoke();
                        } else {
                            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                            if (activityOooO0O0 != null) {
                                int i2 = LoginActivity.f24734OooOo0O;
                                LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                            }
                        }
                    }
                } else {
                    FragmentActivity fragmentActivity = this.f54153OooO0Oo;
                    TextView textView = new TextView(fragmentActivity);
                    o0000oo.OooO0OO(fragmentActivity, momentReplyModel.getContent(), textView, new o00000OO());
                    o00O0O0.OooO0o0(textView, fragmentActivity, o0000.OooO0OO(o000OOo.Copied));
                }
            }
            return null;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54159OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(MomentVideoVM momentVideoVM) {
            super(0);
            this.f54159OooO0Oo = momentVideoVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f54159OooO0Oo.setShowDialogReplySonMore(null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54160OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o000O0o f54161OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(MomentVideoVM momentVideoVM, o000O0o o000o0o2) {
            super(0);
            this.f54160OooO0Oo = momentVideoVM;
            this.f54161OooO0o0 = o000o0o2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            this.f54160OooO0Oo.setShowDialogReplySonMore(null);
            return this.f54161OooO0o0;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54163OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(int i) {
            super(2);
            this.f54163OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54163OooO0o0 | 1);
            ooo0o.this.OooO0O0(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Composable
    public final void OooO00o(@Nullable Composer composer, int i) {
        Object obj;
        Composer composerStartRestartGroup = composer.startRestartGroup(1958449432);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1958449432, i, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentOnLongDialog.ShowDialogCommentMore (MomentCommentOnLongDialog.kt:42)");
            }
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(MomentVideoVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            MomentVideoVM momentVideoVM = (MomentVideoVM) viewModel;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel2 = ViewModelKt.viewModel(MomentCommentsVM.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            MomentCommentsVM momentCommentsVM = (MomentCommentsVM) viewModel2;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current3 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current3 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel3 = ViewModelKt.viewModel(MomentReplyVM.class, current3, null, null, current3 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current3).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            MomentReplyVM momentReplyVM = (MomentReplyVM) viewModel3;
            Object objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
            Composer.Companion companion = Composer.INSTANCE;
            if (objOooO00o == companion.getEmpty()) {
                objOooO00o = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            MomentCommentDetailModel showDialogCommentMore = momentVideoVM.getShowDialogCommentMore();
            if (showDialogCommentMore != null) {
                if (showDialogCommentMore.getId() < 1) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(i));
                    return;
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == companion.getEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    MoreTag moreTag = MoreTag.reply;
                    arrayList.add(new MoreModel(o0000.OooO0OO(moreTag.getText()), moreTag));
                    MoreTag moreTag2 = MoreTag.copy;
                    arrayList.add(new MoreModel(o0000.OooO0OO(moreTag2.getText()), moreTag2));
                    if (showDialogCommentMore.getIsDel()) {
                        obj = objRememberedValue;
                        MoreTag moreTag3 = MoreTag.delete;
                        arrayList.add(new MoreModel(o0000.OooO0OO(moreTag3.getText()), moreTag3));
                    } else {
                        obj = objRememberedValue;
                        MoreTag moreTag4 = MoreTag.hide;
                        arrayList.add(new MoreModel(o0000.OooO0OO(moreTag4.getText()), moreTag4));
                        MoreTag moreTag5 = MoreTag.report;
                        arrayList.add(new MoreModel(o0000.OooO0OO(moreTag5.getText()), moreTag5));
                    }
                    composerStartRestartGroup.updateRememberedValue(arrayList);
                    obj = arrayList;
                }
                obj = objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                List list = (List) obj;
                Context context = o000O00O.f13430OooO00o;
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                FragmentActivity fragmentActivity = activityOooO0O0 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O0 : null;
                if (fragmentActivity != null) {
                    o000O0o o000o0o2 = new o000O0o(fragmentActivity, null);
                    o000o0o2.OooOOO(list);
                    o000o0o2.OooOOo0(new OooO0O0(fragmentActivity, showDialogCommentMore, momentVideoVM, momentCommentsVM, lifecycleOwner, momentReplyVM, coroutineScope));
                    o000o0o2.OooO(new OooO0OO(momentVideoVM, o000o0o2));
                    o000O0.OooO00o(o000o0o2, new OooO0o(momentVideoVM));
                    o000o0o2.OooOO0o();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooO(i));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Composable
    public final void OooO0O0(@Nullable Composer composer, int i) {
        Object obj;
        Composer composerStartRestartGroup = composer.startRestartGroup(277823497);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(277823497, i, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentOnLongDialog.ShowDialogReplySonMore (MomentCommentOnLongDialog.kt:155)");
            }
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(MomentVideoVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            MomentVideoVM momentVideoVM = (MomentVideoVM) viewModel;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel2 = ViewModelKt.viewModel(MomentCommentsVM.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            MomentCommentsVM momentCommentsVM = (MomentCommentsVM) viewModel2;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current3 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current3 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel3 = ViewModelKt.viewModel(MomentReplyVM.class, current3, null, null, current3 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current3).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            MomentReplyVM momentReplyVM = (MomentReplyVM) viewModel3;
            Object objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
            Composer.Companion companion = Composer.INSTANCE;
            if (objOooO00o == companion.getEmpty()) {
                objOooO00o = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            MomentReplyModel showDialogReplySonMore = momentVideoVM.getShowDialogReplySonMore();
            if (showDialogReplySonMore != null) {
                if (showDialogReplySonMore.getId() < 1) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(i));
                    return;
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == companion.getEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    MoreTag moreTag = MoreTag.reply;
                    arrayList.add(new MoreModel(o0000.OooO0OO(moreTag.getText()), moreTag));
                    MoreTag moreTag2 = MoreTag.copy;
                    arrayList.add(new MoreModel(o0000.OooO0OO(moreTag2.getText()), moreTag2));
                    if (showDialogReplySonMore.getIsDel()) {
                        obj = objRememberedValue;
                        MoreTag moreTag3 = MoreTag.delete;
                        arrayList.add(new MoreModel(o0000.OooO0OO(moreTag3.getText()), moreTag3));
                    } else {
                        obj = objRememberedValue;
                        MoreTag moreTag4 = MoreTag.hide;
                        arrayList.add(new MoreModel(o0000.OooO0OO(moreTag4.getText()), moreTag4));
                        MoreTag moreTag5 = MoreTag.report;
                        arrayList.add(new MoreModel(o0000.OooO0OO(moreTag5.getText()), moreTag5));
                    }
                    composerStartRestartGroup.updateRememberedValue(arrayList);
                    obj = arrayList;
                }
                obj = objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                List list = (List) obj;
                Context context = o000O00O.f13430OooO00o;
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                FragmentActivity fragmentActivity = activityOooO0O0 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O0 : null;
                if (fragmentActivity != null) {
                    o000O0o o000o0o2 = new o000O0o(fragmentActivity, null);
                    o000o0o2.OooOOO(list);
                    o000o0o2.OooOOo0(new OooOO0O(fragmentActivity, showDialogReplySonMore, momentVideoVM, lifecycleOwner, momentReplyVM, momentCommentsVM, coroutineScope));
                    o000o0o2.OooO(new OooOOO0(momentVideoVM, o000o0o2));
                    o000O0.OooO00o(o000o0o2, new OooOOO(momentVideoVM));
                    o000o0o2.OooOO0o();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooOOOO(i));
    }
}
