package p115o00O00oO;

import android.os.Build;
import androidx.work.OooO0O0;
import androidx.work.OooO0OO;
import androidx.work.WorkInfo$State;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import o00O0OO.o00Ooo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o000000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final UUID f36143OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00Ooo f36144OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Set<String> f36145OooO0OO;

    public static abstract class OooO00o<B extends OooO00o<B, ?>, W extends o000000O> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public UUID f36146OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public o00Ooo f36147OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final Set<String> f36148OooO0OO;

        public OooO00o(@NotNull Class<? extends OooO0OO> workerClass) {
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID()");
            this.f36146OooO00o = uuidRandomUUID;
            String id = this.f36146OooO00o.toString();
            Intrinsics.checkNotNullExpressionValue(id, "id.toString()");
            String workerClassName_ = workerClass.getName();
            Intrinsics.checkNotNullExpressionValue(workerClassName_, "workerClass.name");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(workerClassName_, "workerClassName_");
            this.f36147OooO0O0 = new o00Ooo(id, null, workerClassName_, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 1048570, 0);
            String name = workerClass.getName();
            Intrinsics.checkNotNullExpressionValue(name, "workerClass.name");
            this.f36148OooO0OO = SetsKt.mutableSetOf(name);
        }

        @NotNull
        public final W OooO00o() {
            o0OO00O o0oo00o2 = new o0OO00O((o0OO00O.OooO00o) this);
            Oooo0 oooo0 = this.f36147OooO0O0.f36224OooOO0;
            boolean z = (Build.VERSION.SDK_INT >= 24 && (oooo0.f36138OooO0oo.isEmpty() ^ true)) || oooo0.f36134OooO0Oo || oooo0.f36132OooO0O0 || oooo0.f36133OooO0OO;
            o00Ooo o00ooo2 = this.f36147OooO0O0;
            if (o00ooo2.f36232OooOOo0) {
                if (!(!z)) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
                }
                if (!(o00ooo2.f36222OooO0oO <= 0)) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
                }
            }
            UUID id = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(id, "randomUUID()");
            Intrinsics.checkNotNullParameter(id, "id");
            this.f36146OooO00o = id;
            String newId = id.toString();
            Intrinsics.checkNotNullExpressionValue(newId, "id.toString()");
            o00Ooo other = this.f36147OooO0O0;
            Intrinsics.checkNotNullParameter(newId, "newId");
            Intrinsics.checkNotNullParameter(other, "other");
            String str = other.f36218OooO0OO;
            WorkInfo$State workInfo$State = other.f36217OooO0O0;
            String str2 = other.f36219OooO0Oo;
            OooO0O0 oooO0O0 = new OooO0O0(other.f36221OooO0o0);
            OooO0O0 oooO0O1 = new OooO0O0(other.f36220OooO0o);
            long j = other.f36222OooO0oO;
            long j2 = other.f36223OooO0oo;
            long j3 = other.f36215OooO;
            Oooo0 other2 = other.f36224OooOO0;
            Intrinsics.checkNotNullParameter(other2, "other");
            this.f36147OooO0O0 = new o00Ooo(newId, workInfo$State, str, str2, oooO0O0, oooO0O1, j, j2, j3, new Oooo0(other2.f36131OooO00o, other2.f36132OooO0O0, other2.f36133OooO0OO, other2.f36134OooO0Oo, other2.f36136OooO0o0, other2.f36135OooO0o, other2.f36137OooO0oO, other2.f36138OooO0oo), other.f36225OooOO0O, other.f36226OooOO0o, other.f36228OooOOO0, other.f36227OooOOO, other.f36229OooOOOO, other.f36230OooOOOo, other.f36232OooOOo0, other.f36231OooOOo, other.f36233OooOOoo, 524288, 0);
            return o0oo00o2;
        }
    }

    public o000000O(@NotNull UUID id, @NotNull o00Ooo workSpec, @NotNull Set<String> tags) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f36143OooO00o = id;
        this.f36144OooO0O0 = workSpec;
        this.f36145OooO0OO = tags;
    }
}
