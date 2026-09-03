package androidx.paging;

import androidx.annotation.IntRange;
import java.util.List;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O00O.o000Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPagingState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagingState.kt\nandroidx/paging/PagingState\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,151:1\n142#1,8:155\n142#1,8:174\n1726#2,3:152\n223#2,2:163\n451#2,6:165\n1726#2,3:171\n1726#2,3:182\n288#2,2:185\n533#2,6:187\n*S KotlinDebug\n*F\n+ 1 PagingState.kt\nandroidx/paging/PagingState\n*L\n76#1:155,8\n103#1:174,8\n74#1:152,3\n77#1:163,2\n78#1:165,6\n101#1:171,3\n115#1:182,3\n122#1:185,2\n130#1:187,6\n*E\n"})
public final class o000000<Key, Value> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final List<o0O0O00.OooO0O0.OooO0OO<Key, Value>> f7278OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final Integer f7279OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o000Oo0 f7280OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f7281OooO0Oo;

    public o000000(@NotNull List<o0O0O00.OooO0O0.OooO0OO<Key, Value>> pages, @Nullable Integer num, @NotNull o000Oo0 config, @IntRange(from = ULong.MIN_VALUE) int i) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f7278OooO00o = pages;
        this.f7279OooO0O0 = num;
        this.f7280OooO0OO = config;
        this.f7281OooO0Oo = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof o000000) {
            o000000 o000000Var = (o000000) obj;
            if (Intrinsics.areEqual(this.f7278OooO00o, o000000Var.f7278OooO00o) && Intrinsics.areEqual(this.f7279OooO0O0, o000000Var.f7279OooO0O0) && Intrinsics.areEqual(this.f7280OooO0OO, o000000Var.f7280OooO0OO) && this.f7281OooO0Oo == o000000Var.f7281OooO0Oo) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f7278OooO00o.hashCode();
        Integer num = this.f7279OooO0O0;
        return this.f7280OooO0OO.hashCode() + iHashCode + (num != null ? num.hashCode() : 0) + this.f7281OooO0Oo;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingState(pages=");
        sb.append(this.f7278OooO00o);
        sb.append(", anchorPosition=");
        sb.append(this.f7279OooO0O0);
        sb.append(", config=");
        sb.append(this.f7280OooO0OO);
        sb.append(", leadingPlaceholderCount=");
        return androidx.compose.foundation.layout.OooO0O0.OooO00o(sb, this.f7281OooO0Oo, ')');
    }
}
