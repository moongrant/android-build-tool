package com.google.android.exoplayer2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.android.billingclient.api.o0OO00O;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.OooO0OO;
import com.google.android.exoplayer2.OooOO0;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.device.DeviceInfo;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import p294o0O0Oo0o.o0O0O00;
import p296o0O0OoO0.o00O0O;
import p310o0O0o0oo.o000O;
import p310o0O0o0oo.o00O;
import p310o0O0o0oo.o00O00O;
import p310o0O0o0oo.o00O0O0;
import p318o0O0oOo.o00000O;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o0000oo;
import p318o0O0oOo.o000O0;
import p319o0O0oOo0.o0000OO0;
import p320o0O0oOoO.o00OO000;
import p320o0O0oOoO.o00OOO0O;
import p320o0O0oOoO.oo0o0O0;
import p321o0O0oOoo.o00OOOO0;
import p324o0O0oo0O.o0000O;
import p466o0OooO0.o0000O0;
import p466o0OooO0.o000O00;
import p466o0OooO0.o000O00O;
import p466o0OooO0.o000O0O0;
import p466o0OooO0.o000OO00;
import p466o0OooO0.o000OO0O;
import p466o0OooO0.o000OOo;
import p466o0OooO0.o000OOo0;
import p466o0OooO0.o000Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 extends OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final CopyOnWriteArraySet<p291o0O0Oo.OooO0O0> f13421OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Renderer[] f13422OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOO0 f13423OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0O0 f13424OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final CopyOnWriteArraySet<p293o0O0Oo0O.OooOOOO> f13425OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final CopyOnWriteArraySet<o00OO000> f13426OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final CopyOnWriteArraySet<o0000O> f13427OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final CopyOnWriteArraySet<o0O0o0.OooO0o> f13428OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final CopyOnWriteArraySet<o00OOO0O> f13429OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final CopyOnWriteArraySet<com.google.android.exoplayer2.audio.OooO00o> f13430OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final p292o0O0Oo0.OooO0OO f13431OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final AudioFocusManager f13432OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final com.google.android.exoplayer2.OooO0O0 f13433OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final Oooo0 f13434OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final o000OO00 f13435OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public Surface f13436OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final o000OOo0 f13437OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f13438OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f13439OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public TextureView f13440OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f13441OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f13442OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f13443OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public float f13444OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public p293o0O0Oo0O.OooOOO0 f13445OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f13446OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f13447OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public List<Cue> f13448OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f13449OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public DeviceInfo f13450OooOooo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public Looper f13451OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f13452OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000OO0O f13453OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public o00000O f13454OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o0000OO0 f13455OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public o000OOo f13456OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public o00O0O0 f13457OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public p709oo0oOOo.OooO f13458OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public p292o0O0Oo0.OooO0OO f13459OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public p293o0O0Oo0O.OooOOO0 f13460OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f13461OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public boolean f13462OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public boolean f13463OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public o000O0O0 f13464OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public boolean f13465OooOOOO;

        public OooO00o(Context context, o000OO0O o000oo0o2, o00O0O o00o0o2) {
            DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(context);
            o000O o000o = new o000O(new com.google.android.exoplayer2.upstream.OooO0OO(context), o00o0o2);
            o000OOo o000ooo2 = new o000OOo();
            p709oo0oOOo.OooOo oooOoOooOO0 = p709oo0oOOo.OooOo.OooOO0(context);
            o000O0 o000o0 = o00000O.f36668OooO00o;
            p292o0O0Oo0.OooO0OO oooO0OO = new p292o0O0Oo0.OooO0OO();
            this.f13452OooO00o = context;
            this.f13453OooO0O0 = o000oo0o2;
            this.f13455OooO0Oo = defaultTrackSelector;
            this.f13457OooO0o0 = o000o;
            this.f13456OooO0o = o000ooo2;
            this.f13458OooO0oO = oooOoOooOO0;
            this.f13459OooO0oo = oooO0OO;
            this.f13451OooO = p318o0O0oOo.o000OOo0.OooOOOo();
            this.f13460OooOO0 = p293o0O0Oo0O.OooOOO0.f35743OooO0o;
            this.f13461OooOO0O = 1;
            this.f13462OooOO0o = true;
            this.f13464OooOOO0 = o000O0O0.f40534OooO0OO;
            this.f13454OooO0OO = o000o0;
            this.f13463OooOOO = true;
        }
    }

    public final class OooO0O0 implements o00OOO0O, com.google.android.exoplayer2.audio.OooO00o, o0000O, o0O0o0.OooO0o, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, AudioFocusManager.OooO0O0, com.google.android.exoplayer2.OooO0O0.InterfaceC0095OooO0O0, Oooo0.OooO00o, Player.OooO00o {
        public OooO0O0() {
        }

        @Override // com.google.android.exoplayer2.Player.OooO00o
        public final /* synthetic */ void OooO(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO00o
        public final /* synthetic */ void OooO00o() {
        }

        @Override // com.google.android.exoplayer2.audio.OooO00o
        public final void OooO0O0(int i) {
            Oooo000 oooo000 = Oooo000.this;
            if (oooo000.f13439OooOo == i) {
                return;
            }
            oooo000.f13439OooOo = i;
            for (p293o0O0Oo0O.OooOOOO oooOOOO : oooo000.f13425OooO0o) {
                if (!oooo000.f13430OooOO0O.contains(oooOOOO)) {
                    oooOOOO.OooO0O0(oooo000.f13439OooOo);
                }
            }
            Iterator<com.google.android.exoplayer2.audio.OooO00o> it = oooo000.f13430OooOO0O.iterator();
            while (it.hasNext()) {
                it.next().OooO0O0(oooo000.f13439OooOo);
            }
        }

        @Override // com.google.android.exoplayer2.Player.OooO00o
        public final /* synthetic */ void OooO0OO() {
        }

        @Override // p320o0O0oOoO.o00OOO0O
        public final void OooO0Oo(int i, int i2, int i3, float f) {
            for (o00OO000 o00oo001 : Oooo000.this.f13426OooO0o0) {
                if (!Oooo000.this.f13429OooOO0.contains(o00oo001)) {
                    o00oo001.OooO0Oo(i, i2, i3, f);
                }
            }
            Iterator<o00OOO0O> it = Oooo000.this.f13429OooOO0.iterator();
            while (it.hasNext()) {
                it.next().OooO0Oo(i, i2, i3, f);
            }
        }

        @Override // com.google.android.exoplayer2.audio.OooO00o
        public final void OooO0o(boolean z) {
            Oooo000 oooo000 = Oooo000.this;
            if (oooo000.f13446OooOoOO == z) {
                return;
            }
            oooo000.f13446OooOoOO = z;
            for (p293o0O0Oo0O.OooOOOO oooOOOO : oooo000.f13425OooO0o) {
                if (!oooo000.f13430OooOO0O.contains(oooOOOO)) {
                    oooOOOO.OooO0o(oooo000.f13446OooOoOO);
                }
            }
            Iterator<com.google.android.exoplayer2.audio.OooO00o> it = oooo000.f13430OooOO0O.iterator();
            while (it.hasNext()) {
                it.next().OooO0o(oooo000.f13446OooOoOO);
            }
        }

        @Override // p324o0O0oo0O.o0000O
        public final void OooO0o0(List<Cue> list) {
            Oooo000 oooo000 = Oooo000.this;
            oooo000.f13448OooOoo0 = list;
            Iterator<o0000O> it = oooo000.f13427OooO0oO.iterator();
            while (it.hasNext()) {
                it.next().OooO0o0(list);
            }
        }

        @Override // com.google.android.exoplayer2.Player.OooO00o
        public final /* synthetic */ void OooO0oO(int i) {
        }

        @Override // p320o0O0oOoO.o00OOO0O
        public final void OooOO0(String str, long j, long j2) {
            Iterator<o00OOO0O> it = Oooo000.this.f13429OooOO0.iterator();
            while (it.hasNext()) {
                it.next().OooOO0(str, j, j2);
            }
        }

        @Override // com.google.android.exoplayer2.Player.OooO00o
        public final /* synthetic */ void OooOO0O(o000O00 o000o01) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO00o
        public final /* synthetic */ void OooOO0o(ExoPlaybackException exoPlaybackException) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO00o
        public final /* synthetic */ void OooOOO(o000oOoO o000oooo2, int i) {
            o000O00O.OooO00o(this, o000oooo2, i);
        }

        @Override // com.google.android.exoplayer2.Player.OooO00o
        public final void OooOOO0(boolean z) {
            Objects.requireNonNull(Oooo000.this);
        }

        @Override // p320o0O0oOoO.o00OOO0O
        public final void OooOOo(Surface surface) {
            Oooo000 oooo000 = Oooo000.this;
            if (oooo000.f13436OooOOo == surface) {
                Iterator<o00OO000> it = oooo000.f13426OooO0o0.iterator();
                while (it.hasNext()) {
                    it.next().OooO0o0();
                }
            }
            Iterator<o00OOO0O> it2 = Oooo000.this.f13429OooOO0.iterator();
            while (it2.hasNext()) {
                it2.next().OooOOo(surface);
            }
        }

        @Override // com.google.android.exoplayer2.Player.OooO00o
        public final void OooOOo0(int i) {
            Oooo000.OooO(Oooo000.this);
        }

        @Override // com.google.android.exoplayer2.Player.OooO00o
        public final /* synthetic */ void OooOOoo() {
        }

        @Override // com.google.android.exoplayer2.audio.OooO00o
        public final void OooOo0(o0O0O00 o0o0o00) {
            Objects.requireNonNull(Oooo000.this);
            Iterator<com.google.android.exoplayer2.audio.OooO00o> it = Oooo000.this.f13430OooOO0O.iterator();
            while (it.hasNext()) {
                it.next().OooOo0(o0o0o00);
            }
        }

        @Override // com.google.android.exoplayer2.audio.OooO00o
        public final void OooOo00(String str, long j, long j2) {
            Iterator<com.google.android.exoplayer2.audio.OooO00o> it = Oooo000.this.f13430OooOO0O.iterator();
            while (it.hasNext()) {
                it.next().OooOo00(str, j, j2);
            }
        }

        @Override // o0O0o0.OooO0o
        public final void OooOo0o(Metadata metadata) {
            Iterator<o0O0o0.OooO0o> it = Oooo000.this.f13428OooO0oo.iterator();
            while (it.hasNext()) {
                it.next().OooOo0o(metadata);
            }
        }

        @Override // p320o0O0oOoO.o00OOO0O
        public final void OooOoO0(int i, long j) {
            Iterator<o00OOO0O> it = Oooo000.this.f13429OooOO0.iterator();
            while (it.hasNext()) {
                it.next().OooOoO0(i, j);
            }
        }

        @Override // com.google.android.exoplayer2.Player.OooO00o
        public final /* synthetic */ void OooOoOO(boolean z, int i) {
        }

        @Override // p320o0O0oOoO.o00OOO0O
        public final void OooOoo0(o0O0O00 o0o0o00) {
            Iterator<o00OOO0O> it = Oooo000.this.f13429OooOO0.iterator();
            while (it.hasNext()) {
                it.next().OooOoo0(o0o0o00);
            }
            Objects.requireNonNull(Oooo000.this);
            Objects.requireNonNull(Oooo000.this);
        }

        @Override // com.google.android.exoplayer2.Player.OooO00o
        public final /* synthetic */ void OooOooO(OooOOO oooOOO, int i) {
        }

        @Override // p320o0O0oOoO.o00OOO0O
        public final void Oooo(o0O0O00 o0o0o00) {
            Objects.requireNonNull(Oooo000.this);
            Iterator<o00OOO0O> it = Oooo000.this.f13429OooOO0.iterator();
            while (it.hasNext()) {
                it.next().Oooo(o0o0o00);
            }
        }

        @Override // p320o0O0oOoO.o00OOO0O
        public final void Oooo000(Format format) {
            Objects.requireNonNull(Oooo000.this);
            Iterator<o00OOO0O> it = Oooo000.this.f13429OooOO0.iterator();
            while (it.hasNext()) {
                it.next().Oooo000(format);
            }
        }

        @Override // com.google.android.exoplayer2.audio.OooO00o
        public final void Oooo00o(long j) {
            Iterator<com.google.android.exoplayer2.audio.OooO00o> it = Oooo000.this.f13430OooOO0O.iterator();
            while (it.hasNext()) {
                it.next().Oooo00o(j);
            }
        }

        @Override // com.google.android.exoplayer2.audio.OooO00o
        public final void Oooo0O0(Format format) {
            Objects.requireNonNull(Oooo000.this);
            Iterator<com.google.android.exoplayer2.audio.OooO00o> it = Oooo000.this.f13430OooOO0O.iterator();
            while (it.hasNext()) {
                it.next().Oooo0O0(format);
            }
        }

        @Override // com.google.android.exoplayer2.Player.OooO00o
        public final void Oooo0OO(boolean z, int i) {
            Oooo000.OooO(Oooo000.this);
        }

        @Override // com.google.android.exoplayer2.Player.OooO00o
        public final /* synthetic */ void Oooo0o0(TrackGroupArray trackGroupArray, p319o0O0oOo0.o0000O o0000o2) {
        }

        @Override // com.google.android.exoplayer2.audio.OooO00o
        public final void Oooo0oo(o0O0O00 o0o0o00) {
            Iterator<com.google.android.exoplayer2.audio.OooO00o> it = Oooo000.this.f13430OooOO0O.iterator();
            while (it.hasNext()) {
                it.next().Oooo0oo(o0o0o00);
            }
            Objects.requireNonNull(Oooo000.this);
            Objects.requireNonNull(Oooo000.this);
            Oooo000.this.f13439OooOo = 0;
        }

        @Override // com.google.android.exoplayer2.Player.OooO00o
        public final /* synthetic */ void OoooO(boolean z) {
        }

        @Override // com.google.android.exoplayer2.audio.OooO00o
        public final void OoooO00(int i, long j, long j2) {
            Iterator<com.google.android.exoplayer2.audio.OooO00o> it = Oooo000.this.f13430OooOO0O.iterator();
            while (it.hasNext()) {
                it.next().OoooO00(i, j, j2);
            }
        }

        @Override // p320o0O0oOoO.o00OOO0O
        public final void OoooO0O(long j, int i) {
            Iterator<o00OOO0O> it = Oooo000.this.f13429OooOO0.iterator();
            while (it.hasNext()) {
                it.next().OoooO0O(j, i);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            Oooo000.this.OooOOoo(new Surface(surfaceTexture), true);
            Oooo000.this.OooOO0o(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            Oooo000.this.OooOOoo(null, true);
            Oooo000.this.OooOO0o(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            Oooo000.this.OooOO0o(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            Oooo000.this.OooOO0o(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            Oooo000.this.OooOOoo(surfaceHolder.getSurface(), false);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            Oooo000.this.OooOOoo(null, false);
            Oooo000.this.OooOO0o(0, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:25:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:27:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:30:0x01f3 A[LOOP:0: B:28:0x01ed->B:30:0x01f3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x022d  */
    public Oooo000(OooO00o oooO00o) {
        int i;
        p293o0O0Oo0O.OooOOO oooOOO;
        AudioFocusManager audioFocusManager;
        Oooo0 oooo0;
        int iOooOo0;
        OooO0O0 oooO0O0;
        DeviceInfo deviceInfo;
        Iterator<p291o0O0Oo.OooO0O0> it;
        p292o0O0Oo0.OooO0OO oooO0OO = oooO00o.f13459OooO0oo;
        this.f13431OooOO0o = oooO0OO;
        this.f13445OooOoO0 = oooO00o.f13460OooOO0;
        this.f13441OooOo00 = oooO00o.f13461OooOO0O;
        this.f13446OooOoOO = false;
        OooO0O0 oooO0O1 = new OooO0O0();
        this.f13424OooO0Oo = oooO0O1;
        CopyOnWriteArraySet<o00OO000> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        this.f13426OooO0o0 = copyOnWriteArraySet;
        CopyOnWriteArraySet<p293o0O0Oo0O.OooOOOO> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
        this.f13425OooO0o = copyOnWriteArraySet2;
        this.f13427OooO0oO = new CopyOnWriteArraySet<>();
        CopyOnWriteArraySet<o0O0o0.OooO0o> copyOnWriteArraySet3 = new CopyOnWriteArraySet<>();
        this.f13428OooO0oo = copyOnWriteArraySet3;
        this.f13421OooO = new CopyOnWriteArraySet<>();
        CopyOnWriteArraySet<o00OOO0O> copyOnWriteArraySet4 = new CopyOnWriteArraySet<>();
        this.f13429OooOO0 = copyOnWriteArraySet4;
        CopyOnWriteArraySet<com.google.android.exoplayer2.audio.OooO00o> copyOnWriteArraySet5 = new CopyOnWriteArraySet<>();
        this.f13430OooOO0O = copyOnWriteArraySet5;
        Handler handler = new Handler(oooO00o.f13451OooO);
        DefaultRenderersFactory defaultRenderersFactory = (DefaultRenderersFactory) oooO00o.f13453OooO0O0;
        Objects.requireNonNull(defaultRenderersFactory);
        ArrayList arrayList = new ArrayList();
        oo0o0O0 oo0o0o0 = new oo0o0O0(defaultRenderersFactory.f13110OooO00o, defaultRenderersFactory.f13111OooO0O0, handler, oooO0O1);
        oo0o0o0.f14397o0000oOO = 0;
        arrayList.add(oo0o0o0);
        Context context = defaultRenderersFactory.f13110OooO00o;
        p293o0O0Oo0O.OooOOO oooOOO2 = p293o0O0Oo0O.OooOOO.f35739OooO0OO;
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        if (p318o0O0oOo.o000OOo0.f36740OooO00o >= 17 && "Amazon".equals(p318o0O0oOo.o000OOo0.f36742OooO0OO)) {
            i = 0;
            oooOOO = Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1 ? p293o0O0Oo0O.OooOOO.f35740OooO0Oo : oooOOO;
            com.google.android.exoplayer2.audio.OooOO0 oooOO1 = new com.google.android.exoplayer2.audio.OooOO0(defaultRenderersFactory.f13110OooO00o, defaultRenderersFactory.f13111OooO0O0, handler, oooO0O1, new DefaultAudioSink(oooOOO, new DefaultAudioSink.OooO0o(new AudioProcessor[0])));
            oooOO1.f14397o0000oOO = 0;
            arrayList.add(oooOO1);
            arrayList.add(new p324o0O0oo0O.o0000OO0(oooO0O1, handler.getLooper()));
            arrayList.add(new com.google.android.exoplayer2.metadata.OooO00o(oooO0O1, handler.getLooper()));
            arrayList.add(new o00OOOO0());
            Renderer[] rendererArr = (Renderer[]) arrayList.toArray(new Renderer[0]);
            this.f13422OooO0O0 = rendererArr;
            this.f13444OooOoO = 1.0f;
            this.f13439OooOo = 0;
            this.f13448OooOoo0 = Collections.emptyList();
            OooOO0 oooOO2 = new OooOO0(rendererArr, oooO00o.f13455OooO0Oo, oooO00o.f13457OooO0o0, oooO00o.f13456OooO0o, oooO00o.f13458OooO0oO, oooO0OO, oooO00o.f13462OooOO0o, oooO00o.f13464OooOOO0, oooO00o.f13454OooO0OO, oooO00o.f13451OooO);
            this.f13423OooO0OO = oooOO2;
            oooOO2.OooO(oooO0O1);
            copyOnWriteArraySet4.add(oooO0OO);
            copyOnWriteArraySet.add(oooO0OO);
            copyOnWriteArraySet5.add(oooO0OO);
            copyOnWriteArraySet2.add(oooO0OO);
            Objects.requireNonNull(oooO0OO);
            copyOnWriteArraySet3.add(oooO0OO);
            com.google.android.exoplayer2.OooO0O0 oooO0O2 = new com.google.android.exoplayer2.OooO0O0(oooO00o.f13452OooO00o, handler, oooO0O1);
            this.f13433OooOOO0 = oooO0O2;
            oooO0O2.OooO00o();
            audioFocusManager = new AudioFocusManager(oooO00o.f13452OooO00o, handler, oooO0O1);
            this.f13432OooOOO = audioFocusManager;
            if (!p318o0O0oOo.o000OOo0.OooO00o(audioFocusManager.f13098OooO0Oo, null)) {
                audioFocusManager.f13098OooO0Oo = null;
                audioFocusManager.f13099OooO0o = 0;
            }
            oooo0 = new Oooo0(oooO00o.f13452OooO00o, handler, oooO0O1);
            this.f13434OooOOOO = oooo0;
            iOooOo0 = p318o0O0oOo.o000OOo0.OooOo0(this.f13445OooOoO0.f35746OooO0OO);
            if (oooo0.f13416OooO0o != iOooOo0) {
                oooo0.f13416OooO0o = iOooOo0;
                oooo0.OooO0OO();
                oooO0O0 = (OooO0O0) oooo0.f13414OooO0OO;
                Oooo0 oooo1 = Oooo000.this.f13434OooOOOO;
                deviceInfo = new DeviceInfo(oooo1.OooO00o(), oooo1.f13415OooO0Oo.getStreamMaxVolume(oooo1.f13416OooO0o));
                if (!deviceInfo.equals(Oooo000.this.f13450OooOooo)) {
                    Oooo000 oooo000 = Oooo000.this;
                    oooo000.f13450OooOooo = deviceInfo;
                    it = oooo000.f13421OooO.iterator();
                    while (it.hasNext()) {
                        it.next().OooO0O0();
                    }
                }
            }
            o000OO00 o000oo01 = new o000OO00(oooO00o.f13452OooO00o);
            this.f13435OooOOOo = o000oo01;
            o000oo01.f40541OooO00o = false;
            o000OOo0 o000ooo1 = new o000OOo0(oooO00o.f13452OooO00o);
            this.f13437OooOOo0 = o000ooo1;
            o000ooo1.f40552OooO00o = false;
            Oooo0 oooo2 = this.f13434OooOOOO;
            this.f13450OooOooo = new DeviceInfo(oooo2.OooO00o(), oooo2.f13415OooO0Oo.getStreamMaxVolume(oooo2.f13416OooO0o));
            if (!oooO00o.f13463OooOOO) {
                this.f13423OooO0OO.f13217OooO0oO.f13336o0OOO0o = false;
            }
            OooOOOo(1, 3, this.f13445OooOoO0);
            OooOOOo(2, 4, Integer.valueOf(this.f13441OooOo00));
            OooOOOo(1, 101, Boolean.valueOf(this.f13446OooOoOO));
        }
        i = 0;
        oooOOO = (intentRegisterReceiver == null || intentRegisterReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", i) == 0) ? p293o0O0Oo0O.OooOOO.f35739OooO0OO : new p293o0O0Oo0O.OooOOO(intentRegisterReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), intentRegisterReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        com.google.android.exoplayer2.audio.OooOO0 oooOO3 = new com.google.android.exoplayer2.audio.OooOO0(defaultRenderersFactory.f13110OooO00o, defaultRenderersFactory.f13111OooO0O0, handler, oooO0O1, new DefaultAudioSink(oooOOO, new DefaultAudioSink.OooO0o(new AudioProcessor[0])));
        oooOO3.f14397o0000oOO = 0;
        arrayList.add(oooOO3);
        arrayList.add(new p324o0O0oo0O.o0000OO0(oooO0O1, handler.getLooper()));
        arrayList.add(new com.google.android.exoplayer2.metadata.OooO00o(oooO0O1, handler.getLooper()));
        arrayList.add(new o00OOOO0());
        Renderer[] rendererArr2 = (Renderer[]) arrayList.toArray(new Renderer[0]);
        this.f13422OooO0O0 = rendererArr2;
        this.f13444OooOoO = 1.0f;
        this.f13439OooOo = 0;
        this.f13448OooOoo0 = Collections.emptyList();
        OooOO0 oooOO4 = new OooOO0(rendererArr2, oooO00o.f13455OooO0Oo, oooO00o.f13457OooO0o0, oooO00o.f13456OooO0o, oooO00o.f13458OooO0oO, oooO0OO, oooO00o.f13462OooOO0o, oooO00o.f13464OooOOO0, oooO00o.f13454OooO0OO, oooO00o.f13451OooO);
        this.f13423OooO0OO = oooOO4;
        oooOO4.OooO(oooO0O1);
        copyOnWriteArraySet4.add(oooO0OO);
        copyOnWriteArraySet.add(oooO0OO);
        copyOnWriteArraySet5.add(oooO0OO);
        copyOnWriteArraySet2.add(oooO0OO);
        Objects.requireNonNull(oooO0OO);
        copyOnWriteArraySet3.add(oooO0OO);
        com.google.android.exoplayer2.OooO0O0 oooO0O3 = new com.google.android.exoplayer2.OooO0O0(oooO00o.f13452OooO00o, handler, oooO0O1);
        this.f13433OooOOO0 = oooO0O3;
        oooO0O3.OooO00o();
        audioFocusManager = new AudioFocusManager(oooO00o.f13452OooO00o, handler, oooO0O1);
        this.f13432OooOOO = audioFocusManager;
        if (!p318o0O0oOo.o000OOo0.OooO00o(audioFocusManager.f13098OooO0Oo, null)) {
            audioFocusManager.f13098OooO0Oo = null;
            audioFocusManager.f13099OooO0o = 0;
        }
        oooo0 = new Oooo0(oooO00o.f13452OooO00o, handler, oooO0O1);
        this.f13434OooOOOO = oooo0;
        iOooOo0 = p318o0O0oOo.o000OOo0.OooOo0(this.f13445OooOoO0.f35746OooO0OO);
        if (oooo0.f13416OooO0o != iOooOo0) {
            oooo0.f13416OooO0o = iOooOo0;
            oooo0.OooO0OO();
            oooO0O0 = (OooO0O0) oooo0.f13414OooO0OO;
            Oooo0 oooo3 = Oooo000.this.f13434OooOOOO;
            deviceInfo = new DeviceInfo(oooo3.OooO00o(), oooo3.f13415OooO0Oo.getStreamMaxVolume(oooo3.f13416OooO0o));
            if (!deviceInfo.equals(Oooo000.this.f13450OooOooo)) {
                Oooo000 oooo001 = Oooo000.this;
                oooo001.f13450OooOooo = deviceInfo;
                it = oooo001.f13421OooO.iterator();
                while (it.hasNext()) {
                    it.next().OooO0O0();
                }
            }
        }
        o000OO00 o000oo02 = new o000OO00(oooO00o.f13452OooO00o);
        this.f13435OooOOOo = o000oo02;
        o000oo02.f40541OooO00o = false;
        o000OOo0 o000ooo2 = new o000OOo0(oooO00o.f13452OooO00o);
        this.f13437OooOOo0 = o000ooo2;
        o000ooo2.f40552OooO00o = false;
        Oooo0 oooo4 = this.f13434OooOOOO;
        this.f13450OooOooo = new DeviceInfo(oooo4.OooO00o(), oooo4.f13415OooO0Oo.getStreamMaxVolume(oooo4.f13416OooO0o));
        if (!oooO00o.f13463OooOOO) {
            this.f13423OooO0OO.f13217OooO0oO.f13336o0OOO0o = false;
        }
        OooOOOo(1, 3, this.f13445OooOoO0);
        OooOOOo(2, 4, Integer.valueOf(this.f13441OooOo00));
        OooOOOo(1, 101, Boolean.valueOf(this.f13446OooOoOO));
    }

    public static void OooO(Oooo000 oooo000) {
        oooo000.OooOo0o();
        int i = oooo000.f13423OooO0OO.f13233OooOo0o.f40559OooO0Oo;
        if (i != 1) {
            if (i == 2 || i == 3) {
                oooo000.f13435OooOOOo.OooO00o(oooo000.OooOO0());
                oooo000.f13437OooOOo0.OooO00o(oooo000.OooOO0());
                return;
            } else if (i != 4) {
                throw new IllegalStateException();
            }
        }
        oooo000.f13435OooOOOo.OooO00o(false);
        oooo000.f13437OooOOo0.OooO00o(false);
    }

    public static int OooOO0O(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean OooO00o() {
        OooOo0o();
        return this.f13423OooO0OO.OooO00o();
    }

    @Override // com.google.android.exoplayer2.Player
    public final long OooO0O0() {
        OooOo0o();
        return C.OooO0O0(this.f13423OooO0OO.f13233OooOo0o.f40569OooOOOO);
    }

    @Override // com.google.android.exoplayer2.Player
    public final int OooO0OO() {
        OooOo0o();
        return this.f13423OooO0OO.OooO0OO();
    }

    @Override // com.google.android.exoplayer2.Player
    public final int OooO0Oo() {
        OooOo0o();
        return this.f13423OooO0OO.OooO0Oo();
    }

    @Override // com.google.android.exoplayer2.Player
    public final long OooO0o() {
        OooOo0o();
        return this.f13423OooO0OO.OooO0o();
    }

    @Override // com.google.android.exoplayer2.Player
    public final int OooO0o0() {
        OooOo0o();
        return this.f13423OooO0OO.OooO0o0();
    }

    @Override // com.google.android.exoplayer2.Player
    public final int OooO0oO() {
        OooOo0o();
        return this.f13423OooO0OO.OooO0oO();
    }

    @Override // com.google.android.exoplayer2.Player
    public final o000oOoO OooO0oo() {
        OooOo0o();
        return this.f13423OooO0OO.f13233OooOo0o.f40556OooO00o;
    }

    public final boolean OooOO0() {
        OooOo0o();
        return this.f13423OooO0OO.f13233OooOo0o.f40564OooOO0;
    }

    public final void OooOO0o(int i, int i2) {
        if (i == this.f13442OooOo0O && i2 == this.f13443OooOo0o) {
            return;
        }
        this.f13442OooOo0O = i;
        this.f13443OooOo0o = i2;
        Iterator<o00OO000> it = this.f13426OooO0o0.iterator();
        while (it.hasNext()) {
            it.next().Oooo0oO(i, i2);
        }
    }

    public final void OooOOO() {
        String str;
        boolean z;
        OooOo0o();
        this.f13433OooOOO0.OooO00o();
        Oooo0 oooo0 = this.f13434OooOOOO;
        if (!oooo0.f13411OooO) {
            oooo0.f13412OooO00o.unregisterReceiver(oooo0.f13417OooO0o0);
            oooo0.f13411OooO = true;
        }
        boolean z2 = false;
        this.f13435OooOOOo.f40542OooO0O0 = false;
        this.f13437OooOOo0.f40553OooO0O0 = false;
        AudioFocusManager audioFocusManager = this.f13432OooOOO;
        audioFocusManager.f13097OooO0OO = null;
        audioFocusManager.OooO00o();
        OooOO0 oooOO1 = this.f13423OooO0OO;
        Objects.requireNonNull(oooOO1);
        String hexString = Integer.toHexString(System.identityHashCode(oooOO1));
        String str2 = p318o0O0oOo.o000OOo0.f36745OooO0o0;
        String str3 = o0000O0.f40504OooO00o;
        synchronized (o0000O0.class) {
            str = o0000O0.f40505OooO0O0;
        }
        StringBuilder sb = new StringBuilder(o0OO00O.OooO00o(str, o0OO00O.OooO00o(str2, o0OO00O.OooO00o(hexString, 36))));
        sb.append("Release ");
        sb.append(hexString);
        sb.append(" [");
        sb.append("ExoPlayerLib/2.12.1");
        OooO0O0.OooO0O0.OooO00o(sb, "] [", str2, "] [", str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        OooOOO0 oooOOO0 = oooOO1.f13217OooO0oO;
        synchronized (oooOOO0) {
            if (oooOOO0.f13326OoooooO || !oooOOO0.f13309OoooO.isAlive()) {
                z = true;
            } else {
                oooOOO0.f13312OoooO0O.OooO0OO(7);
                synchronized (oooOOO0) {
                    while (!Boolean.valueOf(oooOOO0.f13326OoooooO).booleanValue()) {
                        try {
                            oooOOO0.wait();
                        } catch (InterruptedException unused) {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    z = oooOOO0.f13326OoooooO;
                }
            }
        }
        if (!z) {
            final CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(oooOO1.f13211OooO);
            oooOO1.OooOOO(new Runnable() { // from class: o0OooO0.o000000O

                /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
                public final /* synthetic */ OooO0OO.OooO0O0 f40485Oooo0oO = new OooO0OO.OooO0O0() { // from class: o0O0O0o0.OooO0O0
                    @Override // com.google.android.exoplayer2.OooO0OO.OooO0O0
                    public final void OooO0OO(Player.OooO00o oooO00o) {
                        oooO00o.OooOO0o(new ExoPlaybackException(5, new TimeoutException("Player release timed out."), null, -1, null, 4, 1));
                    }
                };

                @Override // java.lang.Runnable
                public final void run() {
                    OooOO0.OooOO0o(copyOnWriteArrayList, this.f40485Oooo0oO);
                }
            });
        }
        oooOO1.f13216OooO0o0.removeCallbacksAndMessages(null);
        p292o0O0Oo0.OooO0OO oooO0OO = oooOO1.f13224OooOOOO;
        if (oooO0OO != null) {
            oooOO1.f13227OooOOo0.OooO0oO(oooO0OO);
        }
        o000Oo0 o000oo0OooO0o = oooOO1.f13233OooOo0o.OooO0o(1);
        oooOO1.f13233OooOo0o = o000oo0OooO0o;
        o000Oo0 o000oo0OooO00o = o000oo0OooO0o.OooO00o(o000oo0OooO0o.f40557OooO0O0);
        oooOO1.f13233OooOo0o = o000oo0OooO00o;
        o000oo0OooO00o.f40567OooOOO = o000oo0OooO00o.f40570OooOOOo;
        oooOO1.f13233OooOo0o.f40569OooOOOO = 0L;
        OooOOOO();
        Surface surface = this.f13436OooOOo;
        if (surface != null) {
            if (this.f13438OooOOoo) {
                surface.release();
            }
            this.f13436OooOOo = null;
        }
        if (this.f13449OooOooO) {
            throw null;
        }
        this.f13448OooOoo0 = Collections.emptyList();
    }

    public final void OooOOO0() {
        OooOo0o();
        boolean zOooOO0 = OooOO0();
        int iOooO0Oo = this.f13432OooOOO.OooO0Oo(zOooOO0, 2);
        OooOo0O(zOooOO0, iOooO0Oo, OooOO0O(zOooOO0, iOooO0Oo));
        OooOO0 oooOO1 = this.f13423OooO0OO;
        o000Oo0 o000oo1 = oooOO1.f13233OooOo0o;
        if (o000oo1.f40559OooO0Oo != 1) {
            return;
        }
        o000Oo0 o000oo0OooO0o0 = o000oo1.OooO0o0(null);
        o000Oo0 o000oo0OooO0o = o000oo0OooO0o0.OooO0o(o000oo0OooO0o0.f40556OooO00o.OooOOOO() ? 4 : 2);
        oooOO1.f13226OooOOo++;
        oooOO1.f13217OooO0oO.f13312OoooO0O.f36728OooO00o.obtainMessage(0).sendToTarget();
        oooOO1.OooOOo(o000oo0OooO0o, false, 4, 1, 1);
    }

    public final void OooOOOO() {
        TextureView textureView = this.f13440OooOo0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f13424OooO0Oo) {
                Log.w("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f13440OooOo0.setSurfaceTextureListener(null);
            }
            this.f13440OooOo0 = null;
        }
    }

    public final void OooOOOo(int i, int i2, @Nullable Object obj) {
        for (Renderer renderer : this.f13422OooO0O0) {
            if (renderer.OooOo() == i) {
                OooOO0 oooOO1 = this.f13423OooO0OO;
                OooOo oooOo = new OooOo(oooOO1.f13217OooO0oO, renderer, oooOO1.f13233OooOo0o.f40556OooO00o, oooOO1.OooO0o0(), oooOO1.f13218OooO0oo);
                o00000O0.OooO0Oo(!oooOo.f13387OooO0oo);
                oooOo.f13383OooO0Oo = i2;
                o00000O0.OooO0Oo(!oooOo.f13387OooO0oo);
                oooOo.f13385OooO0o0 = obj;
                oooOo.OooO0O0();
            }
        }
    }

    public final void OooOOo(boolean z) {
        OooOo0o();
        AudioFocusManager audioFocusManager = this.f13432OooOOO;
        OooOo0o();
        int iOooO0Oo = audioFocusManager.OooO0Oo(z, this.f13423OooO0OO.f13233OooOo0o.f40559OooO0Oo);
        OooOo0O(z, iOooO0Oo, OooOO0O(z, iOooO0Oo));
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.OooOO0$OooO00o>] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.OooOO0$OooO00o>] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.OooOO0$OooO00o>] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void OooOOo0(o00O00O o00o00o2) {
        OooOo0o();
        Objects.requireNonNull(this.f13431OooOO0o);
        OooOO0 oooOO1 = this.f13423OooO0OO;
        Objects.requireNonNull(oooOO1);
        List listSingletonList = Collections.singletonList(o00o00o2);
        listSingletonList.size();
        for (int i = 0; i < listSingletonList.size(); i++) {
            Objects.requireNonNull((o00O00O) listSingletonList.get(i));
        }
        oooOO1.OooOO0();
        oooOO1.getCurrentPosition();
        oooOO1.f13226OooOOo++;
        if (!oooOO1.f13221OooOO0o.isEmpty()) {
            oooOO1.OooOOOO(oooOO1.f13221OooOO0o.size());
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < listSingletonList.size(); i2++) {
            OooOo00.OooO0OO oooO0OO = new OooOo00.OooO0OO((o00O00O) listSingletonList.get(i2), oooOO1.f13223OooOOO0);
            arrayList.add(oooO0OO);
            oooOO1.f13221OooOO0o.add(i2 + 0, new OooOO0.OooO00o(oooO0OO.f13407OooO0O0, oooO0OO.f13406OooO00o.f36310OooOOO));
        }
        o00O o00oOooO0o = oooOO1.f13232OooOo0O.OooO0o(arrayList.size());
        oooOO1.f13232OooOo0O = o00oOooO0o;
        p466o0OooO0.o000O0 o000o0 = new p466o0OooO0.o000O0(oooOO1.f13221OooOO0o, o00oOooO0o);
        if (!o000o0.OooOOOO() && -1 >= o000o0.f40525OooO0o0) {
            throw new IllegalSeekPositionException();
        }
        int iOooO00o = o000o0.OooO00o(false);
        o000Oo0 o000oo0OooOOO0 = oooOO1.OooOOO0(oooOO1.f13233OooOo0o, o000o0, oooOO1.OooOO0O(o000o0, iOooO00o, -9223372036854775807L));
        int i3 = o000oo0OooOOO0.f40559OooO0Oo;
        if (iOooO00o != -1 && i3 != 1) {
            i3 = (o000o0.OooOOOO() || iOooO00o >= o000o0.f40525OooO0o0) ? 4 : 2;
        }
        o000Oo0 o000oo0OooO0o = o000oo0OooOOO0.OooO0o(i3);
        oooOO1.f13217OooO0oO.f13312OoooO0O.OooO00o(17, new OooOOO0.OooO00o(arrayList, oooOO1.f13232OooOo0O, iOooO00o, C.OooO00o(-9223372036854775807L), null)).sendToTarget();
        oooOO1.OooOOo(o000oo0OooO0o, false, 4, 0, 1);
    }

    public final void OooOOoo(@Nullable Surface surface, boolean z) {
        ArrayList<OooOo> arrayList = new ArrayList();
        for (Renderer renderer : this.f13422OooO0O0) {
            if (renderer.OooOo() == 2) {
                OooOO0 oooOO1 = this.f13423OooO0OO;
                OooOo oooOo = new OooOo(oooOO1.f13217OooO0oO, renderer, oooOO1.f13233OooOo0o.f40556OooO00o, oooOO1.OooO0o0(), oooOO1.f13218OooO0oo);
                o00000O0.OooO0Oo(!oooOo.f13387OooO0oo);
                oooOo.f13383OooO0Oo = 1;
                o00000O0.OooO0Oo(true ^ oooOo.f13387OooO0oo);
                oooOo.f13385OooO0o0 = surface;
                oooOo.OooO0O0();
                arrayList.add(oooOo);
            }
        }
        Surface surface2 = this.f13436OooOOo;
        if (surface2 != null && surface2 != surface) {
            try {
                for (OooOo oooOo2 : arrayList) {
                    synchronized (oooOo2) {
                        o00000O0.OooO0Oo(oooOo2.f13387OooO0oo);
                        o00000O0.OooO0Oo(oooOo2.f13384OooO0o.getLooper().getThread() != Thread.currentThread());
                        while (!oooOo2.f13379OooO) {
                            oooOo2.wait();
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.f13438OooOOoo) {
                this.f13436OooOOo.release();
            }
        }
        this.f13436OooOOo = surface;
        this.f13438OooOOoo = z;
    }

    public final void OooOo0(boolean z) {
        OooOo0o();
        this.f13432OooOOO.OooO0Oo(OooOO0(), 1);
        this.f13423OooO0OO.OooOOo0(z);
        this.f13448OooOoo0 = Collections.emptyList();
    }

    public final void OooOo00(float f) {
        OooOo0o();
        float fOooO0oO = p318o0O0oOo.o000OOo0.OooO0oO(f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f);
        if (this.f13444OooOoO == fOooO0oO) {
            return;
        }
        this.f13444OooOoO = fOooO0oO;
        OooOOOo(1, 2, Float.valueOf(this.f13432OooOOO.f13101OooO0oO * fOooO0oO));
        Iterator<p293o0O0Oo0O.OooOOOO> it = this.f13425OooO0o.iterator();
        while (it.hasNext()) {
            it.next().OooOOOO(fOooO0oO);
        }
    }

    public final void OooOo0O(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        this.f13423OooO0OO.OooOOOo(z2, i3, i2);
    }

    public final void OooOo0o() {
        if (Looper.myLooper() != this.f13423OooO0OO.f13225OooOOOo) {
            o0000oo.OooO0OO("SimpleExoPlayer", "Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread", this.f13447OooOoo ? null : new IllegalStateException());
            this.f13447OooOoo = true;
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getCurrentPosition() {
        OooOo0o();
        return this.f13423OooO0OO.getCurrentPosition();
    }
}
