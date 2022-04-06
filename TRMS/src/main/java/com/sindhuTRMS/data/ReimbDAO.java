package com.sindhuTRMS.data;

import java.util.List;

import com.sindhuTRMS.models.Reimb;
//import com.sindhuTRMS.models.User;

// we can set the generic's type here since we are inheriting it
// i've set it to Pet so a class that implements this interface will
// have the types as Pet
public interface ReimbDAO extends GenericDAO<Reimb> {
	
}
