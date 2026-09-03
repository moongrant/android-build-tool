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
import p587o0oOooOO.t;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nPrivateChatBottomComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateChatBottomComp.kt\ncom/yalla/yalla/ui/activity/message/ChatBottomState\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,424:1\n107#2:425\n79#2,22:426\n*S KotlinDebug\n*F\n+ 1 PrivateChatBottomComp.kt\ncom/yalla/yalla/ui/activity/message/ChatBottomState\n*L\n399#1:425\n399#1:426,22\n*E\n"})
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final MutableState<p371o0OOo0oO.oo000o> f25223OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f25224OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final p434o0OoOOOO.o00O0OO f25225OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final p434o0OoOOOO.o0oOOo f25226OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f25227OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f25228OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f25229OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f25230OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f25231OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f25232OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final p497o0o00OoO.o0000oo f25233OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final t f25234OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public PrivateChatVM f25235OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public p434o0OoOOOO.o0oOOo f25236OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public View f25237OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final Lazy f25238OooOOOo;

    public Oooo000() {
        throw null;
    }

    public Oooo000(Context context, p434o0OoOOOO.o00O0OO o00o0oo2, p434o0OoOOOO.o0oOOo o0oooo) {
        Boolean bool = Boolean.FALSE;
        MutableState<Boolean> isNotFriendShow = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        MutableState<Boolean> isKeyBoardShow = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        MutableState<Boolean> isFacePanelShow = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        MutableState<Boolean> isVoiceOpen = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        MutableState<Boolean> isVoiceShow = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        MutableState<p371o0OOo0oO.oo000o> keyBoardPanelHelper = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        MutableState<Boolean> isMessageNullOrBlank = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        p497o0o00OoO.o0000oo panelLayoutState = new p497o0o00OoO.o0000oo(context);
        t facePanelState = new t(false, 511);
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
        this.f25224OooO00o = context;
        this.f25225OooO0O0 = o00o0oo2;
        this.f25226OooO0OO = o0oooo;
        this.f25227OooO0Oo = isNotFriendShow;
        this.f25229OooO0o0 = isKeyBoardShow;
        this.f25228OooO0o = isFacePanelShow;
        this.f25230OooO0oO = isVoiceOpen;
        this.f25231OooO0oo = isVoiceShow;
        this.f25223OooO = keyBoardPanelHelper;
        this.f25232OooOO0 = isMessageNullOrBlank;
        this.f25233OooOO0O = panelLayoutState;
        this.f25234OooOO0o = facePanelState;
        this.f25238OooOOOo = LazyKt.lazy(new OooOo(this));
    }

    @NotNull
    public final EmojiEditText OooO00o() {
        return (EmojiEditText) this.f25238OooOOOo.getValue();
    }

    @NotNull
    public final PrivateChatVM OooO0O0() {
        PrivateChatVM privateChatVM = this.f25235OooOOO;
        if (privateChatVM != null) {
            return privateChatVM;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mPrivateChatVM");
        return null;
    }
}
