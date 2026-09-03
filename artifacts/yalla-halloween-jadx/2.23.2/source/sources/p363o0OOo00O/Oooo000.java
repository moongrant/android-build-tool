package p363o0OOo00O;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O00O;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import o000OO.OooOO0O;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nVideoPlayerPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoPlayerPool.kt\ncom/yalla/android/videoplayer/exoplayer/VideoPlayerPool\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,107:1\n1855#2,2:108\n*S KotlinDebug\n*F\n+ 1 VideoPlayerPool.kt\ncom/yalla/android/videoplayer/exoplayer/VideoPlayerPool\n*L\n57#1:108,2\n*E\n"})
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final List<OooO> f43069OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooOO0O<OooO> f43070OooO0O0;

    static {
        ArrayList arrayList = new ArrayList(6);
        for (int i = 0; i < 6; i++) {
            arrayList.add(new OooO0o(o000O00O.OooO00o()));
        }
        f43069OooO00o = Collections.synchronizedList(arrayList);
        f43070OooO0O0 = new OooOO0O<>(6);
    }
}
