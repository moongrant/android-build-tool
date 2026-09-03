package com.yalla.yalla.ui.view.moment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000OO00;
import com.code.android.util.o000Oo0;
import com.code.android.util.o0OoOo0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yalla.yalla.model.MomentLogActionType;
import com.yalla.yalla.model.MomentLogActionTypeCommentReply;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.model.moment.MomentSendCommentModel;
import com.yalla.yalla.model.moment.MomentSendContentAtModel;
import com.yalla.yalla.model.moment.MomentSendContentModel;
import com.yalla.yalla.repository.WebEventRepository;
import com.yalla.yalla.ui.view.editTextSpan.EditTextSpan;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p018OooOoo0.OooOOO;
import p029Oooo0oo.oo0ooO;
import p147o00Oo0Oo.o000OOo;
import p406o0Oo0Ooo.oOO0O0O;
import p464o0Oooo.o0O0OOOo;
import p485o0o00O0.o00OOOOo;
import p485o0o00O0.o0O0O0Oo;
import p579o0oOoo.oO00O0o0;
import p584o0oOooO0.oO00OOo0;
import p585o0oOooOO.h;
import p585o0oOooOO.k;
import p595o0oo00Oo.o0000Ooo;
import p641o0ooOOOO.y6;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001e\u0010\f\u001a\u00020\u00042\u0016\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tJ\u0010\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\nR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/yalla/yalla/ui/view/moment/MomentsMessagesEditView;", "Landroid/widget/FrameLayout;", "Lcom/yalla/yalla/model/moment/MomentReplyModel;", "data", "", "setReplyPostDetailComment", "", "clickable", "setClickableOnSend", "Lkotlin/Function1;", "Lcom/yalla/yalla/model/moment/MomentSendCommentModel;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "sendPostCommentModel", "setSendPostCommentModel", "Lcom/yalla/yalla/ui/view/pullrefresh/XRefreshLayout;", "OooO0o0", "Lcom/yalla/yalla/ui/view/pullrefresh/XRefreshLayout;", "getXRefreshLayout", "()Lcom/yalla/yalla/ui/view/pullrefresh/XRefreshLayout;", "setXRefreshLayout", "(Lcom/yalla/yalla/ui/view/pullrefresh/XRefreshLayout;)V", "xRefreshLayout", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"ClickableViewAccessibility"})
public final class MomentsMessagesEditView extends FrameLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Function1<? super MomentSendCommentModel, Unit> f31153OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public MomentSendCommentModel f31154OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public XRefreshLayout xRefreshLayout;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o00OOOOo f31156OooO0oO;

    @SourceDebugExtension({"SMAP\nMomentsMessagesEditView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentsMessagesEditView.kt\ncom/yalla/yalla/ui/view/moment/MomentsMessagesEditView$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,179:1\n65#2,7:180\n72#2:215\n76#2:220\n78#3,11:187\n91#3:219\n456#4,8:198\n464#4,3:212\n467#4,3:216\n4144#5,6:206\n*S KotlinDebug\n*F\n+ 1 MomentsMessagesEditView.kt\ncom/yalla/yalla/ui/view/moment/MomentsMessagesEditView$1\n*L\n71#1:180,7\n71#1:215\n71#1:220\n71#1:187,11\n71#1:219\n71#1:198,8\n71#1:212,3\n71#1:216,3\n71#1:206,6\n*E\n"})
    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {
        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1901980334, iIntValue, -1, "com.yalla.yalla.ui.view.moment.MomentsMessagesEditView.<anonymous> (MomentsMessagesEditView.kt:69)");
                }
                composer2.startReplaceableGroup(733328855);
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                o0O0O0Oo.OooO0o0(BoxScopeInstance.INSTANCE, MomentsMessagesEditView.this.f31156OooO0oO, null, composer2, 454);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<o00OOOOo, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o00OOOOo o00ooooo2) {
            o00OOOOo it = o00ooooo2;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentsMessagesEditView.OooO00o(MomentsMessagesEditView.this);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function3<o00OOOOo, Boolean, Integer, Unit> {
        public OooO0OO() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o00OOOOo o00ooooo2, Boolean bool, Integer num) {
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(o00ooooo2, "<anonymous parameter 0>");
            MomentsMessagesEditView momentsMessagesEditView = MomentsMessagesEditView.this;
            if (zBooleanValue) {
                XRefreshLayout xRefreshLayout = momentsMessagesEditView.getXRefreshLayout();
                if (xRefreshLayout != null) {
                    xRefreshLayout.OooO();
                }
            } else {
                o000OO00.OooO0O0(momentsMessagesEditView);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentsMessagesEditView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void OooO00o(MomentsMessagesEditView momentsMessagesEditView) {
        String jSONString;
        o00OOOOo o00ooooo2 = momentsMessagesEditView.f31156OooO0oO;
        boolean z = true;
        if (StringsKt.isBlank(o00ooooo2.OooO00o().getText().toString())) {
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.please_input_dynamic);
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (z) {
                return;
            }
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
                return;
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                return;
            }
        }
        EditTextSpan editTextSpanOooO00o = o00ooooo2.OooO00o();
        HashMap map = oO00O0o0.f56540OooO0Oo;
        if ((editTextSpanOooO00o != null ? editTextSpanOooO00o.getText().length() : 0) > 500) {
            String strOooO00o = o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.char_room_text_lenght), "500");
            if (StringsKt.isBlank(strOooO00o)) {
                return;
            }
            o000Oo0 o000oo0OooO00o2 = o000O00.OooO00o(strOooO00o, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o2.run();
                return;
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
                return;
            }
        }
        if (oO00O0o0.OooO0Oo(o00ooooo2.OooO00o()) > 50) {
            String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.char_room_edit1);
            if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                z = false;
            }
            if (z) {
                return;
            }
            o000Oo0 o000oo0OooO00o3 = o000O00.OooO00o(strOooO0OO2, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o3.run();
                return;
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o3);
                return;
            }
        }
        String strOooO00o2 = o0000Ooo.OooO00o((Activity) momentsMessagesEditView.getContext(), o00ooooo2.OooO00o());
        Intrinsics.checkNotNullExpressionValue(strOooO00o2, "getAtUserToAtNum(context…ottomState.editTextInput)");
        MomentSendContentModel momentSendContentModel = new MomentSendContentModel(strOooO00o2);
        ArrayList<? extends h> arrayListOooO0O0 = o00ooooo2.OooO00o().getSpanManager().OooO0O0("@");
        Intrinsics.checkNotNull(arrayListOooO0O0, "null cannot be cast to non-null type java.util.ArrayList<com.yalla.yalla.ui.view.editTextSpan.EditTextSpanItem>{ kotlin.collections.TypeAliasesKt.ArrayList<com.yalla.yalla.ui.view.editTextSpan.EditTextSpanItem> }");
        int size = arrayListOooO0O0.size();
        for (int i = 0; i < size; i++) {
            h hVar = arrayListOooO0O0.get(i);
            Intrinsics.checkNotNullExpressionValue(hVar, "mListFriendListModel[i]");
            h hVar2 = hVar;
            List<MomentSendContentAtModel> at = momentSendContentModel.getAt();
            String strOooO00o3 = oo0ooO.OooO00o(hVar2.f56771OooO0o0);
            String str = hVar2.f56769OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(str, "friendListModel.text");
            at.add(new MomentSendContentAtModel(strOooO00o3, str));
        }
        MomentSendCommentModel momentSendCommentModel = momentsMessagesEditView.f31154OooO0o;
        if (momentSendCommentModel != null) {
            momentSendCommentModel.setContent(momentSendContentModel);
            momentsMessagesEditView.setClickableOnSend(false);
            String parentUserId = momentSendCommentModel.getParentUserId();
            if (parentUserId != null && parentUserId.length() != 0) {
                z = false;
            }
            if (!z) {
                MomentLogActionTypeCommentReply momentLogActionTypeCommentReply = new MomentLogActionTypeCommentReply(null, null, null, null, 15, null);
                String parentUserId2 = momentSendCommentModel.getParentUserId();
                String str2 = "";
                if (parentUserId2 == null) {
                    parentUserId2 = "";
                }
                momentLogActionTypeCommentReply.setObject_userid(parentUserId2);
                momentLogActionTypeCommentReply.setDiscoveryid(momentSendCommentModel.getDyid());
                String cid = momentSendCommentModel.getCid();
                if (cid == null) {
                    cid = "";
                }
                momentLogActionTypeCommentReply.setCommentid(cid);
                MomentSendContentModel content = momentSendCommentModel.getContent();
                if (content != null && (jSONString = content.toJSONString()) != null) {
                    str2 = jSONString;
                }
                momentLogActionTypeCommentReply.setReply_content(str2);
                WebEventRepository webEventRepository = WebEventRepository.f24891OooO00o;
                MomentLogActionType actionType = MomentLogActionType.comment_reply;
                String actionInfo = momentLogActionTypeCommentReply.toJson();
                webEventRepository.getClass();
                Intrinsics.checkNotNullParameter(actionType, "actionType");
                Intrinsics.checkNotNullParameter(actionInfo, "actionInfo");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0O0OOOo(actionType, actionInfo, null, null), 3, null);
            }
        }
        Function1<? super MomentSendCommentModel, Unit> function1 = momentsMessagesEditView.f31153OooO0Oo;
        if (function1 != null) {
            function1.invoke(momentsMessagesEditView.f31154OooO0o);
        }
    }

    private final void setClickableOnSend(boolean clickable) {
        this.f31156OooO0oO.f47868OooO0oo.setValue(Boolean.valueOf(clickable));
    }

    private final void setReplyPostDetailComment(MomentReplyModel data) {
        if (data != null) {
            MomentSendCommentModel momentSendCommentModel = this.f31154OooO0o;
            if (momentSendCommentModel != null) {
                momentSendCommentModel.cleanComment();
            }
            MomentSendCommentModel momentSendCommentModel2 = this.f31154OooO0o;
            if (momentSendCommentModel2 != null) {
                String strOooO00o = oo0ooO.OooO00o(data.getId());
                String strOooO00o2 = oo0ooO.OooO00o(data.getUserid());
                String nickname = data.getNickname();
                if (nickname == null) {
                    nickname = "";
                }
                momentSendCommentModel2.setReply(strOooO00o, strOooO00o2, nickname);
            }
            String parentUserId = data.getParentUserId();
            long jOooO = parentUserId != null ? o0OoOo0.OooO(0L, parentUserId) : 0L;
            String parentUserName = data.getParentUserName();
            this.f31156OooO0oO.f47866OooO0o0.setValue(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Reply_xxx), oOO0O0O.OooO0O0(jOooO, parentUserName != null ? parentUserName : "")));
        }
    }

    public final void OooO0O0() {
        setClickableOnSend(true);
    }

    public final void OooO0OO() {
        boolean z = true;
        setClickableOnSend(true);
        MomentSendCommentModel momentSendCommentModel = this.f31154OooO0o;
        if (momentSendCommentModel != null) {
            momentSendCommentModel.setContent(null);
        }
        o00OOOOo o00ooooo2 = this.f31156OooO0oO;
        o00ooooo2.OooO00o().setText("");
        EditTextSpan editTextSpanOooO00o = o00ooooo2.OooO00o();
        k spanManager = editTextSpanOooO00o.getSpanManager();
        spanManager.OooO00o();
        spanManager.f56774OooO00o.clear();
        editTextSpanOooO00o.setText("");
        editTextSpanOooO00o.getMaskKeys().clear();
        o00ooooo2.OooO0O0(false);
        setReplyPostDetailComment(null);
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.send_successfully);
        if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
            z = false;
        }
        if (z) {
            return;
        }
        o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o000oo0OooO00o.run();
        } else {
            o000O0.f10355OooO0O0.post(o000oo0OooO00o);
        }
    }

    @Nullable
    public final XRefreshLayout getXRefreshLayout() {
        return this.xRefreshLayout;
    }

    public final void setListener(@Nullable Function1<? super MomentSendCommentModel, Unit> listener) {
        this.f31153OooO0Oo = listener;
    }

    public final void setSendPostCommentModel(@Nullable MomentSendCommentModel sendPostCommentModel) {
        this.f31154OooO0o = sendPostCommentModel;
        if (sendPostCommentModel != null) {
            o00OOOOo o00ooooo2 = this.f31156OooO0oO;
            o00ooooo2.OooO0O0(true);
            String parentUserId = sendPostCommentModel.getParentUserId();
            long jOooO = parentUserId != null ? o0OoOo0.OooO(0L, parentUserId) : 0L;
            String parentUserName = sendPostCommentModel.getParentUserName();
            if (parentUserName == null) {
                parentUserName = "";
            }
            o00ooooo2.f47866OooO0o0.setValue(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Reply_xxx), oOO0O0O.OooO0O0(jOooO, parentUserName)));
            o00ooooo2.OooO00o().setText("");
        }
    }

    public final void setXRefreshLayout(@Nullable XRefreshLayout xRefreshLayout) {
        this.xRefreshLayout = xRefreshLayout;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentsMessagesEditView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MomentsMessagesEditView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentsMessagesEditView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        y6 y6VarInflate = y6.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(y6VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        View view = y6VarInflate.f59396OooO0OO;
        Intrinsics.checkNotNullExpressionValue(view, "binding.viewShade");
        this.f31156OooO0oO = new o00OOOOo((AppCompatActivity) context, view, new OooO0O0(), new OooO0OO());
        ComposeView composeView = y6VarInflate.f59395OooO0O0;
        Intrinsics.checkNotNullExpressionValue(composeView, "binding.composeView");
        o000OOo.OooO0Oo(composeView, ComposableLambdaKt.composableLambdaInstance(1901980334, true, new OooO00o()));
    }
}
