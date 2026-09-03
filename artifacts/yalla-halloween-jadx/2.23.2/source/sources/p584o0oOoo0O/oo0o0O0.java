package p584o0oOoo0O;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.code.android.util.o000O00O;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.data.manager.MusicState;
import com.yalla.yalla.model.MusicFileModel;
import com.yalla.yalla.util.Player.Audio;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMomentMusicVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentMusicVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentMusicVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,160:1\n81#2:161\n107#2,2:162\n1#3:164\n1549#4:165\n1620#4,3:166\n1855#4:169\n1855#4,2:170\n1856#4:172\n1477#4:173\n1502#4,3:174\n1505#4,3:184\n372#5,7:177\n*S KotlinDebug\n*F\n+ 1 MomentMusicVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentMusicVM\n*L\n36#1:161\n36#1:162,2\n88#1:165\n88#1:166,3\n104#1:169\n105#1:170,2\n104#1:172\n151#1:173\n151#1:174,3\n151#1:184,3\n151#1:177,7\n*E\n"})
public final class oo0o0O0 extends ViewModel {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<MusicTable>> f56701OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<ArrayList<MusicFileModel>> f56703OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f56697OooO00o = true;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f56698OooO0O0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableState f56699OooO0OO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new MusicTable(), null, 2, null);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<MusicTable>> f56700OooO0Oo = new MutableLiveData<>(MusicState.OooO00o().getValue());

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final CopyOnWriteArrayList<MusicTable> f56702OooO0o0 = new CopyOnWriteArrayList<>();

    public static final class OooO00o extends Lambda implements Function1<List<MusicTable>, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<MusicTable> list) {
            oo0o0O0.this.f56700OooO0Oo.setValue(list);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f56705OooO0Oo;

        public OooO0O0(OooO00o function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f56705OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f56705OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f56705OooO0Oo;
        }

        public final int hashCode() {
            return this.f56705OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f56705OooO0Oo.invoke(obj);
        }
    }

    public oo0o0O0() {
        LiveData liveDataOooO00o = MusicState.OooO00o();
        Context context = o000O00O.f13421OooO00o;
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        Intrinsics.checkNotNull(activityOooO0O0, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        liveDataOooO00o.observe((AppCompatActivity) activityOooO0O0, new OooO0O0(new OooO00o()));
        this.f56701OooO0o = new MutableLiveData<>(new ArrayList());
        this.f56703OooO0oO = StateFlowKt.MutableStateFlow(new ArrayList());
    }

    @NotNull
    public static ArrayList OooO0O0(@NotNull List mediaList) {
        Intrinsics.checkNotNullParameter(mediaList, "mediaList");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : mediaList) {
            Audio audio = (Audio) obj;
            String path = audio.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
            String path2 = audio.getPath();
            Intrinsics.checkNotNullExpressionValue(path2, "getPath(...)");
            String strSubstring = path.substring(0, StringsKt__StringsKt.lastIndexOf$default(path2, "/", 0, false, 6, (Object) null));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            Object arrayList = linkedHashMap.get(strSubstring);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strSubstring, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            String strSubstring2 = str.substring(StringsKt__StringsKt.lastIndexOf$default(str, "/", 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            arrayList2.add(new MusicFileModel(strSubstring2, str, list.size(), list));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final MusicTable OooO0OO() {
        return (MusicTable) this.f56699OooO0OO.getValue();
    }
}
