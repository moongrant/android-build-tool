package o000O00O;

import com.facebook.internal.NativeProtocol;
import com.qiniu.android.collect.ReportItem;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, l = {646, 658, 415, 424, 680, 722, 472, 744, 495, 521, 756}, m = "doLoad", n = {"this", "loadType", "generationalHint", "itemsLoaded", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "$this$withLock_u24default$iv$iv", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", NativeProtocol.WEB_DIALOG_PARAMS, "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", NativeProtocol.WEB_DIALOG_PARAMS, ReportItem.QualityKeyResult, "this_$iv", "$this$withLock_u24default$iv$iv", "this", "loadType", "generationalHint", ReportItem.QualityKeyResult, "this_$iv", "$this$withLock_u24default$iv$iv", "loadType", "generationalHint", "$this$withLock_u24default$iv$iv", "state", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", NativeProtocol.WEB_DIALOG_PARAMS, ReportItem.QualityKeyResult, "dropType", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", NativeProtocol.WEB_DIALOG_PARAMS, ReportItem.QualityKeyResult, "$this$withLock_u24default$iv$iv", "state", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", NativeProtocol.WEB_DIALOG_PARAMS, ReportItem.QualityKeyResult, "$this$withLock_u24default$iv$iv", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", "this_$iv", "$this$withLock_u24default$iv$iv", "endsPrepend", "endsAppend"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1"})
public final class o000OO extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Object f34537OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Object f34538OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Object f34539OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Object f34540OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Object f34541OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Object f34542OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Object f34543OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public Object f34544OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public Object f34545OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public Mutex f34546OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public Object f34547OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f34548OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f34549OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.o000oOoO<Object, Object> f34550OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public /* synthetic */ Object f34551OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f34552OooOOoo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO(androidx.paging.o000oOoO<Object, Object> o000oooo2, Continuation<? super o000OO> continuation) {
        super(continuation);
        this.f34550OooOOo = o000oooo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f34551OooOOo0 = obj;
        this.f34552OooOOoo |= Integer.MIN_VALUE;
        return androidx.paging.o000oOoO.OooO0O0(this.f34550OooOOo, null, null, this);
    }
}
