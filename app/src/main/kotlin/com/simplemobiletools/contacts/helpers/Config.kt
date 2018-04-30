package com.simplemobiletools.contacts.helpers

import android.content.Context
import com.simplemobiletools.commons.helpers.BaseConfig

class Config(context: Context) : BaseConfig(context) {
    companion object {
        fun newInstance(context: Context) = Config(context)
    }

    var displayContactSources: HashSet<String>
        get() = prefs.getStringSet(DISPLAY_CONTACT_SOURCES, hashSetOf("-1")) as HashSet
        set(displayContactSources) = prefs.edit().remove(DISPLAY_CONTACT_SOURCES).putStringSet(DISPLAY_CONTACT_SOURCES, displayContactSources).apply()

    var showContactThumbnails: Boolean
        get() = prefs.getBoolean(SHOW_CONTACT_THUMBNAILS, true)
        set(showContactThumbnails) = prefs.edit().putBoolean(SHOW_CONTACT_THUMBNAILS, showContactThumbnails).apply()

    var showPhoneNumbers: Boolean
        get() = prefs.getBoolean(SHOW_PHONE_NUMBERS, false)
        set(showPhoneNumbers) = prefs.edit().putBoolean(SHOW_PHONE_NUMBERS, showPhoneNumbers).apply()

    var startNameWithSurname: Boolean
        get() = prefs.getBoolean(START_NAME_WITH_SURNAME, false)
        set(startNameWithSurname) = prefs.edit().putBoolean(START_NAME_WITH_SURNAME, startNameWithSurname).apply()

    var lastUsedContactSource: String
        get() = prefs.getString(LAST_USED_CONTACT_SOURCE, "")
        set(lastUsedContactSource) = prefs.edit().putString(LAST_USED_CONTACT_SOURCE, lastUsedContactSource).apply()

    var localAccountName: String
        get() = prefs.getString(LOCAL_ACCOUNT_NAME, "-1")
        set(localAccountName) = prefs.edit().putString(LOCAL_ACCOUNT_NAME, localAccountName).apply()

    var localAccountType: String
        get() = prefs.getString(LOCAL_ACCOUNT_TYPE, "-1")
        set(localAccountType) = prefs.edit().putString(LOCAL_ACCOUNT_TYPE, localAccountType).apply()

    var onContactClick: Int
        get() = prefs.getInt(ON_CONTACT_CLICK, ON_CLICK_VIEW_CONTACT)
        set(onContactClick) = prefs.edit().putInt(ON_CONTACT_CLICK, onContactClick).apply()

    var showContactFields: Int
        get() = prefs.getInt(SHOW_CONTACT_FIELDS, SHOW_FIRST_NAME_FIELD or SHOW_SURNAME_FIELD or SHOW_PHONE_NUMBERS_FIELD or SHOW_EMAILS_FIELD or
                SHOW_ADDRESSES_FIELD or SHOW_EVENTS_FIELD or SHOW_NOTES_FIELD or SHOW_GROUPS_FIELD or SHOW_CONTACT_SOURCE_FIELD)
        set(showContactFields) = prefs.edit().putInt(SHOW_CONTACT_FIELDS, showContactFields).apply()
}
