package p016OooOoO0;

import OooO0o.OooO0o;
import OooOo00.OooOOOO;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.OooOO0;
import androidx.appcompat.widget.o0000O0;
import androidx.appcompat.widget.o0ooOOo;
import com.umeng.analytics.pro.bl;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import o000O0O0.OooOo00;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p015OooOoO.o000oOoO;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class OooOo extends MenuInflater {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Class<?>[] f318OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Class<?>[] f319OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object[] f320OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object[] f321OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Context f322OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Object f323OooO0Oo;

    public static class OooO00o implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final Class<?>[] f324OooO0OO = {MenuItem.class};

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Object f325OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Method f326OooO0O0;

        public OooO00o(Object obj, String str) {
            this.f325OooO00o = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f326OooO0O0 = cls.getMethod(str, f324OooO0OO);
            } catch (Exception e) {
                StringBuilder sbOooO0OO = OooO0o.OooO0OO("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbOooO0OO.append(cls.getName());
                InflateException inflateException = new InflateException(sbOooO0OO.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f326OooO0O0.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f326OooO0O0.invoke(this.f325OooO00o, menuItem)).booleanValue();
                }
                this.f326OooO0O0.invoke(this.f325OooO00o, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public class OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f327OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Menu f328OooO00o;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f335OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f336OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public CharSequence f337OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public CharSequence f338OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public char f339OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public int f340OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public int f341OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public char f342OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public int f343OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public int f344OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public boolean f345OooOOoo;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public String f346OooOo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public boolean f347OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public boolean f348OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public int f349OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f350OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public o000O0O0.OooO00o f351OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public String f352OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public CharSequence f353OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public CharSequence f355OooOoo0;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public ColorStateList f354OooOoo = null;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public PorterDuff.Mode f356OooOooO = null;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f329OooO0O0 = 0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f330OooO0OO = 0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f331OooO0Oo = 0;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f333OooO0o0 = 0;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f332OooO0o = true;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f334OooO0oO = true;

        public OooO0O0(Menu menu) {
            this.f328OooO00o = menu;
        }

        public final SubMenu OooO00o() {
            this.f335OooO0oo = true;
            SubMenu subMenuAddSubMenu = this.f328OooO00o.addSubMenu(this.f329OooO0O0, this.f327OooO, this.f336OooOO0, this.f337OooOO0O);
            OooO0OO(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public final <T> T OooO0O0(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, OooOo.this.f322OooO0OO.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        public final void OooO0OO(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f345OooOOoo).setVisible(this.f348OooOo00).setEnabled(this.f347OooOo0).setCheckable(this.f343OooOOo >= 1).setTitleCondensed(this.f338OooOO0o).setIcon(this.f340OooOOO0);
            int i = this.f349OooOo0O;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f352OooOoO0 != null) {
                if (OooOo.this.f322OooO0OO.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                OooOo oooOo = OooOo.this;
                if (oooOo.f323OooO0Oo == null) {
                    Object objOooO00o = oooOo.f322OooO0OO;
                    if (!(objOooO00o instanceof Activity) && (objOooO00o instanceof ContextWrapper)) {
                        objOooO00o = oooOo.OooO00o(((ContextWrapper) objOooO00o).getBaseContext());
                    }
                    oooOo.f323OooO0Oo = objOooO00o;
                }
                menuItem.setOnMenuItemClickListener(new OooO00o(oooOo.f323OooO0Oo, this.f352OooOoO0));
            }
            if (this.f343OooOOo >= 2) {
                if (menuItem instanceof OooOO0) {
                    ((OooOO0) menuItem).OooOO0O(true);
                } else if (menuItem instanceof o000oOoO) {
                    o000oOoO o000oooo2 = (o000oOoO) menuItem;
                    try {
                        if (o000oooo2.f286OooO0o0 == null) {
                            o000oooo2.f286OooO0o0 = o000oooo2.f285OooO0Oo.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        o000oooo2.f286OooO0o0.invoke(o000oooo2.f285OooO0Oo, Boolean.TRUE);
                    } catch (Exception e) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                    }
                }
            }
            String str = this.f346OooOo;
            if (str != null) {
                menuItem.setActionView((View) OooO0O0(str, OooOo.f319OooO0o0, OooOo.this.f320OooO00o));
                z = true;
            }
            int i2 = this.f350OooOo0o;
            if (i2 > 0) {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i2);
                }
            }
            o000O0O0.OooO00o oooO00o = this.f351OooOoO;
            if (oooO00o != null) {
                if (menuItem instanceof o000O0O.OooO0O0) {
                    ((o000O0O.OooO0O0) menuItem).OooO00o(oooO00o);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.f353OooOoOO;
            boolean z2 = menuItem instanceof o000O0O.OooO0O0;
            if (z2) {
                ((o000O0O.OooO0O0) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                OooOo00.OooO0oo(menuItem, charSequence);
            }
            CharSequence charSequence2 = this.f355OooOoo0;
            if (z2) {
                ((o000O0O.OooO0O0) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                OooOo00.OooOOO0(menuItem, charSequence2);
            }
            char c = this.f339OooOOO;
            int i3 = this.f341OooOOOO;
            if (z2) {
                ((o000O0O.OooO0O0) menuItem).setAlphabeticShortcut(c, i3);
            } else if (Build.VERSION.SDK_INT >= 26) {
                OooOo00.OooO0oO(menuItem, c, i3);
            }
            char c2 = this.f342OooOOOo;
            int i4 = this.f344OooOOo0;
            if (z2) {
                ((o000O0O.OooO0O0) menuItem).setNumericShortcut(c2, i4);
            } else if (Build.VERSION.SDK_INT >= 26) {
                OooOo00.OooOO0O(menuItem, c2, i4);
            }
            PorterDuff.Mode mode = this.f356OooOooO;
            if (mode != null) {
                if (z2) {
                    ((o000O0O.OooO0O0) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    OooOo00.OooOO0(menuItem, mode);
                }
            }
            ColorStateList colorStateList = this.f354OooOoo;
            if (colorStateList != null) {
                if (z2) {
                    ((o000O0O.OooO0O0) menuItem).setIconTintList(colorStateList);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    OooOo00.OooO(menuItem, colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f319OooO0o0 = clsArr;
        f318OooO0o = clsArr;
    }

    public OooOo(Context context) {
        super(context);
        this.f322OooO0OO = context;
        Object[] objArr = {context};
        this.f320OooO00o = objArr;
        this.f321OooO0O0 = objArr;
    }

    public final Object OooO00o(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? OooO00o(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0230  */
    public final void OooO0O0(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        OooO0O0 oooO0O0 = new OooO0O0(menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException(OooOo00.OooO0Oo("Expecting menu, got ", name));
                }
                eventType = xmlPullParser.next();
                break;
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        str = null;
                        z2 = false;
                    } else if (name2.equals("group")) {
                        oooO0O0.f329OooO0O0 = 0;
                        oooO0O0.f330OooO0OO = 0;
                        oooO0O0.f331OooO0Oo = 0;
                        oooO0O0.f333OooO0o0 = 0;
                        oooO0O0.f332OooO0o = true;
                        oooO0O0.f334OooO0oO = true;
                    } else if (name2.equals("item")) {
                        if (!oooO0O0.f335OooO0oo) {
                            o000O0O0.OooO00o oooO00o = oooO0O0.f351OooOoO;
                            if (oooO00o == null || !oooO00o.OooO00o()) {
                                oooO0O0.f335OooO0oo = true;
                                oooO0O0.OooO0OO(oooO0O0.f328OooO00o.add(oooO0O0.f329OooO0O0, oooO0O0.f327OooO, oooO0O0.f336OooOO0, oooO0O0.f337OooOO0O));
                            } else {
                                oooO0O0.OooO00o();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    TypedArray typedArrayObtainStyledAttributes = OooOo.this.f322OooO0OO.obtainStyledAttributes(attributeSet, OooOOOO.MenuGroup);
                    oooO0O0.f329OooO0O0 = typedArrayObtainStyledAttributes.getResourceId(OooOOOO.MenuGroup_android_id, 0);
                    oooO0O0.f330OooO0OO = typedArrayObtainStyledAttributes.getInt(OooOOOO.MenuGroup_android_menuCategory, 0);
                    oooO0O0.f331OooO0Oo = typedArrayObtainStyledAttributes.getInt(OooOOOO.MenuGroup_android_orderInCategory, 0);
                    oooO0O0.f333OooO0o0 = typedArrayObtainStyledAttributes.getInt(OooOOOO.MenuGroup_android_checkableBehavior, 0);
                    oooO0O0.f332OooO0o = typedArrayObtainStyledAttributes.getBoolean(OooOOOO.MenuGroup_android_visible, true);
                    oooO0O0.f334OooO0oO = typedArrayObtainStyledAttributes.getBoolean(OooOOOO.MenuGroup_android_enabled, true);
                    typedArrayObtainStyledAttributes.recycle();
                } else if (name3.equals("item")) {
                    o0000O0 o0000o0OooOOo0 = o0000O0.OooOOo0(OooOo.this.f322OooO0OO, attributeSet, OooOOOO.MenuItem);
                    oooO0O0.f327OooO = o0000o0OooOOo0.OooOOO0(OooOOOO.MenuItem_android_id, 0);
                    oooO0O0.f336OooOO0 = (o0000o0OooOOo0.OooOO0(OooOOOO.MenuItem_android_menuCategory, oooO0O0.f330OooO0OO) & bl.a) | (o0000o0OooOOo0.OooOO0(OooOOOO.MenuItem_android_orderInCategory, oooO0O0.f331OooO0Oo) & 65535);
                    oooO0O0.f337OooOO0O = o0000o0OooOOo0.OooOOOO(OooOOOO.MenuItem_android_title);
                    oooO0O0.f338OooOO0o = o0000o0OooOOo0.OooOOOO(OooOOOO.MenuItem_android_titleCondensed);
                    oooO0O0.f340OooOOO0 = o0000o0OooOOo0.OooOOO0(OooOOOO.MenuItem_android_icon, 0);
                    String strOooOOO = o0000o0OooOOo0.OooOOO(OooOOOO.MenuItem_android_alphabeticShortcut);
                    oooO0O0.f339OooOOO = strOooOOO == null ? (char) 0 : strOooOOO.charAt(0);
                    oooO0O0.f341OooOOOO = o0000o0OooOOo0.OooOO0(OooOOOO.MenuItem_alphabeticModifiers, 4096);
                    String strOooOOO2 = o0000o0OooOOo0.OooOOO(OooOOOO.MenuItem_android_numericShortcut);
                    oooO0O0.f342OooOOOo = strOooOOO2 == null ? (char) 0 : strOooOOO2.charAt(0);
                    oooO0O0.f344OooOOo0 = o0000o0OooOOo0.OooOO0(OooOOOO.MenuItem_numericModifiers, 4096);
                    int i = OooOOOO.MenuItem_android_checkable;
                    if (o0000o0OooOOo0.OooOOOo(i)) {
                        oooO0O0.f343OooOOo = o0000o0OooOOo0.OooO00o(i, false) ? 1 : 0;
                    } else {
                        oooO0O0.f343OooOOo = oooO0O0.f333OooO0o0;
                    }
                    oooO0O0.f345OooOOoo = o0000o0OooOOo0.OooO00o(OooOOOO.MenuItem_android_checked, false);
                    oooO0O0.f348OooOo00 = o0000o0OooOOo0.OooO00o(OooOOOO.MenuItem_android_visible, oooO0O0.f332OooO0o);
                    oooO0O0.f347OooOo0 = o0000o0OooOOo0.OooO00o(OooOOOO.MenuItem_android_enabled, oooO0O0.f334OooO0oO);
                    oooO0O0.f349OooOo0O = o0000o0OooOOo0.OooOO0(OooOOOO.MenuItem_showAsAction, -1);
                    oooO0O0.f352OooOoO0 = o0000o0OooOOo0.OooOOO(OooOOOO.MenuItem_android_onClick);
                    oooO0O0.f350OooOo0o = o0000o0OooOOo0.OooOOO0(OooOOOO.MenuItem_actionLayout, 0);
                    oooO0O0.f346OooOo = o0000o0OooOOo0.OooOOO(OooOOOO.MenuItem_actionViewClass);
                    String strOooOOO3 = o0000o0OooOOo0.OooOOO(OooOOOO.MenuItem_actionProviderClass);
                    boolean z3 = strOooOOO3 != null;
                    if (z3 && oooO0O0.f350OooOo0o == 0 && oooO0O0.f346OooOo == null) {
                        oooO0O0.f351OooOoO = (o000O0O0.OooO00o) oooO0O0.OooO0O0(strOooOOO3, f318OooO0o, OooOo.this.f321OooO0O0);
                    } else {
                        if (z3) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        oooO0O0.f351OooOoO = null;
                    }
                    oooO0O0.f353OooOoOO = o0000o0OooOOo0.OooOOOO(OooOOOO.MenuItem_contentDescription);
                    oooO0O0.f355OooOoo0 = o0000o0OooOOo0.OooOOOO(OooOOOO.MenuItem_tooltipText);
                    int i2 = OooOOOO.MenuItem_iconTintMode;
                    if (o0000o0OooOOo0.OooOOOo(i2)) {
                        oooO0O0.f356OooOooO = o0ooOOo.OooO0Oo(o0000o0OooOOo0.OooOO0(i2, -1), oooO0O0.f356OooOooO);
                    } else {
                        oooO0O0.f356OooOooO = null;
                    }
                    int i3 = OooOOOO.MenuItem_iconTint;
                    if (o0000o0OooOOo0.OooOOOo(i3)) {
                        oooO0O0.f354OooOoo = o0000o0OooOOo0.OooO0OO(i3);
                    } else {
                        oooO0O0.f354OooOoo = null;
                    }
                    o0000o0OooOOo0.OooOOoo();
                    oooO0O0.f335OooO0oo = false;
                } else if (name3.equals("menu")) {
                    OooO0O0(xmlPullParser, attributeSet, oooO0O0.OooO00o());
                } else {
                    z2 = true;
                    str = name3;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(@LayoutRes int i, Menu menu) {
        if (!(menu instanceof o000O0O.OooO00o)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f322OooO0OO.getResources().getLayout(i);
                    OooO0O0(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (XmlPullParserException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
