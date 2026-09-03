package androidx.paging;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f10251OooO00o = new OooO0O0(this);

    public final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public o00000 f10252OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final MutableSharedFlow<o00000> f10253OooO0O0 = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
    }

    public final class OooO0O0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public o00000.OooO00o f10256OooO0OO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final OooO00o f10254OooO00o = new OooO00o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final OooO00o f10255OooO0O0 = new OooO00o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final ReentrantLock f10257OooO0Oo = new ReentrantLock();

        public OooO0O0(OooO0o oooO0o) {
        }

        public final void OooO00o(@Nullable o00000.OooO00o oooO00o, @NotNull Function2<? super OooO00o, ? super OooO00o, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            ReentrantLock reentrantLock = this.f10257OooO0Oo;
            reentrantLock.lock();
            if (oooO00o != null) {
                try {
                    this.f10256OooO0OO = oooO00o;
                } finally {
                    reentrantLock.unlock();
                }
            }
            block.invoke(this.f10254OooO00o, this.f10255OooO0O0);
            Unit unit = Unit.INSTANCE;
        }
    }

    public /* synthetic */ class OooO0OO {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.PREPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadType.APPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public final MutableSharedFlow OooO00o(@NotNull LoadType loadType) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int i = OooO0OO.$EnumSwitchMapping$0[loadType.ordinal()];
        OooO0O0 oooO0O0 = this.f10251OooO00o;
        if (i == 1) {
            return oooO0O0.f10254OooO00o.f10253OooO0O0;
        }
        if (i == 2) {
            return oooO0O0.f10255OooO0O0.f10253OooO0O0;
        }
        throw new IllegalArgumentException("invalid load type for hints");
    }
}
