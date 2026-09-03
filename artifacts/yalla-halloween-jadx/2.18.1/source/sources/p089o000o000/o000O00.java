package p089o000o000;

import com.facebook.internal.FacebookRequestErrorClassification;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.qiniu.android.collect.ReportItem;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, l = {615, 627, 404, FacebookRequestErrorClassification.EC_APP_NOT_INSTALLED, 639, 651, 454, 663, 476, 502, 675}, m = "doLoad", n = {"this", "loadType", "generationalHint", "itemsLoaded", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "$this$withLock_u24default$iv$iv", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", NativeProtocol.WEB_DIALOG_PARAMS, "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", NativeProtocol.WEB_DIALOG_PARAMS, ReportItem.QualityKeyResult, "this_$iv", "$this$withLock_u24default$iv$iv", "this", "loadType", "generationalHint", ReportItem.QualityKeyResult, "this_$iv", "$this$withLock_u24default$iv$iv", "loadType", "generationalHint", "$this$withLock_u24default$iv$iv", ServerProtocol.DIALOG_PARAM_STATE, "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", NativeProtocol.WEB_DIALOG_PARAMS, ReportItem.QualityKeyResult, "dropType", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", NativeProtocol.WEB_DIALOG_PARAMS, ReportItem.QualityKeyResult, "$this$withLock_u24default$iv$iv", ServerProtocol.DIALOG_PARAM_STATE, "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", NativeProtocol.WEB_DIALOG_PARAMS, ReportItem.QualityKeyResult, "$this$withLock_u24default$iv$iv", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", "this_$iv", "$this$withLock_u24default$iv$iv", "endsPrepend", "endsAppend"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1"})
public final class o000O00 extends ContinuationImpl {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public Object f28769Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Object f28770Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Object f28771Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Object f28772Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public Object f28773OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public Object f28774OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public Object f28775OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public Object f28776OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public Object f28777OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public Mutex f28778OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f28779OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f28780OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public /* synthetic */ Object f28781OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final /* synthetic */ o000O000<Object, Object> f28782OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f28783Ooooo00;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public Object f28784o000oOoO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00(o000O000<Object, Object> o000o001, Continuation<? super o000O00> continuation) {
        super(continuation);
        this.f28782OoooOoo = o000o001;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f28781OoooOoO = obj;
        this.f28783Ooooo00 |= Integer.MIN_VALUE;
        return o000O000.OooO0O0(this.f28782OoooOoo, null, null, this);
    }
}
