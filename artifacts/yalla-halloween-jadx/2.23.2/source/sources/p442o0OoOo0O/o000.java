package p442o0OoOo0O;

import android.text.SpannableString;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.model.chat.ChatModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final MutableState<String> f47210OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MutableState<ChatModel> f47211OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f47212OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableState<Integer> f47213OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MutableState<String> f47214OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState<String> f47215OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final MutableState<SpannableString> f47216OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final MutableState<String> f47217OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final MutableState<Integer> f47218OooO0oo;

    public o000() {
        this(null);
    }

    public o000(Object obj) {
        MutableState<ChatModel> replyChatModel = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        MutableState<Boolean> replyChatVisible = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        MutableState<Integer> type = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(-1, null, 2, null);
        MutableState<String> userName = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        MutableState<SpannableString> contentText = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        MutableState<String> picUrl = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        MutableState<String> giftUrl = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        MutableState<Integer> giftNumber = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        MutableState<String> giftToUserName = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        Intrinsics.checkNotNullParameter(replyChatModel, "replyChatModel");
        Intrinsics.checkNotNullParameter(replyChatVisible, "replyChatVisible");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(contentText, "contentText");
        Intrinsics.checkNotNullParameter(picUrl, "picUrl");
        Intrinsics.checkNotNullParameter(giftUrl, "giftUrl");
        Intrinsics.checkNotNullParameter(giftNumber, "giftNumber");
        Intrinsics.checkNotNullParameter(giftToUserName, "giftToUserName");
        this.f47211OooO00o = replyChatModel;
        this.f47212OooO0O0 = replyChatVisible;
        this.f47213OooO0OO = type;
        this.f47214OooO0Oo = userName;
        this.f47216OooO0o0 = contentText;
        this.f47215OooO0o = picUrl;
        this.f47217OooO0oO = giftUrl;
        this.f47218OooO0oo = giftNumber;
        this.f47210OooO = giftToUserName;
    }
}
