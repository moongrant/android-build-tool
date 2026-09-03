package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.model.MusicSelecterModel;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.util.Player.Audio;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import p519o0o0O0oO.O0000000;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public class SearchMusicActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ int f26696OooOoO0 = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public Button f26697OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public RecyclerView f26698OooOOo0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public o0O0O0Oo f26700OooOo;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public o0O00oO0 f26703OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public O0000000 f26704OooOo0o;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final ArrayList<ArrayList<MusicSelecterModel>> f26699OooOOoo = new ArrayList<>();

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f26702OooOo00 = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f26701OooOo0 = 0;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SearchMusicActivity searchMusicActivity = SearchMusicActivity.this;
            Iterator<ArrayList<MusicSelecterModel>> it = searchMusicActivity.f26699OooOOoo.iterator();
            while (it.hasNext()) {
                for (MusicSelecterModel musicSelecterModel : it.next()) {
                    if (musicSelecterModel.select) {
                        MusicTable musicTable = new MusicTable();
                        musicTable.mTitle = musicSelecterModel.audio.getTitle();
                        musicTable.mTitleKey = musicSelecterModel.audio.getTitleKey();
                        musicTable.mArtist = musicSelecterModel.audio.getArtist();
                        musicTable.mArtistKey = musicSelecterModel.audio.getArtistKey();
                        musicTable.mComposer = musicSelecterModel.audio.getComposer();
                        musicTable.mAlbum = musicSelecterModel.audio.getAlbum();
                        musicTable.mAlbumKey = musicSelecterModel.audio.getAlbumKey();
                        musicTable.mDisplayName = musicSelecterModel.audio.getDisplayName();
                        musicTable.mMimeType = musicSelecterModel.audio.getMimeType();
                        musicTable.mPath = musicSelecterModel.audio.getPath();
                        p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
                        musicTable.user = androidx.compose.runtime.Oooo0.OooO00o();
                        musicTable.mDuration = musicSelecterModel.audio.getDuration();
                        p581o0oOoo00.o000OOo.OooO00o().OooOo().OooO0o(musicTable);
                    }
                }
            }
            searchMusicActivity.runOnUiThread(new o0O0oo0o(searchMusicActivity));
        }
    }

    public final boolean OooOo0() {
        ArrayList<ArrayList<MusicSelecterModel>> arrayList = this.f26699OooOOoo;
        if (com.code.android.util.OooOo00.OooO00o(arrayList)) {
            return false;
        }
        Iterator<ArrayList<MusicSelecterModel>> it = arrayList.iterator();
        while (it.hasNext()) {
            Iterator<MusicSelecterModel> it2 = it.next().iterator();
            while (it2.hasNext()) {
                if (it2.next().select) {
                    p157o00OoOO0.o0OO00O o0oo00o2 = new p157o00OoOO0.o0OO00O(this);
                    o0oo00o2.OooOo00(getString(oO00OOo0.selected_sure_to_add));
                    o0oo00o2.OooOo0(new Function0() { // from class: com.yalla.yalla.ui.activity.room.o0OoO00O
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i = SearchMusicActivity.f26696OooOoO0;
                            this.f26944OooO0Oo.OooOo0O();
                            return null;
                        }
                    });
                    o0oo00o2.OooOo0O(new Function0() { // from class: com.yalla.yalla.ui.activity.room.o0O00O0o
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i = SearchMusicActivity.f26696OooOoO0;
                            this.f26902OooO0Oo.finish();
                            return null;
                        }
                    });
                    o0oo00o2.OooOO0o();
                    return true;
                }
            }
        }
        return false;
    }

    public final void OooOo0O() {
        if (this.f26704OooOo0o == null) {
            p519o0o0O0oO.o0O00O0o.OooO00o().getClass();
            this.f26704OooOo0o = new O0000000();
        }
        this.f26704OooOo0o.OooO0OO(this, com.code.android.util.o0000.OooO0OO(oO00OOo0.Adding));
        new Thread(new OooO00o()).start();
    }

    public final void OooOo0o(ArrayList arrayList) {
        if (com.code.android.util.OooOo00.OooO00o(arrayList)) {
            runOnUiThread(new o0O0O0o0(this));
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Audio audio = (Audio) it.next();
            String strSubstring = audio.getPath().substring(0, audio.getPath().lastIndexOf("/"));
            MusicSelecterModel musicSelecterModel = new MusicSelecterModel(audio, strSubstring.substring(strSubstring.lastIndexOf("/") + 1, strSubstring.length()), strSubstring);
            ArrayList<ArrayList<MusicSelecterModel>> arrayList2 = this.f26699OooOOoo;
            if (arrayList2.size() == 0) {
                ArrayList<MusicSelecterModel> arrayList3 = new ArrayList<>();
                arrayList3.add(musicSelecterModel);
                arrayList2.add(arrayList3);
            } else {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList2.get(i).get(0).filePath.equals(strSubstring)) {
                        arrayList2.get(i).add(musicSelecterModel);
                        break;
                    }
                    if (i == arrayList2.size() - 1) {
                        ArrayList<MusicSelecterModel> arrayList4 = new ArrayList<>();
                        arrayList4.add(musicSelecterModel);
                        arrayList2.add(arrayList4);
                    }
                }
            }
        }
        runOnUiThread(new o0O0O0o0(this));
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (OooOo0()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oO00OO0O.activity_searchmusic);
        OooOOo0(2);
        this.f22755OooOO0.setTitle(oO00OOo0.add_music);
        this.f22755OooOO0.OooOoO0(oO00OOo0.scan, new o0O00o00(this));
        this.f22755OooOO0.OooOo00(new Function0() { // from class: com.yalla.yalla.ui.activity.room.o0O00O
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = SearchMusicActivity.f26696OooOoO0;
                SearchMusicActivity searchMusicActivity = this.f26901OooO0Oo;
                if (searchMusicActivity.OooOo0()) {
                    return null;
                }
                searchMusicActivity.finish();
                return null;
            }
        });
        this.f26698OooOOo0 = (RecyclerView) findViewById(oO00O0oO.rv_search_music_folders);
        this.f26697OooOOo = (Button) findViewById(oO00O0oO.bt_music_search_add);
        o0O00oO0 o0o00oo1 = new o0O00oO0(this, oO00OO0O.item_scan_music_class, this.f26699OooOOoo);
        this.f26703OooOo0O = o0o00oo1;
        o0o00oo1.f10098OooO0o = new o0O0O0O(this);
        o0o00oo1.Oooo000(oO00OOo0.No_music_available);
        this.f26703OooOo0O.OooOooo(oOo00OO0.icon_request_error_green);
        o0O00oO0 o0o00oo2 = this.f26703OooOo0O;
        o0o00oo2.f56197OooOoO.setEmptyTextColor(oO00O0o.white_50);
        this.f26703OooOo0O.Oooo00O(false);
        this.f26698OooOOo0.setLayoutManager(new FixLinearLayoutManager(this));
        this.f26698OooOOo0.setAdapter(this.f26703OooOo0O);
        this.f26697OooOOo.setOnClickListener(new o0oO0O0o(this));
        OooOo0o(p583o0oOooO.o0O.OooO00o(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p418o0OoO000.Oooo000
    @Subscribe(sticky = true, threadMode = ThreadMode.POSTING)
    public void onEvent(p418o0OoO000.OooOo oooOo) {
        if (oooOo.f45532OooO00o != 505) {
            return;
        }
        ArrayList<MusicSelecterModel> arrayList = (ArrayList) oooOo.f45534OooO0OO;
        ArrayList<ArrayList<MusicSelecterModel>> arrayList2 = this.f26699OooOOoo;
        if (com.code.android.util.OooOo00.OooO0O0(arrayList2)) {
            arrayList2.set(this.f26702OooOo00, arrayList);
            this.f26701OooOo0 = 0;
            this.f26703OooOo0O.notifyDataSetChanged();
            this.f26703OooOo0O.Oooo00o();
            Iterator<ArrayList<MusicSelecterModel>> it = arrayList2.iterator();
            while (it.hasNext()) {
                Iterator<MusicSelecterModel> it2 = it.next().iterator();
                while (it2.hasNext()) {
                    if (it2.next().select) {
                        this.f26701OooOo0++;
                        break;
                    }
                }
            }
            this.f26697OooOOo.setEnabled(this.f26701OooOo0 > 0);
        }
    }
}
