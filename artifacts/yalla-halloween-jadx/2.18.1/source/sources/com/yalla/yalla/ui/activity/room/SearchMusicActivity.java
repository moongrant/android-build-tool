package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.base.activity.BaseActivity;
import com.app.base.model.MusicSelecterModel;
import com.app.base.util.Player.Audio;
import com.weieyu.yalla.R;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.ui.activity.room.SearchMusicActivity;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import p139o00OOOo0.o0ooOOo;
import p159o00OoOO.o0000oo;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.oo0oOO0;
import p544o0o0OoOO.q6;
import p544o0o0OoOO.r6;
import p544o0o0OoOO.s6;
import p544o0o0OoOO.t6;
import p544o0o0OoOO.u6;
import p544o0o0OoOO.x6;
import p707oOooo0o.o000O;

/* JADX INFO: loaded from: classes2.dex */
public class SearchMusicActivity extends BaseActivity {

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public static final /* synthetic */ int f23016Oooooo0 = 0;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public RecyclerView f23017OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public Button f23018OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public ArrayList<ArrayList<MusicSelecterModel>> f23019OoooOoo = new ArrayList<>();

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f23020Ooooo00 = 0;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f23021Ooooo0o = 0;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public p188o00o00o0.OooO0OO<ArrayList<MusicSelecterModel>> f23022OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public o000O f23023OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public o00Ooo0O.OooO.OooO00o f23024OooooOo;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator<ArrayList<MusicSelecterModel>> it = SearchMusicActivity.this.f23019OoooOoo.iterator();
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
                        musicTable.user = kotlin.collections.unsigned.OooO00o.OooO0O0(p498o0o00Oo0.OooOOO.f41216OooO00o);
                        musicTable.mDuration = musicSelecterModel.audio.getDuration();
                        p491o0o00O00.OooO0OO.OooO00o().OooOoO().OooO0OO(musicTable);
                    }
                }
            }
            SearchMusicActivity searchMusicActivity = SearchMusicActivity.this;
            Objects.requireNonNull(searchMusicActivity);
            searchMusicActivity.runOnUiThread(new u6(searchMusicActivity));
        }
    }

    public final boolean OooOoO() {
        if (com.yalla.support.common.util.OooO0OO.OooO00o(this.f23019OoooOoo)) {
            return false;
        }
        Iterator<ArrayList<MusicSelecterModel>> it = this.f23019OoooOoo.iterator();
        while (it.hasNext()) {
            Iterator<MusicSelecterModel> it2 = it.next().iterator();
            while (it2.hasNext()) {
                if (it2.next().select) {
                    oo0oOO0 oo0ooo0 = new oo0oOO0(this);
                    oo0ooo0.OooOo0O(getString(R.string.selected_sure_to_add));
                    oo0ooo0.OooOo0o(new Function0() { // from class: o0o0OoOO.o6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            SearchMusicActivity searchMusicActivity = this.f44284Oooo0o;
                            int i = SearchMusicActivity.f23016Oooooo0;
                            searchMusicActivity.OooOoOO();
                            return null;
                        }
                    });
                    oo0ooo0.OooOo(new p159o00OoOO.OooOO0(this, 1));
                    oo0ooo0.OooOOO0();
                    return true;
                }
            }
        }
        return false;
    }

    public final void OooOoOO() {
        if (this.f23023OooooOO == null) {
            Objects.requireNonNull(o0ooOOo.OooO00o());
            this.f23023OooooOO = new o000O();
        }
        this.f23023OooooOO.OooO0OO(this, o000O0O0.OooO0OO(R.string.Adding));
        new Thread(new OooO00o()).start();
    }

    public final void OooOoo0(List<Audio> list) {
        if (com.yalla.support.common.util.OooO0OO.OooO00o(list)) {
            runOnUiThread(new x6(this));
            return;
        }
        for (Audio audio : list) {
            String strSubstring = audio.getPath().substring(0, audio.getPath().lastIndexOf("/"));
            MusicSelecterModel musicSelecterModel = new MusicSelecterModel(audio, strSubstring.substring(strSubstring.lastIndexOf("/") + 1, strSubstring.length()), strSubstring);
            if (this.f23019OoooOoo.size() == 0) {
                ArrayList<MusicSelecterModel> arrayList = new ArrayList<>();
                arrayList.add(musicSelecterModel);
                this.f23019OoooOoo.add(arrayList);
            } else {
                int size = this.f23019OoooOoo.size();
                for (int i = 0; i < size; i++) {
                    if (this.f23019OoooOoo.get(i).get(0).filePath.equals(strSubstring)) {
                        this.f23019OoooOoo.get(i).add(musicSelecterModel);
                        break;
                    }
                    if (i == this.f23019OoooOoo.size() - 1) {
                        ArrayList<MusicSelecterModel> arrayList2 = new ArrayList<>();
                        arrayList2.add(musicSelecterModel);
                        this.f23019OoooOoo.add(arrayList2);
                    }
                }
            }
        }
        runOnUiThread(new x6(this));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (OooOoO()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_searchmusic);
        OooOo0O(2);
        this.f11463OoooO.setTitle(R.string.add_music);
        this.f11463OoooO.OooOoo0(R.string.scan, new q6(this));
        this.f11463OoooO.OooOoO0(new o0000oo(this, 1));
        this.f23017OoooOo0 = (RecyclerView) findViewById(R.id.rv_search_music_folders);
        this.f23018OoooOoO = (Button) findViewById(R.id.bt_music_search_add);
        r6 r6Var = new r6(this, this.f23019OoooOoo);
        this.f23022OooooO0 = r6Var;
        r6Var.setOnItemClickListener(new s6(this));
        this.f23022OooooO0.setEmptyText(R.string.No_music_available);
        this.f23022OooooO0.setEmptyImageRes(R.drawable.icon_request_error_green);
        this.f23022OooooO0.setEmptyTextColor(R.color.white_50);
        this.f23022OooooO0.setFirstLoading(false);
        this.f23017OoooOo0.setLayoutManager(new FixLinearLayoutManager(this));
        this.f23017OoooOo0.setAdapter(this.f23022OooooO0);
        this.f23018OoooOoO.setOnClickListener(new t6(this));
        OooOoo0(p170o00Ooo0O.OooO.OooO00o(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.app.base.base.activity.BaseFragmentActivity, p140o00OOOoO.OooO0o
    @Subscribe(sticky = true, threadMode = ThreadMode.POSTING)
    public void onEvent(p140o00OOOoO.OooO0OO oooO0OO) {
        if (oooO0OO.f31885OooO00o != 505) {
            return;
        }
        ArrayList<MusicSelecterModel> arrayList = (ArrayList) oooO0OO.f31887OooO0OO;
        if (com.yalla.support.common.util.OooO0OO.OooO0O0(this.f23019OoooOoo)) {
            this.f23019OoooOoo.set(this.f23020Ooooo00, arrayList);
            this.f23021Ooooo0o = 0;
            this.f23022OooooO0.notifyDataSetChanged();
            this.f23022OooooO0.setLoadComplete();
            Iterator<ArrayList<MusicSelecterModel>> it = this.f23019OoooOoo.iterator();
            while (it.hasNext()) {
                Iterator<MusicSelecterModel> it2 = it.next().iterator();
                while (it2.hasNext()) {
                    if (it2.next().select) {
                        this.f23021Ooooo0o++;
                        break;
                    }
                }
            }
            this.f23018OoooOoO.setEnabled(this.f23021Ooooo0o > 0);
        }
    }
}
