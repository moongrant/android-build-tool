package com.yalla.yalla.ui.activity.message;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.support.emojifaceutil.EmojiEditText;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p539o0o0OoOO.y0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nPrivateChatBottomComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateChatBottomComp.kt\ncom/yalla/yalla/ui/activity/message/ChatBottomState\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,424:1\n107#2:425\n79#2,22:426\n*S KotlinDebug\n*F\n+ 1 PrivateChatBottomComp.kt\ncom/yalla/yalla/ui/activity/message/ChatBottomState\n*L\n399#1:425\n399#1:426,22\n*E\n"})
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final MutableState<p367o0OOo0o0.OooOOOO> f25678OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f25679OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final p430o0OoOOO0.o000O0o f25680OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final p430o0OoOOO0.o00O00OO f25681OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f25682OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f25683OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f25684OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f25685OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f25686OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f25687OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final p490o0o00OOO.OooOo f25688OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final y0 f25689OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public PrivateChatVM f25690OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public p430o0OoOOO0.o00O00OO f25691OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public View f25692OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final Lazy f25693OooOOOo;

    public Oooo000() {
        throw null;
    }

    public Oooo000(Context context, p430o0OoOOO0.o000O0o o000o0o2, p430o0OoOOO0.o00O00OO o00o00oo2) {
        Boolean bool = Boolean.FALSE;
        MutableState<Boolean> isNotFriendShow = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        MutableState<Boolean> isKeyBoardShow = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        MutableState<Boolean> isFacePanelShow = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        MutableState<Boolean> isVoiceOpen = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        MutableState<Boolean> isVoiceShow = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        MutableState<p367o0OOo0o0.OooOOOO> keyBoardPanelHelper = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        MutableState<Boolean> isMessageNullOrBlank = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        p490o0o00OOO.OooOo panelLayoutState = new p490o0o00OOO.OooOo(context);
        y0 facePanelState = new y0(false, 511);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(isNotFriendShow, "isNotFriendShow");
        Intrinsics.checkNotNullParameter(isKeyBoardShow, "isKeyBoardShow");
        Intrinsics.checkNotNullParameter(isFacePanelShow, "isFacePanelShow");
        Intrinsics.checkNotNullParameter(isVoiceOpen, "isVoiceOpen");
        Intrinsics.checkNotNullParameter(isVoiceShow, "isVoiceShow");
        Intrinsics.checkNotNullParameter(keyBoardPanelHelper, "keyBoardPanelHelper");
        Intrinsics.checkNotNullParameter(isMessageNullOrBlank, "isMessageNullOrBlank");
        Intrinsics.checkNotNullParameter(panelLayoutState, "panelLayoutState");
        Intrinsics.checkNotNullParameter(facePanelState, "facePanelState");
        this.f25679OooO00o = context;
        this.f25680OooO0O0 = o000o0o2;
        this.f25681OooO0OO = o00o00oo2;
        this.f25682OooO0Oo = isNotFriendShow;
        this.f25684OooO0o0 = isKeyBoardShow;
        this.f25683OooO0o = isFacePanelShow;
        this.f25685OooO0oO = isVoiceOpen;
        this.f25686OooO0oo = isVoiceShow;
        this.f25678OooO = keyBoardPanelHelper;
        this.f25687OooOO0 = isMessageNullOrBlank;
        this.f25688OooOO0O = panelLayoutState;
        this.f25689OooOO0o = facePanelState;
        this.f25693OooOOOo = LazyKt.lazy(new OooOo(this));
    }

    @NotNull
    public final EmojiEditText OooO00o() {
        return (EmojiEditText) this.f25693OooOOOo.getValue();
    }

    @NotNull
    public final PrivateChatVM OooO0O0() {
        PrivateChatVM privateChatVM = this.f25690OooOOO;
        if (privateChatVM != null) {
            return privateChatVM;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mPrivateChatVM");
        return null;
    }
}
