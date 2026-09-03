package p575o0oOoOo;

import androidx.compose.runtime.Oooo0;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.model.MusicFileModel;
import com.yalla.yalla.util.Player.Audio;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p464o0Oooo.o000000O;
import p581o0oOoo00.o000OOo;

/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentMusicVM$addMusicList$1", f = "MomentMusicVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nMomentMusicVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentMusicVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentMusicVM$addMusicList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,150:1\n1855#2:151\n766#2:152\n857#2,2:153\n1856#2:155\n1549#2:156\n1620#2,3:157\n*S KotlinDebug\n*F\n+ 1 MomentMusicVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentMusicVM$addMusicList$1\n*L\n113#1:151\n114#1:152\n114#1:153,2\n113#1:155\n117#1:156\n117#1:157,3\n*E\n"})
public final class o0O0o0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ List<MusicFileModel> f56322OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o0(List<MusicFileModel> list, Continuation<? super o0O0o0> continuation) {
        super(2, continuation);
        this.f56322OooO0Oo = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0O0o0(this.f56322OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0O0o0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ArrayList<Audio> arrayList = new ArrayList();
        Iterator<T> it = this.f56322OooO0Oo.iterator();
        while (it.hasNext()) {
            List<Audio> songList = ((MusicFileModel) it.next()).getSongList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : songList) {
                if (((Audio) obj2).isSelected) {
                    arrayList2.add(obj2);
                }
            }
            arrayList.addAll(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (Audio audio : arrayList) {
            MusicTable musicTable = new MusicTable();
            musicTable.mTitle = audio.getTitle();
            musicTable.mTitleKey = audio.getTitleKey();
            musicTable.mArtist = audio.getArtist();
            musicTable.mArtistKey = audio.getArtistKey();
            musicTable.mComposer = audio.getComposer();
            musicTable.mAlbum = audio.getAlbum();
            musicTable.mAlbumKey = audio.getAlbumKey();
            musicTable.mDisplayName = audio.getDisplayName();
            musicTable.mMimeType = audio.getMimeType();
            musicTable.mPath = audio.getPath();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            musicTable.user = Oooo0.OooO00o();
            musicTable.mDuration = audio.getDuration();
            arrayList3.add(musicTable);
        }
        o000OOo.OooO00o().OooOo().OooO0OO(arrayList3);
        return Unit.INSTANCE;
    }
}
