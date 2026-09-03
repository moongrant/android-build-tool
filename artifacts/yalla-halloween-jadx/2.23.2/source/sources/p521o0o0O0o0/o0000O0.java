package p521o0o0O0o0;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMomentGifItemPlayManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentGifItemPlayManager.kt\ncom/yalla/yalla/ui/composable/moment/utils/MomentGifItemPlayManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n1864#2,3:80\n*S KotlinDebug\n*F\n+ 1 MomentGifItemPlayManager.kt\ncom/yalla/yalla/ui/composable/moment/utils/MomentGifItemPlayManager\n*L\n34#1:80,3\n*E\n"})
public final class o0000O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f52936OooO0OO;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f52938OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MutableState<Integer> f52934OooO00o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(-1, null, 2, null);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ArrayList<Integer> f52935OooO0O0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f52937OooO0Oo = 3;

    public final void OooO00o() {
        if (this.f52938OooO0o0) {
            int i = this.f52936OooO0OO + 1;
            this.f52936OooO0OO = i;
            ArrayList<Integer> arrayList = this.f52935OooO0O0;
            if (i == arrayList.size()) {
                this.f52936OooO0OO = 0;
            }
            Integer num = arrayList.get(this.f52936OooO0OO);
            Intrinsics.checkNotNullExpressionValue(num, "get(...)");
            this.f52934OooO00o.setValue(num);
        }
    }
}
