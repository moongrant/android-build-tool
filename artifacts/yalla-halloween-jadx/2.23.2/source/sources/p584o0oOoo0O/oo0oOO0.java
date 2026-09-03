package p584o0oOoo0O;

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
import p407o0Oo0Oo.oo00oO;
import p408o0Oo0Oo0.o00Oo0;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentMusicVM$findMusicList$1", f = "MomentMusicVM.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nMomentMusicVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentMusicVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentMusicVM$findMusicList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n1855#2:161\n1856#2:163\n1#3:162\n*S KotlinDebug\n*F\n+ 1 MomentMusicVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentMusicVM$findMusicList$1\n*L\n64#1:161\n64#1:163\n*E\n"})
public final class oo0oOO0 extends SuspendLambda implements Function2<LiveDataScope<List<MusicTable>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f56706OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f56707OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f56708OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ oo0o0O0 f56709OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0oOO0(String str, oo0o0O0 oo0o0o0, Continuation<? super oo0oOO0> continuation) {
        super(2, continuation);
        this.f56707OooO0o = str;
        this.f56709OooO0oO = oo0o0o0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        oo0oOO0 oo0ooo0 = new oo0oOO0(this.f56707OooO0o, this.f56709OooO0oO, continuation);
        oo0ooo0.f56708OooO0o0 = obj;
        return oo0ooo0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LiveDataScope<List<MusicTable>> liveDataScope, Continuation<? super Unit> continuation) {
        return ((oo0oOO0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MusicTable next;
        MusicTable musicTable;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f56706OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LiveDataScope liveDataScope = (LiveDataScope) this.f56708OooO0o0;
            String keyword = this.f56707OooO0o;
            Intrinsics.checkNotNullParameter(keyword, "keyword");
            oo00oO oo00ooOooOoO0 = o00Oo0.OooO00o().OooOoO0();
            String strOooO0O0 = o000oOoO.OooO0O0("%", keyword, "%");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            ArrayList<MusicTable> arrayListOooO0Oo = oo00ooOooOoO0.OooO0Oo(strOooO0O0, String.valueOf(o0O00oO0.OooOOo0().getValue()));
            ArrayList arrayList = new ArrayList();
            if (arrayListOooO0Oo != null) {
                for (MusicTable musicTable2 : arrayListOooO0Oo) {
                    Iterator<MusicTable> it = this.f56709OooO0oO.f56702OooO0o0.iterator();
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
            this.f56706OooO0Oo = 1;
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
