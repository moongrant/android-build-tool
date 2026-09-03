package p092o000o0O;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p042Ooooo0o.o000O0Oo;
import p086o000OooO.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f29241OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<String, OooO00o> f29242OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Set<OooO0O0> f29243OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final Set<OooO0o> f29244OooO0Oo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f29245OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f29246OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @ColumnInfo.SQLiteTypeAffinity
        public final int f29247OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f29248OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final String f29249OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f29250OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f29251OooO0oO;

        public OooO00o(String str, String str2, boolean z, int i, String str3, int i2) {
            this.f29245OooO00o = str;
            this.f29246OooO0O0 = str2;
            this.f29248OooO0Oo = z;
            this.f29250OooO0o0 = i;
            int i3 = 5;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    i3 = 3;
                } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                    i3 = 2;
                } else if (!upperCase.contains("BLOB")) {
                    i3 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                }
            }
            this.f29247OooO0OO = i3;
            this.f29249OooO0o = str3;
            this.f29251OooO0oO = i2;
        }

        public static boolean OooO00o(@NonNull String str, @Nullable String str2) {
            boolean z;
            if (str2 == null) {
                return false;
            }
            if (str.equals(str2)) {
                return true;
            }
            if (str.length() != 0) {
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i >= str.length()) {
                        if (i2 == 0) {
                            z = true;
                            break;
                        }
                    } else {
                        char cCharAt = str.charAt(i);
                        if (i != 0 || cCharAt == '(') {
                            if (cCharAt == '(') {
                                i2++;
                            } else if (cCharAt != ')' || (i2 = i2 - 1) != 0 || i == str.length() - 1) {
                            }
                            i++;
                        }
                    }
                    z = false;
                    break;
                }
            }
            z = false;
            break;
            if (z) {
                return str.substring(1, str.length() - 1).trim().equals(str2);
            }
            return false;
        }

        public final boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            if (this.f29250OooO0o0 != oooO00o.f29250OooO0o0 || !this.f29245OooO00o.equals(oooO00o.f29245OooO00o) || this.f29248OooO0Oo != oooO00o.f29248OooO0Oo) {
                return false;
            }
            if (this.f29251OooO0oO == 1 && oooO00o.f29251OooO0oO == 2 && (str3 = this.f29249OooO0o) != null && !OooO00o(str3, oooO00o.f29249OooO0o)) {
                return false;
            }
            if (this.f29251OooO0oO == 2 && oooO00o.f29251OooO0oO == 1 && (str2 = oooO00o.f29249OooO0o) != null && !OooO00o(str2, this.f29249OooO0o)) {
                return false;
            }
            int i = this.f29251OooO0oO;
            return (i == 0 || i != oooO00o.f29251OooO0oO || ((str = this.f29249OooO0o) == null ? oooO00o.f29249OooO0o == null : OooO00o(str, oooO00o.f29249OooO0o))) && this.f29247OooO0OO == oooO00o.f29247OooO0OO;
        }

        public final int hashCode() {
            return (((((this.f29245OooO00o.hashCode() * 31) + this.f29247OooO0OO) * 31) + (this.f29248OooO0Oo ? 1231 : 1237)) * 31) + this.f29250OooO0o0;
        }

        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Column{name='");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.f29245OooO00o, '\'', ", type='");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.f29246OooO0O0, '\'', ", affinity='");
            sbOooO0o0.append(this.f29247OooO0OO);
            sbOooO0o0.append('\'');
            sbOooO0o0.append(", notNull=");
            sbOooO0o0.append(this.f29248OooO0Oo);
            sbOooO0o0.append(", primaryKeyPosition=");
            sbOooO0o0.append(this.f29250OooO0o0);
            sbOooO0o0.append(", defaultValue='");
            return kotlin.reflect.jvm.internal.impl.builtins.OooO00o.OooO00o(sbOooO0o0, this.f29249OooO0o, '\'', '}');
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final String f29252OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NonNull
        public final String f29253OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NonNull
        public final String f29254OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NonNull
        public final List<String> f29255OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NonNull
        public final List<String> f29256OooO0o0;

        public OooO0O0(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull List<String> list, @NonNull List<String> list2) {
            this.f29252OooO00o = str;
            this.f29253OooO0O0 = str2;
            this.f29254OooO0OO = str3;
            this.f29255OooO0Oo = Collections.unmodifiableList(list);
            this.f29256OooO0o0 = Collections.unmodifiableList(list2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            if (this.f29252OooO00o.equals(oooO0O0.f29252OooO00o) && this.f29253OooO0O0.equals(oooO0O0.f29253OooO0O0) && this.f29254OooO0OO.equals(oooO0O0.f29254OooO0OO) && this.f29255OooO0Oo.equals(oooO0O0.f29255OooO0Oo)) {
                return this.f29256OooO0o0.equals(oooO0O0.f29256OooO0o0);
            }
            return false;
        }

        public final int hashCode() {
            return this.f29256OooO0o0.hashCode() + ((this.f29255OooO0Oo.hashCode() + o0O0O00.OooO00o(this.f29254OooO0OO, o0O0O00.OooO00o(this.f29253OooO0O0, this.f29252OooO00o.hashCode() * 31, 31), 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ForeignKey{referenceTable='");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.f29252OooO00o, '\'', ", onDelete='");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.f29253OooO0O0, '\'', ", onUpdate='");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.f29254OooO0OO, '\'', ", columnNames=");
            sbOooO0o0.append(this.f29255OooO0Oo);
            sbOooO0o0.append(", referenceColumnNames=");
            return o000O0Oo.OooO00o(sbOooO0o0, this.f29256OooO0o0, '}');
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class OooO0OO implements Comparable<OooO0OO> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final String f29257Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final int f29258Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final int f29259Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final String f29260Oooo0oo;

        public OooO0OO(int i, int i2, String str, String str2) {
            this.f29258Oooo0o = i;
            this.f29259Oooo0oO = i2;
            this.f29260Oooo0oo = str;
            this.f29257Oooo = str2;
        }

        @Override // java.lang.Comparable
        public final int compareTo(@NonNull OooO0OO oooO0OO) {
            OooO0OO oooO0OO2 = oooO0OO;
            int i = this.f29258Oooo0o - oooO0OO2.f29258Oooo0o;
            return i == 0 ? this.f29259Oooo0oO - oooO0OO2.f29259Oooo0oO : i;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f29261OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f29262OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final List<String> f29263OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final List<String> f29264OooO0Oo;

        public OooO0o(String str, boolean z, List<String> list, List<String> list2) {
            this.f29261OooO00o = str;
            this.f29262OooO0O0 = z;
            this.f29263OooO0OO = list;
            this.f29264OooO0Oo = (list2 == null || list2.size() == 0) ? Collections.nCopies(list.size(), Index.Order.ASC.name()) : list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0o)) {
                return false;
            }
            OooO0o oooO0o = (OooO0o) obj;
            if (this.f29262OooO0O0 == oooO0o.f29262OooO0O0 && this.f29263OooO0OO.equals(oooO0o.f29263OooO0OO) && this.f29264OooO0Oo.equals(oooO0o.f29264OooO0Oo)) {
                return this.f29261OooO00o.startsWith("index_") ? oooO0o.f29261OooO00o.startsWith("index_") : this.f29261OooO00o.equals(oooO0o.f29261OooO00o);
            }
            return false;
        }

        public final int hashCode() {
            return this.f29264OooO0Oo.hashCode() + ((this.f29263OooO0OO.hashCode() + ((((this.f29261OooO00o.startsWith("index_") ? -1184239155 : this.f29261OooO00o.hashCode()) * 31) + (this.f29262OooO0O0 ? 1 : 0)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Index{name='");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.f29261OooO00o, '\'', ", unique=");
            sbOooO0o0.append(this.f29262OooO0O0);
            sbOooO0o0.append(", columns=");
            sbOooO0o0.append(this.f29263OooO0OO);
            sbOooO0o0.append(", orders=");
            return o000O0Oo.OooO00o(sbOooO0o0, this.f29264OooO0Oo, '}');
        }
    }

    public o00Ooo(String str, Map<String, OooO00o> map, Set<OooO0O0> set, Set<OooO0o> set2) {
        this.f29241OooO00o = str;
        this.f29242OooO0O0 = Collections.unmodifiableMap(map);
        this.f29243OooO0OO = Collections.unmodifiableSet(set);
        this.f29244OooO0Oo = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static o00Ooo OooO00o(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        List<OooO0OO> list;
        int i;
        Cursor cursorQuery = supportSQLiteDatabase.query("PRAGMA table_info(`" + str + "`)");
        HashMap map = new HashMap();
        try {
            if (cursorQuery.getColumnCount() > 0) {
                int columnIndex = cursorQuery.getColumnIndex("name");
                int columnIndex2 = cursorQuery.getColumnIndex("type");
                int columnIndex3 = cursorQuery.getColumnIndex("notnull");
                int columnIndex4 = cursorQuery.getColumnIndex("pk");
                int columnIndex5 = cursorQuery.getColumnIndex("dflt_value");
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(columnIndex);
                    map.put(string, new OooO00o(string, cursorQuery.getString(columnIndex2), cursorQuery.getInt(columnIndex3) != 0, cursorQuery.getInt(columnIndex4), cursorQuery.getString(columnIndex5), 2));
                }
            }
            cursorQuery.close();
            HashSet hashSet = new HashSet();
            Cursor cursorQuery2 = supportSQLiteDatabase.query("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = cursorQuery2.getColumnIndex("id");
                int columnIndex7 = cursorQuery2.getColumnIndex("seq");
                int columnIndex8 = cursorQuery2.getColumnIndex("table");
                int columnIndex9 = cursorQuery2.getColumnIndex("on_delete");
                int columnIndex10 = cursorQuery2.getColumnIndex("on_update");
                List<OooO0OO> listOooO0O0 = OooO0O0(cursorQuery2);
                int count = cursorQuery2.getCount();
                int i2 = 0;
                while (i2 < count) {
                    cursorQuery2.moveToPosition(i2);
                    if (cursorQuery2.getInt(columnIndex7) != 0) {
                        list = listOooO0O0;
                        i = count;
                    } else {
                        int i3 = cursorQuery2.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (OooO0OO oooO0OO : (ArrayList) listOooO0O0) {
                            List<OooO0OO> list2 = listOooO0O0;
                            int i4 = count;
                            if (oooO0OO.f29258Oooo0o == i3) {
                                arrayList.add(oooO0OO.f29260Oooo0oo);
                                arrayList2.add(oooO0OO.f29257Oooo);
                            }
                            count = i4;
                            listOooO0O0 = list2;
                        }
                        list = listOooO0O0;
                        i = count;
                        hashSet.add(new OooO0O0(cursorQuery2.getString(columnIndex8), cursorQuery2.getString(columnIndex9), cursorQuery2.getString(columnIndex10), arrayList, arrayList2));
                    }
                    i2++;
                    columnIndex6 = columnIndex6;
                    columnIndex7 = columnIndex7;
                    count = i;
                    listOooO0O0 = list;
                }
                cursorQuery2.close();
                Cursor cursorQuery3 = supportSQLiteDatabase.query("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = cursorQuery3.getColumnIndex("name");
                    int columnIndex12 = cursorQuery3.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
                    int columnIndex13 = cursorQuery3.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1) {
                        cursorQuery3.close();
                        break;
                    }
                    HashSet hashSet3 = new HashSet();
                    while (true) {
                        if (!cursorQuery3.moveToNext()) {
                            cursorQuery3.close();
                            hashSet2 = hashSet3;
                            break;
                        }
                        if (ak.aF.equals(cursorQuery3.getString(columnIndex12))) {
                            OooO0o oooO0oOooO0OO = OooO0OO(supportSQLiteDatabase, cursorQuery3.getString(columnIndex11), cursorQuery3.getInt(columnIndex13) == 1);
                            if (oooO0oOooO0OO == null) {
                                cursorQuery3.close();
                                break;
                            }
                            hashSet3.add(oooO0oOooO0OO);
                        }
                    }
                    return new o00Ooo(str, map, hashSet, hashSet2);
                } catch (Throwable th) {
                    cursorQuery3.close();
                    throw th;
                }
            } catch (Throwable th2) {
                cursorQuery2.close();
                throw th2;
            }
        } catch (Throwable th3) {
            cursorQuery.close();
            throw th3;
        }
    }

    public static List<OooO0OO> OooO0O0(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new OooO0OO(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    @Nullable
    public static OooO0o OooO0OO(SupportSQLiteDatabase supportSQLiteDatabase, String str, boolean z) {
        Cursor cursorQuery = supportSQLiteDatabase.query("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorQuery.getColumnIndex("seqno");
            int columnIndex2 = cursorQuery.getColumnIndex("cid");
            int columnIndex3 = cursorQuery.getColumnIndex("name");
            int columnIndex4 = cursorQuery.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorQuery.moveToNext()) {
                    if (cursorQuery.getInt(columnIndex2) >= 0) {
                        int i = cursorQuery.getInt(columnIndex);
                        String string = cursorQuery.getString(columnIndex3);
                        String str2 = cursorQuery.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        treeMap.put(Integer.valueOf(i), string);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                ArrayList arrayList2 = new ArrayList(treeMap2.size());
                arrayList2.addAll(treeMap2.values());
                return new OooO0o(str, z, arrayList, arrayList2);
            }
            return null;
        } finally {
            cursorQuery.close();
        }
    }

    public final boolean equals(Object obj) {
        Set<OooO0o> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00Ooo)) {
            return false;
        }
        o00Ooo o00ooo2 = (o00Ooo) obj;
        String str = this.f29241OooO00o;
        if (str == null ? o00ooo2.f29241OooO00o != null : !str.equals(o00ooo2.f29241OooO00o)) {
            return false;
        }
        Map<String, OooO00o> map = this.f29242OooO0O0;
        if (map == null ? o00ooo2.f29242OooO0O0 != null : !map.equals(o00ooo2.f29242OooO0O0)) {
            return false;
        }
        Set<OooO0O0> set2 = this.f29243OooO0OO;
        if (set2 == null ? o00ooo2.f29243OooO0OO != null : !set2.equals(o00ooo2.f29243OooO0OO)) {
            return false;
        }
        Set<OooO0o> set3 = this.f29244OooO0Oo;
        if (set3 == null || (set = o00ooo2.f29244OooO0Oo) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public final int hashCode() {
        String str = this.f29241OooO00o;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, OooO00o> map = this.f29242OooO0O0;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<OooO0O0> set = this.f29243OooO0OO;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("TableInfo{name='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.f29241OooO00o, '\'', ", columns=");
        sbOooO0o0.append(this.f29242OooO0O0);
        sbOooO0o0.append(", foreignKeys=");
        sbOooO0o0.append(this.f29243OooO0OO);
        sbOooO0o0.append(", indices=");
        sbOooO0o0.append(this.f29244OooO0Oo);
        sbOooO0o0.append('}');
        return sbOooO0o0.toString();
    }
}
