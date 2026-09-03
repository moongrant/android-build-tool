package p089o000o000;

import androidx.paging.LoadType;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f29089OooO00o = new OooO0O0(this);

    public final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public o00OO0O0 f29090OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final MutableSharedFlow<o00OO0O0> f29091OooO0O0 = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);

        public final void OooO00o(@Nullable o00OO0O0 o00oo0o1) {
            this.f29090OooO00o = o00oo0o1;
            if (o00oo0o1 != null) {
                this.f29091OooO0O0.tryEmit(o00oo0o1);
            }
        }
    }

    public final class OooO0O0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public o00OO0O0.OooO00o f29094OooO0OO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final OooO00o f29092OooO00o = new OooO00o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final OooO00o f29093OooO0O0 = new OooO00o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final ReentrantLock f29095OooO0Oo = new ReentrantLock();

        public OooO0O0(o0ooOOo o0ooooo2) {
        }

        public final void OooO00o(@Nullable o00OO0O0.OooO00o oooO00o, @NotNull Function2<? super OooO00o, ? super OooO00o, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            ReentrantLock reentrantLock = this.f29095OooO0Oo;
            reentrantLock.lock();
            if (oooO00o != null) {
                try {
                    this.f29094OooO0OO = oooO00o;
                } finally {
                    reentrantLock.unlock();
                }
            }
            block.invoke(this.f29092OooO00o, this.f29093OooO0O0);
            Unit unit = Unit.INSTANCE;
        }
    }

    public /* synthetic */ class OooO0OO {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            iArr[LoadType.PREPEND.ordinal()] = 1;
            iArr[LoadType.APPEND.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public final Flow<o00OO0O0> OooO00o(@NotNull LoadType loadType) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int i = OooO0OO.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i == 1) {
            return this.f29089OooO00o.f29092OooO00o.f29091OooO0O0;
        }
        if (i == 2) {
            return this.f29089OooO00o.f29093OooO0O0.f29091OooO0O0;
        }
        throw new IllegalArgumentException("invalid load type for hints");
    }
}
