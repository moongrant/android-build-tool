package p045OooooOo;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class oOO00O {

    /* JADX INFO: Add missing generic type declarations: [Original] */
    public static final class OooO00o<Original> extends Lambda implements Function2<o00OO00O, Original, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function2<o00OO00O, Original, List<Saveable>> f4043Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Function2<? super o00OO00O, ? super Original, ? extends List<? extends Saveable>> function2) {
            super(2);
            this.f4043Oooo0o = function2;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00OO00O o00oo00o, Object obj) {
            o00OO00O Saver = o00oo00o;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            List list = (List) this.f4043Oooo0o.invoke(Saver, (Original) obj);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                if (obj2 != null && !Saver.canBeSaved(obj2)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            if (!list.isEmpty()) {
                return new ArrayList(list);
            }
            return null;
        }
    }

    @NotNull
    public static final <Original, Saveable> o00O<Original, Object> OooO00o(@NotNull Function2<? super o00OO00O, ? super Original, ? extends List<? extends Saveable>> save, @NotNull Function1<? super List<? extends Saveable>, ? extends Original> restore) {
        Intrinsics.checkNotNullParameter(save, "save");
        Intrinsics.checkNotNullParameter(restore, "restore");
        return o00OO000.OooO00o(new OooO00o(save), (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(restore, 1));
    }
}
