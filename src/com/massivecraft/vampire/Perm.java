package com.massivecraft.vampire;

import com.massivecraft.massivecore.Identified;
import com.massivecraft.massivecore.util.PermissionUtil;
import org.bukkit.permissions.Permissible;

public enum Perm implements Identified
{
	// -------------------------------------------- //
	// ENUM
	// -------------------------------------------- //
	
	BASECOMMAND,
	
	SHOW,
	SHOW_OTHER,
	SHRIEK,
	MODE_BLOODLUST,
	MODE_INTENT,
	MODE_NIGHTVISION,
	TRADE_OFFER,
	TRADE_ACCEPT,
	FLASK,
	COMBAT_INFECT,
	COMBAT_CONTRACT,
	LIST,
	SET,
	SET_VAMPIRE_TRUE,
	SET_VAMPIRE_FALSE,
	SET_INFECTION,
	SET_FOOD,
	SET_HEALTH,
	VERSION,
	
	ALTAR_DARK,
	ALTAR_LIGHT,
	
	IS_VAMPIRE,
	IS_HUMAN,
	
	CONFIG,
	LANG,
	
	// END OF LIST
	;
	
	// -------------------------------------------- //
	// FIELDS
	// -------------------------------------------- //
	
	private final String id;
	@Override public String getId() { return this.id; }
	
	// -------------------------------------------- //
	// CONSTRUCT
	// -------------------------------------------- //
	
	Perm()
	{
		this.id = PermissionUtil.createPermissionId(Vampire.get(), this);
	}
	
	// -------------------------------------------- //
	// HAS
	// -------------------------------------------- //
	
	public boolean has(Permissible permissible, boolean verboose)
	{
		return PermissionUtil.hasPermission(permissible, this, verboose);
	}
	
	public boolean has(Permissible permissible)
	{
		return PermissionUtil.hasPermission(permissible, this);
	}
	
}
