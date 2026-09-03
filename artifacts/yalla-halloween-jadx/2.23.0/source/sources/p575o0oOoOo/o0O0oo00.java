package p575o0oOoOo;

import androidx.lifecycle.LiveDataScope;
import com.yalla.yalla.data.db.model.MusicTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p004OooO0oO.o000oOoO;
import p403o0Oo0OOo.oO0000O;
import p464o0Oooo.o000000O;
import p581o0oOoo00.o000OOo;

/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentMusicVM$findMusicList$1", f = "MomentMusicVM.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nMomentMusicVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentMusicVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentMusicVM$findMusicList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,150:1\n1855#2:151\n1856#2:153\n1#3:152\n*S KotlinDebug\n*F\n+ 1 MomentMusicVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentMusicVM$findMusicList$1\n*L\n62#1:151\n62#1:153\n*E\n"})
public final class o0O0oo00 extends SuspendLambda implements Function2<LiveDataScope<List<MusicTable>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f56331OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f56332OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f56333OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o0O0o00O f56334OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0oo00(String str, o0O0o00O o0o0o00o, Continuation<? super o0O0oo00> continuation) {
        super(2, continuation);
        this.f56332OooO0o = str;
        this.f56334OooO0oO = o0o0o00o;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o0O0oo00 o0o0oo00 = new o0O0oo00(this.f56332OooO0o, this.f56334OooO0oO, continuation);
        o0o0oo00.f56333OooO0o0 = obj;
        return o0o0oo00;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LiveDataScope<List<MusicTable>> liveDataScope, Continuation<? super Unit> continuation) {
        return ((o0O0oo00) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MusicTable next;
        MusicTable musicTable;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f56331OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LiveDataScope liveDataScope = (LiveDataScope) this.f56333OooO0o0;
            String keyword = this.f56332OooO0o;
            Intrinsics.checkNotNullParameter(keyword, "keyword");
            oO0000O oo0000oOooOo = o000OOo.OooO00o().OooOo();
            String strOooO00o = o000oOoO.OooO00o("%", keyword, "%");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            ArrayList<MusicTable> arrayListOooO0Oo = oo0000oOooOo.OooO0Oo(strOooO00o, String.valueOf(o000000O.OooOOo0().getValue()));
            ArrayList arrayList = new ArrayList();
            if (arrayListOooO0Oo != null) {
                for (MusicTable musicTable2 : arrayListOooO0Oo) {
                    Iterator<MusicTable> it = this.f56334OooO0oO.f56326OooO0Oo.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        musicTable = next;
                    } while (!(Intrinsics.areEqual(musicTable2.mPath, musicTable.mPath) && Intrinsics.areEqual(musicTable2.mTitleKey, musicTable.mTitleKey)));
                    MusicTable musicTable3 = next;
                    if (musicTable3 != null) {
                        arrayList.add(musicTable3);
                    }
                }
            }
            this.f56331OooO0Oo = 1;
            if (liveDataScope.emit(arrayList, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
