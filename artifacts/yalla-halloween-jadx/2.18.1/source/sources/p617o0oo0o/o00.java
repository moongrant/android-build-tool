package p617o0oo0o;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.pro.ao;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.data.manager.MusicState;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO.o0000O;
import p391o0OOooOo.o0O00000;
import p445o0OoOo0o.o0O0OOOo;
import p491o0o00O00.OooO0OO;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o00 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static boolean f48462OooO0O0 = true;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public static MusicTable f48463OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static boolean f48464OooO0Oo = false;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static int f48465OooO0o = 30;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static long f48466OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00 f48461OooO00o = new o00();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final Lazy f48467OooO0oO = LazyKt.lazy(OooO00o.f48468Oooo0o);

    public static final class OooO00o extends Lambda implements Function0<Observer<List<MusicTable>>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f48468Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Observer<List<MusicTable>> invoke() {
            return new Observer() { // from class: o0oo0o.o000OOo0
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    if (o00.f48462OooO0O0) {
                        o00 o00Var = o00.f48461OooO00o;
                        o00.f48462OooO0O0 = false;
                        return;
                    }
                    MusicState musicState = MusicState.f21402OooO00o;
                    LiveData liveDataOooO00o = MusicState.OooO00o();
                    o00 o00Var2 = o00.f48461OooO00o;
                    liveDataOooO00o.removeObserver((Observer) o00.f48467OooO0oO.getValue());
                    if (o00.f48463OooO0OO != null) {
                        if (MusicState.f21404OooO0OO.getValue() == MusicState.State.Playing) {
                            o00Var2.OooO0Oo(o00.f48463OooO0OO);
                        } else {
                            MusicState.f21403OooO0O0.setValue(o00.f48463OooO0OO);
                        }
                        o00.f48463OooO0OO = null;
                        return;
                    }
                    if (o00.f48464OooO0Oo) {
                        o00.f48464OooO0Oo = false;
                        LiveEventBus.get("MUSIC_NEXT_DELETED").post(Boolean.TRUE);
                    }
                }
            };
        }
    }

    public final void OooO00o(@NotNull List<? extends MusicTable> musicList) {
        MusicTable musicTable;
        Intrinsics.checkNotNullParameter(musicList, "deleteList");
        MusicState musicState = MusicState.f21402OooO00o;
        List<MusicTable> musicList2 = (List) MusicState.OooO00o().getValue();
        if (musicList2 == null) {
            return;
        }
        if (musicList2.size() == musicList.size()) {
            OooO0o();
            Intrinsics.checkNotNullParameter(musicList2, "musicList");
            OooO0OO.OooO00o().OooOoO().OooO0O0(musicList2);
            MusicState.f21403OooO0O0.postValue(null);
            return;
        }
        int iIndexOf = CollectionsKt.indexOf((List<? extends MusicTable>) musicList2, MusicState.f21403OooO0O0.getValue());
        int i = 0;
        for (Object obj : musicList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int iIndexOf2 = musicList2.indexOf((MusicTable) obj);
            if (iIndexOf2 == iIndexOf) {
                int i3 = iIndexOf;
                do {
                    i3++;
                    if (i3 >= musicList2.size()) {
                        i3 = 0;
                    }
                    musicTable = musicList2.get(i3);
                    f48463OooO0OO = musicTable;
                    Intrinsics.checkNotNull(musicTable);
                } while (musicList.indexOf(musicTable) >= 0);
            }
            if ((f48463OooO0OO == null) && iIndexOf2 == iIndexOf + 1) {
                f48464OooO0Oo = true;
            }
            i = i2;
        }
        f48462OooO0O0 = true;
        MusicState musicState2 = MusicState.f21402OooO00o;
        MusicState.OooO00o().observeForever((Observer) f48467OooO0oO.getValue());
        Intrinsics.checkNotNullParameter(musicList, "musicList");
        OooO0OO.OooO00o().OooOoO().OooO0O0(musicList);
    }

    @Nullable
    public final MusicTable OooO0O0() {
        List list;
        int iIndexOf;
        MusicState musicState = MusicState.f21402OooO00o;
        MusicTable value = MusicState.f21403OooO0O0.getValue();
        if (value != null && (list = (List) MusicState.OooO00o().getValue()) != null && (iIndexOf = list.indexOf(value)) >= 0 && iIndexOf < list.size() - 1) {
            return (MusicTable) list.get(iIndexOf + 1);
        }
        return null;
    }

    public final Uri OooO0OO(String str) {
        Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        String[] strArr = {ao.d, "_data", "_display_name", "_size"};
        Context context = o0000O.f2657OooO00o;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            context = null;
        }
        Cursor cursorQuery = context.getContentResolver().query(uri, strArr, "_data='" + str + '\'', null, null);
        if (cursorQuery != null) {
            cursorQuery.getCount();
        }
        Intrinsics.checkNotNull(cursorQuery);
        cursorQuery.moveToNext();
        Uri uriWithAppendedPath = Uri.withAppendedPath(uri, String.valueOf(cursorQuery.getInt(0)));
        Intrinsics.checkNotNullExpressionValue(uriWithAppendedPath, "withAppendedPath(mediaUri, id.toString())");
        return uriWithAppendedPath;
    }

    public final void OooO0Oo(@Nullable MusicTable musicTable) {
        MusicState musicState = MusicState.f21402OooO00o;
        List list = (List) MusicState.OooO00o().getValue();
        if (list == null) {
            return;
        }
        if (musicTable == null) {
            try {
                musicTable = MusicState.f21403OooO0O0.getValue();
                if (musicTable == null) {
                    musicTable = (MusicTable) list.get(0);
                }
            } catch (Exception unused) {
                return;
            }
        }
        String str = musicTable.mPath;
        Intrinsics.checkNotNullExpressionValue(str, "needPlayMusic.mPath");
        o0O0OOOo.OooO0O0().OooO00o().OooO0o(OooO0OO(str).toString());
        o0O0OOOo.OooO0O0().OooO00o().OooO0o0(f48465OooO0o);
        MusicState.f21403OooO0O0.postValue(musicTable);
        MusicState.f21404OooO0OO.postValue(MusicState.State.Playing);
    }

    public final void OooO0o() {
        MusicState musicState = MusicState.f21402OooO00o;
        MutableLiveData<MusicState.State> mutableLiveData = MusicState.f21404OooO0OO;
        if (mutableLiveData.getValue() == MusicState.State.Playing) {
            long jCurrentTimeMillis = System.currentTimeMillis() - f48466OooO0o0;
            HashMap map = new HashMap();
            map.put("playState", "stop");
            o0O00000.OooO0o("InRoom_music_continued", map, (int) jCurrentTimeMillis);
        }
        mutableLiveData.postValue(MusicState.State.Stop);
        o0O0OOOo.OooO0O0().OooO00o().OooOOo0();
    }

    public final void OooO0o0() {
        MusicState musicState = MusicState.f21402OooO00o;
        List list = (List) MusicState.OooO00o().getValue();
        if (list == null) {
            return;
        }
        MusicTable musicTableOooO0O0 = OooO0O0();
        if (musicTableOooO0O0 == null) {
            musicTableOooO0O0 = (MusicTable) list.get(0);
        }
        if (musicTableOooO0O0 != null) {
            f48461OooO00o.OooO0Oo(musicTableOooO0O0);
        }
    }
}
