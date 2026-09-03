package p115o00O00oO;

import androidx.work.OooO0OO;
import androidx.work.OverwritingInputMerger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00O extends o000000O {

    public static final class OooO00o extends o000000O.OooO00o<OooO00o, o0OO00O> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(@NotNull Class<? extends OooO0OO> workerClass) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            this.f36147OooO0O0.f36219OooO0Oo = OverwritingInputMerger.class.getName();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00O(@NotNull OooO00o builder) {
        super(builder.f36146OooO00o, builder.f36147OooO0O0, builder.f36148OooO0OO);
        Intrinsics.checkNotNullParameter(builder, "builder");
    }
}
