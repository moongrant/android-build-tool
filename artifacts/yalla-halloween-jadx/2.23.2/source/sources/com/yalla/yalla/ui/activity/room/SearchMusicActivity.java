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
import p589o0oOooo.o0OO00o0;
import p650o0ooo.a;

/* JADX INFO: loaded from: classes4.dex */
public class SearchMusicActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ int f26242OooOoO0 = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public Button f26243OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public RecyclerView f26244OooOOo0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public o0O00O f26246OooOo;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public o0O000o0 f26249OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public a f26250OooOo0o;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final ArrayList<ArrayList<MusicSelecterModel>> f26245OooOOoo = new ArrayList<>();

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f26248OooOo00 = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f26247OooOo0 = 0;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SearchMusicActivity searchMusicActivity = SearchMusicActivity.this;
            Iterator<ArrayList<MusicSelecterModel>> it = searchMusicActivity.f26245OooOOoo.iterator();
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
                        p475o0Ooooo0.o0O00oO0 o0o00oo1 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
                        musicTable.user = p004OooO0oO.o0OoOo0.OooO00o();
                        musicTable.mDuration = musicSelecterModel.audio.getDuration();
                        p408o0Oo0Oo0.o00Oo0.OooO00o().OooOoO0().OooO0o(musicTable);
                    }
                }
            }
            searchMusicActivity.runOnUiThread(new o0O00O0o(searchMusicActivity));
        }
    }

    public final boolean OooOo0() {
        ArrayList<ArrayList<MusicSelecterModel>> arrayList = this.f26245OooOOoo;
        if (com.code.android.util.OooOo00.OooO00o(arrayList)) {
            return false;
        }
        Iterator<ArrayList<MusicSelecterModel>> it = arrayList.iterator();
        while (it.hasNext()) {
            Iterator<MusicSelecterModel> it2 = it.next().iterator();
            while (it2.hasNext()) {
                if (it2.next().select) {
                    p205o00o0o0o.o000O o000o = new p205o00o0o0o.o000O(this);
                    o000o.OooOo00(getString(p562o0oOo000.o000000.selected_sure_to_add));
                    o000o.OooOo0(new Function0() { // from class: com.yalla.yalla.ui.activity.room.o0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i = SearchMusicActivity.f26242OooOoO0;
                            this.f26367OooO0Oo.OooOo0O();
                            return null;
                        }
                    });
                    o000o.OooOo0O(new Function0() { // from class: com.yalla.yalla.ui.activity.room.o0O00000
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i = SearchMusicActivity.f26242OooOoO0;
                            this.f26441OooO0Oo.finish();
                            return null;
                        }
                    });
                    o000o.OooOO0o();
                    return true;
                }
            }
        }
        return false;
    }

    public final void OooOo0O() {
        if (this.f26250OooOo0o == null) {
            p650o0ooo.o00O0OO0.OooO00o().getClass();
            this.f26250OooOo0o = new a();
        }
        this.f26250OooOo0o.OooO0OO(this, com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Adding));
        new Thread(new OooO00o()).start();
    }

    public final void OooOo0o(ArrayList arrayList) {
        if (com.code.android.util.OooOo00.OooO00o(arrayList)) {
            runOnUiThread(new o0O00OO(this));
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Audio audio = (Audio) it.next();
            String strSubstring = audio.getPath().substring(0, audio.getPath().lastIndexOf("/"));
            MusicSelecterModel musicSelecterModel = new MusicSelecterModel(audio, strSubstring.substring(strSubstring.lastIndexOf("/") + 1, strSubstring.length()), strSubstring);
            ArrayList<ArrayList<MusicSelecterModel>> arrayList2 = this.f26245OooOOoo;
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
        runOnUiThread(new o0O00OO(this));
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
        setContentView(p562o0oOo000.oo0o0Oo.activity_searchmusic);
        OooOOo0(2);
        this.f22282OooOO0.setTitle(p562o0oOo000.o000000.add_music);
        this.f22282OooOO0.OooOoO0(p562o0oOo000.o000000.scan, new o0O000Oo(this));
        this.f22282OooOO0.OooOo00(new o0O0000O(0, this));
        this.f26244OooOOo0 = (RecyclerView) findViewById(p562o0oOo000.o0OO00O.rv_search_music_folders);
        this.f26243OooOOo = (Button) findViewById(p562o0oOo000.o0OO00O.bt_music_search_add);
        o0O000o0 o0o000o1 = new o0O000o0(this, p562o0oOo000.oo0o0Oo.item_scan_music_class, this.f26245OooOOoo);
        this.f26249OooOo0O = o0o000o1;
        o0o000o1.f13176OooO0o = new o0O00(this);
        o0o000o1.Oooo000(p562o0oOo000.o000000.No_music_available);
        this.f26249OooOo0O.OooOooo(p562o0oOo000.o0Oo0oo.icon_request_error_green);
        o0O000o0 o0o000o2 = this.f26249OooOo0O;
        o0o000o2.f56424OooOoO.setEmptyTextColor(p562o0oOo000.o0OOO0o.white_50);
        this.f26249OooOo0O.Oooo00O(false);
        this.f26244OooOOo0.setLayoutManager(new FixLinearLayoutManager(this));
        this.f26244OooOOo0.setAdapter(this.f26249OooOo0O);
        this.f26243OooOOo.setOnClickListener(new o0OoO00O(this));
        OooOo0o(o0OO00o0.OooO00o(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p545o0oO0O00.OooOOOO
    @Subscribe(sticky = true, threadMode = ThreadMode.POSTING)
    public void onEvent(p545o0oO0O00.OooOOO oooOOO) {
        if (oooOOO.f55758OooO00o != 505) {
            return;
        }
        ArrayList<MusicSelecterModel> arrayList = (ArrayList) oooOOO.f55760OooO0OO;
        ArrayList<ArrayList<MusicSelecterModel>> arrayList2 = this.f26245OooOOoo;
        if (com.code.android.util.OooOo00.OooO0O0(arrayList2)) {
            arrayList2.set(this.f26248OooOo00, arrayList);
            this.f26247OooOo0 = 0;
            this.f26249OooOo0O.notifyDataSetChanged();
            this.f26249OooOo0O.Oooo00o();
            Iterator<ArrayList<MusicSelecterModel>> it = arrayList2.iterator();
            while (it.hasNext()) {
                Iterator<MusicSelecterModel> it2 = it.next().iterator();
                while (it2.hasNext()) {
                    if (it2.next().select) {
                        this.f26247OooOo0++;
                        break;
                    }
                }
            }
            this.f26243OooOOo.setEnabled(this.f26247OooOo0 > 0);
        }
    }
}
