package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class AlertController {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f2230OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oo0o0Oo f2231OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Window f2232OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f2233OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public RecycleListView f2234OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public CharSequence f2235OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public View f2236OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f2237OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Button f2238OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public CharSequence f2239OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public Message f2240OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public Button f2241OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public Drawable f2242OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public CharSequence f2243OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public Message f2244OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public Button f2245OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public Drawable f2246OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public CharSequence f2247OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Drawable f2248OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public Drawable f2249OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public Message f2250OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public NestedScrollView f2251OooOo0O;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public TextView f2253OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ImageView f2254OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public TextView f2255OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public ListAdapter f2256OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public View f2257OooOoo0;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final int f2259OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final boolean f2260Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final int f2261Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final int f2262Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final int f2263Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final OooO0OO f2264Oooo0O0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f2229OooO = false;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f2252OooOo0o = 0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f2258OooOooO = -1;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final OooO00o f2265Oooo0OO = new OooO00o();

    public class OooO00o implements View.OnClickListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Message messageObtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view == alertController.f2238OooOO0 && (message3 = alertController.f2240OooOO0o) != null) {
                messageObtain = Message.obtain(message3);
            } else if (view != alertController.f2241OooOOO || (message2 = alertController.f2244OooOOOo) == null) {
                messageObtain = (view != alertController.f2245OooOOo || (message = alertController.f2250OooOo00) == null) ? null : Message.obtain(message);
            } else {
                messageObtain = Message.obtain(message2);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            alertController.f2264Oooo0O0.obtainMessage(1, alertController.f2231OooO0O0).sendToTarget();
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public DialogInterface.OnClickListener f2267OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f2268OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final LayoutInflater f2269OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Drawable f2270OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public CharSequence f2271OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public CharSequence f2272OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public View f2273OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public DialogInterface.OnClickListener f2274OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public CharSequence f2275OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public DialogInterface.OnKeyListener f2276OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public ListAdapter f2277OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public DialogInterface.OnClickListener f2278OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public boolean f2279OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public View f2280OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public int f2281OooOOOO = -1;

        public OooO0O0(ContextThemeWrapper contextThemeWrapper) {
            this.f2268OooO00o = contextThemeWrapper;
            this.f2269OooO0O0 = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        }
    }

    public static final class OooO0OO extends Handler {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final WeakReference<DialogInterface> f2282OooO00o;

        public OooO0OO(DialogInterface dialogInterface) {
            this.f2282OooO00o = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f2282OooO00o.get(), message.what);
            } else {
                if (i != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class OooO0o extends ArrayAdapter<CharSequence> {
        public OooO0o(Context context, int i) {
            super(context, i, R.id.text1, (Object[]) null);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }
    }

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f2283OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f2284OooO0o0;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p012OooOo0O.o00O0O.RecycleListView);
            this.f2284OooO0o0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(p012OooOo0O.o00O0O.RecycleListView_paddingBottomNoButtons, -1);
            this.f2283OooO0Oo = typedArrayObtainStyledAttributes.getDimensionPixelOffset(p012OooOo0O.o00O0O.RecycleListView_paddingTopNoTitle, -1);
        }
    }

    public AlertController(Context context, oo0o0Oo oo0o0oo, Window window) {
        this.f2230OooO00o = context;
        this.f2231OooO0O0 = oo0o0oo;
        this.f2232OooO0OO = window;
        this.f2264Oooo0O0 = new OooO0OO(oo0o0oo);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, p012OooOo0O.o00O0O.AlertDialog, p012OooOo0O.OooOOO0.alertDialogStyle, 0);
        this.f2259OooOooo = typedArrayObtainStyledAttributes.getResourceId(p012OooOo0O.o00O0O.AlertDialog_android_layout, 0);
        typedArrayObtainStyledAttributes.getResourceId(p012OooOo0O.o00O0O.AlertDialog_buttonPanelSideLayout, 0);
        this.f2261Oooo000 = typedArrayObtainStyledAttributes.getResourceId(p012OooOo0O.o00O0O.AlertDialog_listLayout, 0);
        typedArrayObtainStyledAttributes.getResourceId(p012OooOo0O.o00O0O.AlertDialog_multiChoiceItemLayout, 0);
        this.f2262Oooo00O = typedArrayObtainStyledAttributes.getResourceId(p012OooOo0O.o00O0O.AlertDialog_singleChoiceItemLayout, 0);
        this.f2263Oooo00o = typedArrayObtainStyledAttributes.getResourceId(p012OooOo0O.o00O0O.AlertDialog_listItemLayout, 0);
        this.f2260Oooo0 = typedArrayObtainStyledAttributes.getBoolean(p012OooOo0O.o00O0O.AlertDialog_showTitle, true);
        this.f2233OooO0Oo = typedArrayObtainStyledAttributes.getDimensionPixelSize(p012OooOo0O.o00O0O.AlertDialog_buttonIconDimen, 0);
        typedArrayObtainStyledAttributes.recycle();
        oo0o0oo.OooO0o0().OooOo0(1);
    }

    public static boolean OooO00o(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (OooO00o(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void OooO0O0(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    @Nullable
    public static ViewGroup OooO0OO(@Nullable View view, @Nullable View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void OooO0Oo(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.f2264Oooo0O0.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f2247OooOOoo = charSequence;
            this.f2250OooOo00 = messageObtainMessage;
            this.f2249OooOo0 = null;
        } else if (i == -2) {
            this.f2243OooOOOO = charSequence;
            this.f2244OooOOOo = messageObtainMessage;
            this.f2246OooOOo0 = null;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f2239OooOO0O = charSequence;
            this.f2240OooOO0o = messageObtainMessage;
            this.f2242OooOOO0 = null;
        }
    }
}
