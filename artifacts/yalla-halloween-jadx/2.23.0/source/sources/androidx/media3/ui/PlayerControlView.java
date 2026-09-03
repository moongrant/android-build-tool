package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.media3.common.Player;
import androidx.media3.common.util.UnstableApi;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p022Oooo00O.o0O0o000;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class PlayerControlView extends FrameLayout {

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public static final float[] f6577o00ooo;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooOO0 f6578OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oo0o0Oo f6579OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO0O0 f6580OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Resources f6581OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final CopyOnWriteArrayList<OooOOOO> f6582OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final RecyclerView f6583OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooO0o f6584OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooOO0O f6585OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final OooO00o f6586OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final int f6587OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final PopupWindow f6588OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public final View f6589OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public final View f6590OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public final View f6591OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public final View f6592OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public final View f6593OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public final View f6594OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public final TextView f6595OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public final TextView f6596OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public final ImageView f6597OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public final ImageView f6598OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public final ImageView f6599OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public final ImageView f6600OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public final ImageView f6601OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public final View f6602OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public final View f6603OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @Nullable
    public final View f6604OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @Nullable
    public final TextView f6605OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final String f6606Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final Formatter f6607Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @Nullable
    public final TextView f6608Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @Nullable
    public final o000O000 f6609Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final StringBuilder f6610Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final androidx.media3.common.OooO0OO.C0139OooO0OO f6611Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final o0O0o000 f6612Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Drawable f6613Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final Drawable f6614Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final Drawable f6615Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final String f6616Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final float f6617OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final Drawable f6618OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final String f6619OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final Drawable f6620OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final float f6621OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final String f6622OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final Drawable f6623OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final Drawable f6624OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final String f6625OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final String f6626OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @Nullable
    public OooO0OO f6627Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public boolean f6628Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public boolean f6629OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public boolean f6630OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public boolean f6631OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int f6632Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public boolean f6633Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public int f6634OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public int f6635Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final String f6636o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public final long[] f6637o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public final boolean[] f6638o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public long f6639o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public boolean f6640o00o0O;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public long[] f6641o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public boolean[] f6642ooOO;

    public interface OooO {
    }

    public final class OooO00o extends OooOOO {
        public OooO00o() {
            super();
        }

        @Override // androidx.media3.ui.PlayerControlView.OooOOO
        public final void OooO0O0(SubSettingViewHolder subSettingViewHolder) {
            subSettingViewHolder.textView.setText(o0000.exo_track_selection_auto);
            PlayerControlView.this.getClass();
            throw null;
        }
    }

    public final class OooO0O0 implements o000O000.OooO00o, View.OnClickListener, PopupWindow.OnDismissListener {
        public OooO0O0() {
        }

        @Override // androidx.media3.ui.o000O000.OooO00o
        public final void OooO00o(long j) {
            PlayerControlView playerControlView = PlayerControlView.this;
            playerControlView.f6633Oooooo0 = true;
            TextView textView = playerControlView.f6608Oooo000;
            if (textView != null) {
                textView.setText(o000O000.OooO0o.OooO0Oo(playerControlView.f6610Oooo00o, playerControlView.f6607Oooo0, j));
            }
            playerControlView.f6579OooO0Oo.OooO0o();
        }

        @Override // androidx.media3.ui.o000O000.OooO00o
        public final void OooO0O0(long j) {
            PlayerControlView playerControlView = PlayerControlView.this;
            TextView textView = playerControlView.f6608Oooo000;
            if (textView != null) {
                textView.setText(o000O000.OooO0o.OooO0Oo(playerControlView.f6610Oooo00o, playerControlView.f6607Oooo0, j));
            }
        }

        @Override // androidx.media3.ui.o000O000.OooO00o
        public final void OooO0OO(long j, boolean z) {
            PlayerControlView playerControlView = PlayerControlView.this;
            playerControlView.f6633Oooooo0 = false;
            if (!z) {
                playerControlView.getClass();
            }
            playerControlView.f6579OooO0Oo.OooO0oO();
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PlayerControlView.this.getClass();
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            PlayerControlView playerControlView = PlayerControlView.this;
            if (playerControlView.f6640o00o0O) {
                playerControlView.f6579OooO0Oo.OooO0oO();
            }
        }
    }

    @Deprecated
    public interface OooO0OO {
    }

    public final class OooO0o extends RecyclerView.Adapter<SubSettingViewHolder> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String[] f6645OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float[] f6646OooO0O0;

        public OooO0o(String[] strArr, float[] fArr) {
            this.f6645OooO00o = strArr;
            this.f6646OooO0O0 = fArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f6645OooO00o.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.o0O0O00 o0o0o00, final int i) {
            SubSettingViewHolder subSettingViewHolder = (SubSettingViewHolder) o0o0o00;
            String[] strArr = this.f6645OooO00o;
            if (i < strArr.length) {
                subSettingViewHolder.textView.setText(strArr[i]);
            }
            if (i == 0) {
                subSettingViewHolder.itemView.setSelected(true);
                subSettingViewHolder.checkView.setVisibility(0);
            } else {
                subSettingViewHolder.itemView.setSelected(false);
                subSettingViewHolder.checkView.setVisibility(4);
            }
            subSettingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.OooOOOO
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerControlView.OooO0o oooO0o = this.f6569OooO0Oo;
                    oooO0o.getClass();
                    int i2 = i;
                    PlayerControlView playerControlView = PlayerControlView.this;
                    if (i2 != 0) {
                        playerControlView.setPlaybackSpeed(oooO0o.f6646OooO0O0[i2]);
                    }
                    playerControlView.f6588OooOOO0.dismiss();
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.o0O0O00 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new SubSettingViewHolder(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(o00000OO.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    public class OooOO0 extends RecyclerView.Adapter<SettingViewHolder> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String[] f6648OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String[] f6649OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Drawable[] f6650OooO0OO;

        public OooOO0(String[] strArr, Drawable[] drawableArr) {
            this.f6648OooO00o = strArr;
            this.f6649OooO0O0 = new String[strArr.length];
            this.f6650OooO0OO = drawableArr;
        }

        public final boolean OooO00o(int i) {
            PlayerControlView.this.getClass();
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f6648OooO00o.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.o0O0O00 o0o0o00, int i) {
            SettingViewHolder settingViewHolder = (SettingViewHolder) o0o0o00;
            if (OooO00o(i)) {
                settingViewHolder.itemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            } else {
                settingViewHolder.itemView.setLayoutParams(new RecyclerView.LayoutParams(0, 0));
            }
            settingViewHolder.mainTextView.setText(this.f6648OooO00o[i]);
            String[] strArr = this.f6649OooO0O0;
            if (strArr[i] == null) {
                settingViewHolder.subTextView.setVisibility(8);
            } else {
                settingViewHolder.subTextView.setText(strArr[i]);
            }
            Drawable[] drawableArr = this.f6650OooO0OO;
            if (drawableArr[i] == null) {
                settingViewHolder.iconView.setVisibility(8);
            } else {
                settingViewHolder.iconView.setImageDrawable(drawableArr[i]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.o0O0O00 onCreateViewHolder(ViewGroup viewGroup, int i) {
            PlayerControlView playerControlView = PlayerControlView.this;
            return playerControlView.new SettingViewHolder(LayoutInflater.from(playerControlView.getContext()).inflate(o00000OO.exo_styled_settings_list_item, viewGroup, false));
        }
    }

    public final class OooOO0O extends OooOOO {
        public OooOO0O() {
            super();
        }

        @Override // androidx.media3.ui.PlayerControlView.OooOOO, androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public final void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i) {
            super.onBindViewHolder(subSettingViewHolder, i);
            if (i <= 0) {
                return;
            }
            OooOOO0 oooOOO0 = this.f6653OooO00o.get(i - 1);
            View view = subSettingViewHolder.checkView;
            oooOOO0.getClass();
            throw null;
        }

        @Override // androidx.media3.ui.PlayerControlView.OooOOO
        public final void OooO0O0(SubSettingViewHolder subSettingViewHolder) {
            subSettingViewHolder.textView.setText(o0000.exo_track_selection_none);
            if (this.f6653OooO00o.size() > 0) {
                this.f6653OooO00o.get(0).getClass();
                throw null;
            }
            subSettingViewHolder.checkView.setVisibility(0);
            subSettingViewHolder.itemView.setOnClickListener(new OooOo(this, 0));
        }
    }

    public abstract class OooOOO extends RecyclerView.Adapter<SubSettingViewHolder> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public List<OooOOO0> f6653OooO00o = new ArrayList();

        public OooOOO() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: OooO00o */
        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i) {
            PlayerControlView.this.getClass();
        }

        public abstract void OooO0O0(SubSettingViewHolder subSettingViewHolder);

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            if (this.f6653OooO00o.isEmpty()) {
                return 0;
            }
            return this.f6653OooO00o.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.o0O0O00 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new SubSettingViewHolder(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(o00000OO.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    public static final class OooOOO0 {
        public OooOOO0() {
            throw null;
        }
    }

    @Deprecated
    public interface OooOOOO {
        void OooO00o(int i);
    }

    public final class SettingViewHolder extends RecyclerView.o0O0O00 {
        private final ImageView iconView;
        private final TextView mainTextView;
        private final TextView subTextView;

        public SettingViewHolder(View view) {
            super(view);
            if (o000O000.OooO0o.f34423OooO00o < 26) {
                view.setFocusable(true);
            }
            this.mainTextView = (TextView) view.findViewById(o00000O0.exo_main_text);
            this.subTextView = (TextView) view.findViewById(o00000O0.exo_sub_text);
            this.iconView = (ImageView) view.findViewById(o00000O0.exo_icon);
            view.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.OooOo00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f6573OooO0Oo.lambda$new$0(view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$new$0(View view) {
            PlayerControlView playerControlView = PlayerControlView.this;
            int adapterPosition = getAdapterPosition();
            View view2 = playerControlView.f6603OooOoo0;
            if (adapterPosition == 0) {
                view2.getClass();
                playerControlView.OooO0o0(playerControlView.f6584OooOO0, view2);
            } else if (adapterPosition != 1) {
                playerControlView.f6588OooOOO0.dismiss();
            } else {
                view2.getClass();
                playerControlView.OooO0o0(playerControlView.f6586OooOO0o, view2);
            }
        }
    }

    public static class SubSettingViewHolder extends RecyclerView.o0O0O00 {
        public final View checkView;
        public final TextView textView;

        public SubSettingViewHolder(View view) {
            super(view);
            if (o000O000.OooO0o.f34423OooO00o < 26) {
                view.setFocusable(true);
            }
            this.textView = (TextView) view.findViewById(o00000O0.exo_text);
            this.checkView = view.findViewById(o00000O0.exo_check);
        }
    }

    static {
        p069o0000ooO.o000000O.OooO00o();
        f6577o00ooo = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public PlayerControlView(Context context) {
        this(context, null);
    }

    public static void OooO00o(PlayerControlView playerControlView) {
        if (playerControlView.f6627Ooooo00 == null) {
            return;
        }
        boolean z = !playerControlView.f6628Ooooo0o;
        playerControlView.f6628Ooooo0o = z;
        String str = playerControlView.f6625OoooOoO;
        Drawable drawable = playerControlView.f6623OoooOOo;
        String str2 = playerControlView.f6626OoooOoo;
        Drawable drawable2 = playerControlView.f6624OoooOo0;
        ImageView imageView = playerControlView.f6599OooOoO;
        if (imageView != null) {
            if (z) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            }
        }
        boolean z2 = playerControlView.f6628Ooooo0o;
        ImageView imageView2 = playerControlView.f6601OooOoOO;
        if (imageView2 != null) {
            if (z2) {
                imageView2.setImageDrawable(drawable);
                imageView2.setContentDescription(str);
            } else {
                imageView2.setImageDrawable(drawable2);
                imageView2.setContentDescription(str2);
            }
        }
        OooO0OO oooO0OO = playerControlView.f6627Ooooo00;
        if (oooO0OO != null) {
            PlayerView.this.getClass();
        }
    }

    public static boolean OooO0OO(Player player, androidx.media3.common.OooO0OO.C0139OooO0OO c0139OooO0OO) {
        if (!player.OooOoOO()) {
            return false;
        }
        player.OooOO0().OooO0OO();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
    }

    public final void OooO() {
        View view;
        boolean z = true;
        if (OooO0oo() && this.f6629OooooO0 && (view = this.f6592OooOOo0) != null) {
            boolean zOooO0oo = o000O000.OooO0o.OooO0oo(null);
            int i = zOooO0oo ? o000000O.exo_styled_controls_play : o000000O.exo_styled_controls_pause;
            int i2 = zOooO0oo ? o0000.exo_controls_play_description : o0000.exo_controls_pause_description;
            Context context = getContext();
            Resources resources = this.f6581OooO0o0;
            ((ImageView) view).setImageDrawable(o000O000.OooO0o.OooO0OO(context, resources, i));
            view.setContentDescription(resources.getString(i2));
            OooOO0(view, false);
        }
        OooOO0O();
        OooOOO0();
        OooOOOO();
        OooOO0O oooOO0O = this.f6585OooOO0O;
        oooOO0O.getClass();
        oooOO0O.f6653OooO00o = Collections.emptyList();
        OooO00o oooO00o = this.f6586OooOO0o;
        oooO00o.getClass();
        oooO00o.f6653OooO00o = Collections.emptyList();
        OooOO0(this.f6600OooOoO0, oooOO0O.getItemCount() > 0);
        OooOO0 oooOO1 = this.f6578OooO;
        if (!oooOO1.OooO00o(1) && !oooOO1.OooO00o(0)) {
            z = false;
        }
        OooOO0(this.f6603OooOoo0, z);
        OooOOOo();
    }

    public final boolean OooO0Oo(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        return false;
    }

    public final void OooO0o() {
        oo0o0Oo oo0o0oo = this.f6579OooO0Oo;
        int i = oo0o0oo.f6790OooOoO;
        if (i == 3 || i == 2) {
            return;
        }
        oo0o0oo.OooO0o();
        if (!oo0o0oo.f6793OooOoo) {
            oo0o0oo.OooO(2);
        } else if (oo0o0oo.f6790OooOoO == 1) {
            oo0o0oo.f6779OooOOO0.start();
        } else {
            oo0o0oo.f6778OooOOO.start();
        }
    }

    public final void OooO0o0(RecyclerView.Adapter<?> adapter, View view) {
        this.f6583OooO0oo.setAdapter(adapter);
        OooOOO();
        this.f6640o00o0O = false;
        PopupWindow popupWindow = this.f6588OooOOO0;
        popupWindow.dismiss();
        this.f6640o00o0O = true;
        int width = getWidth() - popupWindow.getWidth();
        int i = this.f6587OooOOO;
        popupWindow.showAsDropDown(view, width - i, (-popupWindow.getHeight()) - i);
    }

    public final boolean OooO0oO() {
        oo0o0Oo oo0o0oo = this.f6579OooO0Oo;
        return oo0o0oo.f6790OooOoO == 0 && oo0o0oo.f6767OooO00o.OooO0oo();
    }

    public final boolean OooO0oo() {
        return getVisibility() == 0;
    }

    public final void OooOO0(@Nullable View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.f6617OoooO : this.f6621OoooOO0);
    }

    public final void OooOO0O() {
        if (OooO0oo() && this.f6629OooooO0) {
            View view = this.f6593OooOOoo;
            View view2 = this.f6591OooOOo;
            OooOO0(this.f6589OooOOOO, false);
            OooOO0(view, false);
            OooOO0(view2, false);
            OooOO0(this.f6590OooOOOo, false);
            o000O000 o000o001 = this.f6609Oooo00O;
            if (o000o001 != null) {
                o000o001.setEnabled(false);
            }
        }
    }

    public final void OooOO0o() {
        if (OooO0oo() && this.f6629OooooO0) {
            TextView textView = this.f6608Oooo000;
            if (textView != null && !this.f6633Oooooo0) {
                textView.setText(o000O000.OooO0o.OooO0Oo(this.f6610Oooo00o, this.f6607Oooo0, 0L));
            }
            o000O000 o000o001 = this.f6609Oooo00O;
            if (o000o001 != null) {
                o000o001.setPosition(0L);
                o000o001.setBufferedPosition(0L);
            }
            removeCallbacks(this.f6612Oooo0OO);
        }
    }

    public final void OooOOO() {
        RecyclerView recyclerView = this.f6583OooO0oo;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i = this.f6587OooOOO;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i * 2));
        PopupWindow popupWindow = this.f6588OooOOO0;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i * 2), recyclerView.getMeasuredHeight()));
    }

    public final void OooOOO0() {
        ImageView imageView;
        if (OooO0oo() && this.f6629OooooO0 && (imageView = this.f6597OooOo0O) != null) {
            if (this.f6635Ooooooo == 0) {
                OooOO0(imageView, false);
                return;
            }
            String str = this.f6616Oooo0oo;
            Drawable drawable = this.f6614Oooo0o0;
            OooOO0(imageView, false);
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(str);
        }
    }

    public final void OooOOOO() {
        ImageView imageView;
        if (OooO0oo() && this.f6629OooooO0 && (imageView = this.f6598OooOo0o) != null) {
            if (!this.f6579OooO0Oo.OooO0OO(imageView)) {
                OooOO0(imageView, false);
                return;
            }
            String str = this.f6622OoooOOO;
            Drawable drawable = this.f6620OoooO0O;
            OooOO0(imageView, false);
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(str);
        }
    }

    public final void OooOOOo() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return OooO0Oo(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Nullable
    public Player getPlayer() {
        return null;
    }

    public int getRepeatToggleModes() {
        return this.f6635Ooooooo;
    }

    public boolean getShowShuffleButton() {
        return this.f6579OooO0Oo.OooO0OO(this.f6598OooOo0o);
    }

    public boolean getShowSubtitleButton() {
        return this.f6579OooO0Oo.OooO0OO(this.f6600OooOoO0);
    }

    public int getShowTimeoutMs() {
        return this.f6632Oooooo;
    }

    public boolean getShowVrButton() {
        return this.f6579OooO0Oo.OooO0OO(this.f6594OooOo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        oo0o0Oo oo0o0oo = this.f6579OooO0Oo;
        oo0o0oo.f6767OooO00o.addOnLayoutChangeListener(oo0o0oo.f6785OooOo);
        this.f6629OooooO0 = true;
        if (OooO0oO()) {
            oo0o0oo.OooO0oO();
        }
        OooO();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        oo0o0Oo oo0o0oo = this.f6579OooO0Oo;
        oo0o0oo.f6767OooO00o.removeOnLayoutChangeListener(oo0o0oo.f6785OooOo);
        this.f6629OooooO0 = false;
        removeCallbacks(this.f6612Oooo0OO);
        oo0o0oo.OooO0o();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f6579OooO0Oo.f6768OooO0O0;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public void setAnimationEnabled(boolean z) {
        this.f6579OooO0Oo.f6793OooOoo = z;
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(@Nullable OooO0OO oooO0OO) {
        this.f6627Ooooo00 = oooO0OO;
        boolean z = oooO0OO != null;
        ImageView imageView = this.f6599OooOoO;
        if (imageView != null) {
            if (z) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z2 = oooO0OO != null;
        ImageView imageView2 = this.f6601OooOoOO;
        if (imageView2 == null) {
            return;
        }
        if (z2) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(@Nullable Player player) {
        boolean z = true;
        o000O000.OooO00o.OooO0O0(Looper.myLooper() == Looper.getMainLooper());
        if (player != null && player.OooOO0O() != Looper.getMainLooper()) {
            z = false;
        }
        o000O000.OooO00o.OooO00o(z);
        if (player == null) {
            return;
        }
        if (player != null) {
            player.Oooo0();
        }
        OooO();
    }

    public void setProgressUpdateListener(@Nullable OooO oooO) {
    }

    public void setRepeatToggleModes(int i) {
        this.f6635Ooooooo = i;
        this.f6579OooO0Oo.OooO0oo(this.f6597OooOo0O, i != 0);
        OooOOO0();
    }

    public void setShowFastForwardButton(boolean z) {
        this.f6579OooO0Oo.OooO0oo(this.f6591OooOOo, z);
        OooOO0O();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.f6630OooooOO = z;
        OooOOOo();
    }

    public void setShowNextButton(boolean z) {
        this.f6579OooO0Oo.OooO0oo(this.f6590OooOOOo, z);
        OooOO0O();
    }

    public void setShowPreviousButton(boolean z) {
        this.f6579OooO0Oo.OooO0oo(this.f6589OooOOOO, z);
        OooOO0O();
    }

    public void setShowRewindButton(boolean z) {
        this.f6579OooO0Oo.OooO0oo(this.f6593OooOOoo, z);
        OooOO0O();
    }

    public void setShowShuffleButton(boolean z) {
        this.f6579OooO0Oo.OooO0oo(this.f6598OooOo0o, z);
        OooOOOO();
    }

    public void setShowSubtitleButton(boolean z) {
        this.f6579OooO0Oo.OooO0oo(this.f6600OooOoO0, z);
    }

    public void setShowTimeoutMs(int i) {
        this.f6632Oooooo = i;
        if (OooO0oO()) {
            this.f6579OooO0Oo.OooO0oO();
        }
    }

    public void setShowVrButton(boolean z) {
        this.f6579OooO0Oo.OooO0oo(this.f6594OooOo, z);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        int i2 = o000O000.OooO0o.f34423OooO00o;
        this.f6634OoooooO = Math.max(16, Math.min(i, 1000));
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        View view = this.f6594OooOo;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            OooOO0(view, onClickListener != null);
        }
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v12, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v14, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v15, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.widget.TextView] */
    public PlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i, @Nullable AttributeSet attributeSet2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        ViewGroup viewGroup;
        boolean z9;
        super(context, attributeSet, i);
        int resourceId = o00000OO.exo_player_control_view;
        this.f6632Oooooo = 5000;
        int i2 = 0;
        this.f6635Ooooooo = 0;
        this.f6634OoooooO = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, o0000oo.PlayerControlView, i, 0);
            try {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(o0000oo.PlayerControlView_controller_layout_id, resourceId);
                this.f6632Oooooo = typedArrayObtainStyledAttributes.getInt(o0000oo.PlayerControlView_show_timeout, this.f6632Oooooo);
                this.f6635Ooooooo = typedArrayObtainStyledAttributes.getInt(o0000oo.PlayerControlView_repeat_toggle_modes, this.f6635Ooooooo);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(o0000oo.PlayerControlView_show_rewind_button, true);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(o0000oo.PlayerControlView_show_fastforward_button, true);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(o0000oo.PlayerControlView_show_previous_button, true);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(o0000oo.PlayerControlView_show_next_button, true);
                boolean z14 = typedArrayObtainStyledAttributes.getBoolean(o0000oo.PlayerControlView_show_shuffle_button, false);
                boolean z15 = typedArrayObtainStyledAttributes.getBoolean(o0000oo.PlayerControlView_show_subtitle_button, false);
                boolean z16 = typedArrayObtainStyledAttributes.getBoolean(o0000oo.PlayerControlView_show_vr_button, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(o0000oo.PlayerControlView_time_bar_min_update_interval, this.f6634OoooooO));
                boolean z17 = typedArrayObtainStyledAttributes.getBoolean(o0000oo.PlayerControlView_animation_enabled, true);
                typedArrayObtainStyledAttributes.recycle();
                z2 = z15;
                z3 = z16;
                z8 = z13;
                z = z14;
                z6 = z10;
                z7 = z12;
                z5 = z11;
                z4 = z17;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z = false;
            z2 = false;
            z3 = false;
            z4 = true;
            z5 = true;
            z6 = true;
            z7 = true;
            z8 = true;
        }
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        OooO0O0 oooO0O0 = new OooO0O0();
        this.f6580OooO0o = oooO0O0;
        this.f6582OooO0oO = new CopyOnWriteArrayList<>();
        new androidx.media3.common.OooO0OO.OooO0O0();
        this.f6611Oooo0O0 = new androidx.media3.common.OooO0OO.C0139OooO0OO();
        StringBuilder sb = new StringBuilder();
        this.f6610Oooo00o = sb;
        this.f6607Oooo0 = new Formatter(sb, Locale.getDefault());
        this.f6641o0OoOo0 = new long[0];
        this.f6642ooOO = new boolean[0];
        this.f6637o00O0O = new long[0];
        this.f6638o00Oo0 = new boolean[0];
        this.f6612Oooo0OO = new o0O0o000(this, 1);
        this.f6605OooOooo = (TextView) findViewById(o00000O0.exo_duration);
        this.f6608Oooo000 = (TextView) findViewById(o00000O0.exo_position);
        ImageView imageView = (ImageView) findViewById(o00000O0.exo_subtitle);
        this.f6600OooOoO0 = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(oooO0O0);
        }
        ImageView imageView2 = (ImageView) findViewById(o00000O0.exo_fullscreen);
        this.f6599OooOoO = imageView2;
        androidx.media3.ui.OooOO0 oooOO1 = new androidx.media3.ui.OooOO0(this, i2);
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(oooOO1);
        }
        ImageView imageView3 = (ImageView) findViewById(o00000O0.exo_minimal_fullscreen);
        this.f6601OooOoOO = imageView3;
        androidx.media3.ui.OooOO0O oooOO0O = new androidx.media3.ui.OooOO0O(this, i2);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(oooOO0O);
        }
        View viewFindViewById = findViewById(o00000O0.exo_settings);
        this.f6603OooOoo0 = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(oooO0O0);
        }
        View viewFindViewById2 = findViewById(o00000O0.exo_playback_speed);
        this.f6602OooOoo = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(oooO0O0);
        }
        View viewFindViewById3 = findViewById(o00000O0.exo_audio_track);
        this.f6604OooOooO = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(oooO0O0);
        }
        int i3 = o00000O0.exo_progress;
        o000O000 o000o001 = (o000O000) findViewById(i3);
        View viewFindViewById4 = findViewById(o00000O0.exo_progress_placeholder);
        if (o000o001 != null) {
            this.f6609Oooo00O = o000o001;
            viewGroup = null;
        } else if (viewFindViewById4 != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2, o0000O00.ExoStyledControls_TimeBar);
            defaultTimeBar.setId(i3);
            defaultTimeBar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup2 = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup2.indexOfChild(viewFindViewById4);
            viewGroup2.removeView(viewFindViewById4);
            viewGroup2.addView(defaultTimeBar, iIndexOfChild);
            this.f6609Oooo00O = defaultTimeBar;
            viewGroup = null;
        } else {
            viewGroup = null;
            this.f6609Oooo00O = null;
        }
        o000O000 o000o002 = this.f6609Oooo00O;
        if (o000o002 != null) {
            o000o002.OooO0O0(oooO0O0);
        }
        View viewFindViewById5 = findViewById(o00000O0.exo_play_pause);
        this.f6592OooOOo0 = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(oooO0O0);
        }
        View viewFindViewById6 = findViewById(o00000O0.exo_prev);
        this.f6589OooOOOO = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(oooO0O0);
        }
        View viewFindViewById7 = findViewById(o00000O0.exo_next);
        this.f6590OooOOOo = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(oooO0O0);
        }
        Typeface typefaceOooO0O0 = androidx.core.content.res.OooO00o.OooO0O0(o00000.roboto_medium_numbers, context);
        ?? FindViewById = findViewById(o00000O0.exo_rew);
        ?? r5 = FindViewById == 0 ? (TextView) findViewById(o00000O0.exo_rew_with_amount) : viewGroup;
        this.f6595OooOo0 = r5;
        if (r5 != 0) {
            r5.setTypeface(typefaceOooO0O0);
        }
        FindViewById = FindViewById == 0 ? r5 : FindViewById;
        this.f6593OooOOoo = FindViewById;
        if (FindViewById != 0) {
            FindViewById.setOnClickListener(oooO0O0);
        }
        ?? FindViewById2 = findViewById(o00000O0.exo_ffwd);
        ?? r6 = FindViewById2 == 0 ? (TextView) findViewById(o00000O0.exo_ffwd_with_amount) : viewGroup;
        this.f6596OooOo00 = r6;
        if (r6 != 0) {
            r6.setTypeface(typefaceOooO0O0);
        }
        FindViewById2 = FindViewById2 == 0 ? r6 : FindViewById2;
        this.f6591OooOOo = FindViewById2;
        if (FindViewById2 != 0) {
            FindViewById2.setOnClickListener(oooO0O0);
        }
        ImageView imageView4 = (ImageView) findViewById(o00000O0.exo_repeat_toggle);
        this.f6597OooOo0O = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(oooO0O0);
        }
        ImageView imageView5 = (ImageView) findViewById(o00000O0.exo_shuffle);
        this.f6598OooOo0o = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(oooO0O0);
        }
        Resources resources = context.getResources();
        this.f6581OooO0o0 = resources;
        this.f6617OoooO = resources.getInteger(o00000O.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f6621OoooOO0 = resources.getInteger(o00000O.exo_media_button_opacity_percentage_disabled) / 100.0f;
        View viewFindViewById8 = findViewById(o00000O0.exo_vr);
        this.f6594OooOo = viewFindViewById8;
        if (viewFindViewById8 != null) {
            OooOO0(viewFindViewById8, false);
        }
        oo0o0Oo oo0o0oo = new oo0o0Oo(this);
        this.f6579OooO0Oo = oo0o0oo;
        oo0o0oo.f6793OooOoo = z4;
        OooOO0 oooOO2 = new OooOO0(new String[]{resources.getString(o0000.exo_controls_playback_speed), resources.getString(o0000.exo_track_selection_title_audio)}, new Drawable[]{o000O000.OooO0o.OooO0OO(context, resources, o000000O.exo_styled_controls_speed), o000O000.OooO0o.OooO0OO(context, resources, o000000O.exo_styled_controls_audiotrack)});
        this.f6578OooO = oooOO2;
        this.f6587OooOOO = resources.getDimensionPixelSize(o000000.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(o00000OO.exo_styled_settings_list, viewGroup);
        this.f6583OooO0oo = recyclerView;
        recyclerView.setAdapter(oooOO2);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.f6588OooOOO0 = popupWindow;
        if (o000O000.OooO0o.f34423OooO00o < 23) {
            z9 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z9 = false;
        }
        popupWindow.setOnDismissListener(this.f6580OooO0o);
        this.f6640o00o0O = true;
        new androidx.media3.ui.OooO0OO(getResources());
        o000O000.OooO0o.OooO0OO(context, resources, o000000O.exo_styled_controls_subtitle_on);
        o000O000.OooO0o.OooO0OO(context, resources, o000000O.exo_styled_controls_subtitle_off);
        resources.getString(o0000.exo_controls_cc_enabled_description);
        resources.getString(o0000.exo_controls_cc_disabled_description);
        this.f6585OooOO0O = new OooOO0O();
        this.f6586OooOO0o = new OooO00o();
        this.f6584OooOO0 = new OooO0o(resources.getStringArray(o0O0O00.exo_controls_playback_speeds), f6577o00ooo);
        this.f6623OoooOOo = o000O000.OooO0o.OooO0OO(context, resources, o000000O.exo_styled_controls_fullscreen_exit);
        this.f6624OoooOo0 = o000O000.OooO0o.OooO0OO(context, resources, o000000O.exo_styled_controls_fullscreen_enter);
        this.f6614Oooo0o0 = o000O000.OooO0o.OooO0OO(context, resources, o000000O.exo_styled_controls_repeat_off);
        this.f6613Oooo0o = o000O000.OooO0o.OooO0OO(context, resources, o000000O.exo_styled_controls_repeat_one);
        this.f6615Oooo0oO = o000O000.OooO0o.OooO0OO(context, this.f6581OooO0o0, o000000O.exo_styled_controls_repeat_all);
        this.f6618OoooO0 = o000O000.OooO0o.OooO0OO(context, this.f6581OooO0o0, o000000O.exo_styled_controls_shuffle_on);
        this.f6620OoooO0O = o000O000.OooO0o.OooO0OO(context, this.f6581OooO0o0, o000000O.exo_styled_controls_shuffle_off);
        this.f6625OoooOoO = this.f6581OooO0o0.getString(o0000.exo_controls_fullscreen_exit_description);
        this.f6626OoooOoo = this.f6581OooO0o0.getString(o0000.exo_controls_fullscreen_enter_description);
        this.f6616Oooo0oo = this.f6581OooO0o0.getString(o0000.exo_controls_repeat_off_description);
        this.f6606Oooo = this.f6581OooO0o0.getString(o0000.exo_controls_repeat_one_description);
        this.f6619OoooO00 = this.f6581OooO0o0.getString(o0000.exo_controls_repeat_all_description);
        this.f6636o000oOoO = this.f6581OooO0o0.getString(o0000.exo_controls_shuffle_on_description);
        this.f6622OoooOOO = this.f6581OooO0o0.getString(o0000.exo_controls_shuffle_off_description);
        this.f6579OooO0Oo.OooO0oo((ViewGroup) findViewById(o00000O0.exo_bottom_bar), true);
        this.f6579OooO0Oo.OooO0oo(this.f6591OooOOo, z5);
        this.f6579OooO0Oo.OooO0oo(this.f6593OooOOoo, z6);
        this.f6579OooO0Oo.OooO0oo(this.f6589OooOOOO, z7);
        this.f6579OooO0Oo.OooO0oo(this.f6590OooOOOo, z8);
        this.f6579OooO0Oo.OooO0oo(this.f6598OooOo0o, z);
        this.f6579OooO0Oo.OooO0oo(this.f6600OooOoO0, z2);
        this.f6579OooO0Oo.OooO0oo(this.f6594OooOo, z3);
        this.f6579OooO0Oo.OooO0oo(this.f6597OooOo0O, this.f6635Ooooooo != 0 ? true : z9);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.media3.ui.OooOOO0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                float[] fArr = PlayerControlView.f6577o00ooo;
                PlayerControlView playerControlView = this.f6568OooO0Oo;
                playerControlView.getClass();
                int i12 = i7 - i5;
                int i13 = i11 - i9;
                if (i6 - i4 == i10 - i8 && i12 == i13) {
                    return;
                }
                PopupWindow popupWindow2 = playerControlView.f6588OooOOO0;
                if (popupWindow2.isShowing()) {
                    playerControlView.OooOOO();
                    int width = playerControlView.getWidth() - popupWindow2.getWidth();
                    int i14 = playerControlView.f6587OooOOO;
                    popupWindow2.update(view, width - i14, (-popupWindow2.getHeight()) - i14, -1, -1);
                }
            }
        });
    }
}
